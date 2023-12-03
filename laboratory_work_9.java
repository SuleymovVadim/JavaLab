import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class laboratory_work_9
{

    public static void main(String[] args)
    {
        try
        {
            //Получение класса по его имени
            Class<?> clazz = Class.forName("java.lang.String");

            //Получение конструктора, который принимает строку
            Constructor<?> constructor = clazz.getConstructor(String.class);

            //Создание нового экземпляра класса с некоторым текстом
            Object instance = constructor.newInstance("hello java");

            //Получение метода по его имени
            Method method = clazz.getMethod("toUpperCase");

            //Вызов метода
            Object result = method.invoke(instance);

            System.out.println(result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}