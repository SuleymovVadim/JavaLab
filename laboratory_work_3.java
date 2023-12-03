public class laboratory_work_3
{
    public static void main(String[] args)
    {
        //Логические операции
        boolean a = true;
        boolean b = false;

        System.out.println("1.Логические операции");
        System.out.println("Результат &&: " + (a && b));
        System.out.println("Результат ||: " + (a || b));
        System.out.println("Результат !: " + (!a));

        //Тернарная операция
        System.out.println("2.Тернарная операция");
        //Используется как замена одного оператора if-then-else
        int x = 5;
        int y = 10;

        //Пример использования тернарной операции
        int result = (x < y) ? x : y;
        System.out.println("Результат тернарной операции: " + result);

        //Ее можно заменить следующей конструкцией
        int result_f;
        if(x<y)
        {
            result_f = x;
        }
        else
        {
            result_f = y;
        }
        System.out.println("Результат конструкции: " + result_f);


        //Поразрядные логические операции
        System.out.println("3.Поразрядные логические операции");
        int num1 = 10;
        int num2 = 5;

        int bitwiseAnd = num1 & num2;
        int bitwiseOr = num1 | num2;
        int bitwiseXor = num1 ^ num2;
        int bitwiseNotNum1 = ~num1;

        System.out.println("Поразрядное И: " + bitwiseAnd);
        System.out.println("Поразрядное ИЛИ: " + bitwiseOr);
        System.out.println("Поразрядное исключающее ИЛИ: " + bitwiseXor);
        System.out.println("Поразрядное отрицание для num1: " + bitwiseNotNum1);

        //Операции сдвига
        System.out.println("4.Операции сдвига");

        int num3 = 16;

        int rightShift = num3 >> 2;
        int leftShift = num3 << 1;
        int unsignedRightShift = num3 >>> 2;

        System.out.println("Сдвиг вправо: " + rightShift);
        System.out.println("Сдвиг влево: " + leftShift);
        System.out.println("Беззнаковый сдвиг вправо: " + unsignedRightShift);
    }
}