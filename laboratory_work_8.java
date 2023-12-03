import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class laboratory_work_8
{
    public class TestClass
    {
        private int value;
        public TestClass(int value) {this.value = value;}
        public int getValue() {return value;}
        public void setValue(int value) {this.value = value;}
        public int doubleValue() {return value * 2;}
    }
    public static void printClassInfo(Class<?> clazz)
    {
        System.out.println("Имя класса: " + clazz.getName());
        System.out.println("Модификаторы класса: " + clazz.getModifiers());

        System.out.println("\nПоля:");
        for (Field field : clazz.getDeclaredFields())
        {
            System.out.println(field);
        }

        System.out.println("\nКонструкторы:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors())
        {
            System.out.println(constructor);
        }

        System.out.println("\nМетоды:");
        for (Method method : clazz.getDeclaredMethods())
        {
            System.out.println(method);
        }
    }

    public static void main(String[] args)
    {
        printClassInfo(TestClass.class);
    }
}