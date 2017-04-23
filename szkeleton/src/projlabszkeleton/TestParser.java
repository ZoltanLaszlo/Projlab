package projlabszkeleton;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.HashMap;

/**
 * Created by Zotya-MAC on 2017. 04. 17..
 */
public class TestParser {

    private String classPath = "";
    private HashMap<String, Object> objects = new HashMap<>();


    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public String getClassPath() {
        return classPath;
    }

    public TestParser() {}
    public TestParser(String classPath) {
        this.classPath = classPath;
    }

    public HashMap<String, Object> getObjects() {
        return objects;
    }


    /**
     * Command signature is:
     * command   0: create or method name
     * command  01: object type for creation
     * command 012: object name for creation
     * command  02: object name for method call
     * command 021: single parameter for method call (optional)
     * @param cmd
     */
    public void parseCommand(String cmd) throws ParseException, IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String[] commands = cmd.split("\\s+");

        // Object creation
        if (commands[0].toLowerCase().equals("create")) {
            if (commands.length < 3)
                throw new ParseException("Not enough parameters for object creation", 1);
            if (commands.length == 3)
                createTestObject(commands[2], commands[1]);
            else {
                String[] params = new String[commands.length-3];
                System.arraycopy(commands, 3, params, 0, commands.length-3);
                createTestObject(commands[2], commands[1], params);
            }
        }
        // Method call
        else {
            if (commands.length < 2)
                throw new ParseException("Not enough command", 1);
            else if (commands.length == 2)
                callMethod(commands[0], commands[1], null);
            else if (commands.length == 3)
                callMethod(commands[0], commands[1], commands[2]);

        }
    }


    private void createTestObject(String name, String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        Class<?> objectType = Class.forName(classPath+"."+type);
        if (objectType == null)
            throw new ClassNotFoundException();
        objects.put(name, objectType.newInstance());
    }

    private void createTestObject(String name, String type, String[] params) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        Class<?> objectType = Class.forName(classPath+"."+type);
        if (objectType == null)
            throw new ClassNotFoundException();
        if (params.length == 1) {
            objects.put(name, construct(objectType, params[0], getPossibleTypes(params[0])));

        } else if (params.length == 2) {
            objects.put(name, construct(objectType, params[0], getPossibleTypes(params[0]), params[1], getPossibleTypes(params[1]) ));

        } else if (params.length == 3) {
            objects.put(name, construct(objectType, params[0], getPossibleTypes(params[0]), params[1], getPossibleTypes(params[1]), params[2], getPossibleTypes(params[2]) ));
        }
    }

    private void callMethod(String methodName, String objectName, String param) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object object = objects.get(objectName);

        if (param != null) {
            Object parameterObject = objects.get(param);
            if (parameterObject != null) {
                Method method = getMethod(object, methodName, parameterObject.getClass());
                if (method == null)
                	throw new NoSuchMethodException(methodName);
                method.invoke(object, parameterObject);
            } else {
                Method method = getBestMatchingMethod(object, methodName, getPossibleTypes(param));
                Object value = getValue(param, method.getParameterTypes()[0]);
                method.invoke(object, value);
            }
        }
        else {
            Method method = object.getClass().getMethod(methodName);
            method.invoke(object);
        }

    }
    
    private Method getMethod(Object o, String methodName, Class<?> parameterClass) {
    	if (parameterClass == null)
    		return null;
    	Method method = null;
    	
    	try {
			method = o.getClass().getMethod(methodName, parameterClass);
		} catch (NoSuchMethodException e) {
			method = getMethod(o, methodName, parameterClass.getSuperclass());
		}
    	
    	return method;
    }

    /**
     * Get the best matching method.
     * @param o
     * The object.
     * @param methodName
     * The name of o object's method
     * @param parameterClasses
     * The possible matching parameter types for the method.
     * @return
     * The best matching method if exist.
     * @throws NoSuchMethodException
     * If the method is not exist.
     */
    private Method getBestMatchingMethod(Object o, String methodName, Class<?>[] parameterClasses) throws NoSuchMethodException {
        Method method = null;

        for (Class<?> c : parameterClasses) {
            method = getMethod(o, methodName, c);
            if (method != null)
                break;
        }
        if (method == null)
            throw new NoSuchMethodException("No Such Method: " + methodName);
        return method;
    }

    private Object construct(Class<?> objectClass, String param, Class<?>[] parameterClasses) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> ctor = null;
        boolean hasMatch;

        for (Class<?> c : parameterClasses) {
            hasMatch = true;
            try {
                ctor = objectClass.getConstructor(c);
            } catch (NoSuchMethodException e) {
                hasMatch = false;
            }
            if (hasMatch) {
                return ctor.newInstance(getValue(param, c));
            }
        }
        if (ctor == null)
            throw new NoSuchMethodException("No Such Constructor for: " + objectClass.getName());
        return null;
    }

    private Object construct(Class<?> objectClass, String param1, Class<?>[] parameterClasses1,
                                                   String param2, Class<?>[] parameterClasses2) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> ctor = null;
        boolean hasMatch;

        for (Class<?> c1 : parameterClasses1) {
            for (Class<?> c2 : parameterClasses2) {
                hasMatch = true;
                try {
                    ctor = objectClass.getConstructor(c1, c2);
                } catch (NoSuchMethodException e) {
                    hasMatch = false;
                }
                if (hasMatch) {
                    return ctor.newInstance(getValue(param1, c1), getValue(param2, c2));
                }
            }
        }
        if (ctor == null)
            throw new NoSuchMethodException("No Such Constructor for: " + objectClass.getName());
        return null;
    }

    private Object construct(Class<?> objectClass, String param1, Class<?>[] parameterClasses1,
                             String param2, Class<?>[] parameterClasses2, String param3, Class<?>[] parameterClasses3) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> ctor = null;
        boolean hasMatch;

        for (Class<?> c1 : parameterClasses1) {
            for (Class<?> c2 : parameterClasses2) {
                for (Class<?> c3 : parameterClasses3) {
                    hasMatch = true;
                    try {
                        ctor = objectClass.getConstructor(c1, c2, c3);
                    } catch (NoSuchMethodException e) {
                        hasMatch = false;
                    }
                    if (hasMatch) {
                        return ctor.newInstance(getValue(param1, c1), getValue(param2, c2), getValue(param3, c3));
                    }
                }
            }
        }
        if (ctor == null)
            throw new NoSuchMethodException("No Such Constructor for: " + objectClass.getName());
        return null;
    }

    /**
     * Get the possible primitive types.
     * @param str
     * String to parse.
     * @return
     * The possible types.
     */
    private Class<?>[] getPossibleTypes(String str) {
        // long, integer or short value
        if (str.matches("\\d+")) {
            Long value = Long.parseLong(str);

            if (value <= Short.MAX_VALUE) {
                return new Class[] {short.class, Short.class, int.class, Integer.class, long.class, Long.class};
            }
            else if (value <= Integer.MAX_VALUE) {
                return new Class[] {int.class, Integer.class, long.class, Long.class};
            }
            else {
                return new Class[] {long.class, Long.class};
            }
        }
        // double or float value
        else if (str.contains(".") || str.contains(",")) {
            Double value = Double.parseDouble(str);
            if (value <= Float.MAX_VALUE) {
                if (value.equals( (double)(value.floatValue()) ) ) {
                    return new Class[] {float.class, Float.class, double.class, Double.class};
                }
                else
                    return new Class[] {double.class, Double.class};
            }
            else
                return new Class[] {double.class, Double.class};
        }
        // boolean value
        else if (str.equals("true") || str.equals("false")) {
            return new Class[] {boolean.class, Boolean.class};

        }
        else if (str.toLowerCase().equals("piros") || str.toLowerCase().equals("zöld") || str.toLowerCase().equals("zold")) {
            return new Class[] {Color.class};
        }
        // String
        else
            return new Class[] {String.class};
    }

    private Object getValue(String param, Class<?> type) {
        if (type.equals(long.class) || type.equals(Long.class) || type.equals(int.class) ||
                type.equals(Integer.class) || type.equals(short.class) || type.equals(Short.class)) {

            Long value = Long.parseLong(param);

            if (type.equals(long.class))
                return value.longValue();
            if (type.equals(Long.class))
                return value;
            if (type.equals(int.class))
                return value.intValue();
            if (type.equals(Integer.class))
                return new Integer(value.intValue());
            if (type.equals(short.class))
                return value.shortValue();
            if (type.equals(Short.class))
                return new Short(value.shortValue());

        }
        else if(type.equals(double.class) || type.equals(Double.class) ||
                type.equals(float.class) || type.equals(Float.class)) {

            Double value = Double.parseDouble(param);

            if (type.equals(double.class))
                return value.doubleValue();
            if (type.equals(Double.class))
                return value;
            if (type.equals(float.class))
                return value.floatValue();
            if (type.equals(Float.class))
                return new Float(value.floatValue());
        }
        else if (type.equals(boolean.class) || type.equals(Boolean.class)) {
            Boolean value = Boolean.parseBoolean(param);
            if (type.equals(boolean.class))
                return value.booleanValue();
            else
                return value;
        }
        else if (type.equals(Color.class)) {
            if (param.toLowerCase().equals("piros"))
                return Color.RED;
            if (param.toLowerCase().equals("zöld") || param.toLowerCase().equals("zold"))
                return Color.GREEN;
        }

        return param;
    }

}
