package 反射.反射与简单Java类;
//操作简单类属性设置的工具类
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class BeanUtil {
    private BeanUtil() {
    }
    //actionObj拿到提供给用户使用的XXAction类
//beanValue要设置的具体值
    //emp.name:dange|emp.job:Coder
    public static void setBeanValue(Object actionObject, String msg) {
        //1.字符串拆分
        String[] result = msg.split ( "\\|" );
        for (int i = 0; i < result.length; i++) {
            String[] temp = result[i].split ( ":" );
            String attribute = temp[0];
            String value = result[1];
            String[] fields = attribute.split ( "\\." );
            Object currentObject = null;
            try {
                currentObject = getObject ( actionObject, fields[0] );
            } catch (InvocationTargetException e) {
                e.printStackTrace ( );
            } catch (IllegalAccessException e) {
                e.printStackTrace ( );
            }
            try {
                setObjectValue ( currentObject, fields[1], temp[1] );
            } catch (NoSuchFieldException e) {
                e.printStackTrace ( );
            } catch (NoSuchMethodException e) {
                e.printStackTrace ( );
            } catch (InvocationTargetException e) {
                e.printStackTrace ( );
            } catch (IllegalAccessException e) {
                e.printStackTrace ( );
            }
        }
    }

    private static String initCap(String str) {
        return str.substring ( 0, 1 ).toUpperCase ( ) + str.substring ( 1 );
    }

    //根据Xxaction类取得真正操作的主题类Emp
    //通过反射调用getEmp()
    private static Object getObject(Object obj, String attribute) throws InvocationTargetException, IllegalAccessException {
        //方法名
        String methodName = "get" + initCap ( attribute );
        Field field = null;
        try {
            field = obj.getClass ( ).getDeclaredField ( attribute );
        } catch (NoSuchFieldException e) {
            e.printStackTrace ( );
        }
        if (field == null) {
            try {
                field = obj.getClass ( ).getDeclaredField ( attribute );
            } catch (NoSuchFieldException e) {
                e.printStackTrace ( );
            }
        }
        if (field == null) {
            return null;
        }
        Method method = null;
        try {
            method = obj.getClass ( ).getMethod ( methodName );
        } catch (NoSuchMethodException e) {
            e.printStackTrace ( );
        }
        try {
            return method.invoke ( obj );
        } catch (IllegalAccessException e) {
            e.printStackTrace ( );
        } catch (InvocationTargetException e) {
            e.printStackTrace ( );
        }
        return method.invoke ( obj );
    }


    public static void setObjectValue(Object obj, String attribute, String value) throws NoSuchFieldException,
            NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Field field = obj.getClass ( ).getDeclaredField ( attribute );
        if (field == null) {
            field = obj.getClass ( ).getField ( attribute );
        }
        if (field == null) {
            return;
        }
        String methodName = "set" + initCap ( attribute );
        Method setMethod = obj.getClass ( ).getMethod ( methodName, field.getType ( ) );
        setMethod.invoke ( obj, value );
    }
}