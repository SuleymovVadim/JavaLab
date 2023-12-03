public class laboratory_work_4
{
    public static void main(String[] args)
    {
        int num = 2;
        char option = 'B';
        String day = "Среда";

        System.out.println("Тип Int:");

        switch(num)
        {
            case 1:
                System.out.println("Выбрано число 1");
                break;
            case 2:
                System.out.println("Выбрано число 2");
                break;
            case 3:
                System.out.println("Выбрано число 3");
                break;
            default:
                System.out.println("Выбрано другое число");
        }

        System.out.println("Тип Char:");

        switch(option)
        {
            case 'A':
                System.out.println("Выбран вариант A");
                break;
            case 'B':
                System.out.println("Выбран вариант B");
                break;
            default:
                System.out.println("Выбран другой вариант");
        }

        System.out.println("Тип String:");

        switch(day)
        {
            case "Понедельник":
                System.out.println("Сегодня понедельник");
                break;
            case "Вторник":
                System.out.println("Сегодня вторник");
                break;
            case "Среда":
                System.out.println("Сегодня среда");
                break;
            case "Четвег":
                System.out.println("Сегодня четверг");
                break;
            default:
                System.out.println("Другой день недели");
        }
    }
}