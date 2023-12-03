public class laboratory_work_1
{
    public static void main(String[] args)
    {
        String str1 = "Hello, World!";
        String str2 = "Hello, Java";

        // Длина строки
        System.out.println("Длина строки 1: " + str1.length());
        System.out.println("Длина строки 2: " + str2.length());

        // Объединение элементов в строку
        System.out.println("Объединение элементов в строку: " + String.join(" ", "Hello", "World","and","Java","!"));

        // Получение символа по индексу
        System.out.println("Символ по индексу 4: " + str1.charAt(4));

        // Получение подстроки
        System.out.println("Подстрока от 7 до 12: " + str1.substring(7, 12));

        // Проверка наличия подстроки
        System.out.println("Содержит 'World'?: " + str1.contains("World"));
        System.out.println("Содержит 'Java'?: " + str1.contains("Java"));

        // Получение индекса подстроки
        System.out.println("Индекс подстроки 'World': " + str1.indexOf("World"));

        // Замена символа
        System.out.println("Замена 'o' на 'a': " + str1.replace('o', 'a'));

        // Начинается ли строка с ...
        System.out.println("Начинается ли строка 1 с 'Hello': " + str1.startsWith("Hello"));
        System.out.println("Начинается ли строка 2 с 'Hello': " + str2.startsWith("Hello"));

        // Заканчивается ли строка ...
        System.out.println("Заканчивается ли строка 1 на '!': " + str1.endsWith("!"));
        System.out.println("Заканчивается ли строка 2 на '!': " + str2.endsWith("!"));

        // Сравнение строки с другой строкой
        System.out.println("Равна ли строка 1 со строкой 2: " + str1.equals(str2));

        // Проверка пуста ли строка
        System.out.println("Пуста ли строка 1?: " + str1.isEmpty());
        System.out.println("Пуста ли строка 2?: " + str2.isEmpty());

        // Объединение строк
        System.out.println("Объединение строк: " + str1.concat(str2));

        // Повторение строки
        System.out.println("Повторение строки: " + str1.repeat(2));

        // Разбиение строки
        String[] parts = str1.split(" ");
        System.out.println("Разбиение строки: ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}