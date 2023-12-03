public class laboratory_work_7
{
    private int value1;
    private int value2;

    public laboratory_work_7(int value1, int value2)
    {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void swapValues(laboratory_work_7 other)
    {
        int temp = this.value1;
        this.value1 = other.value1;
        other.value1 = temp;

        temp = this.value2;
        this.value2 = other.value2;
        other.value2 = temp;
    }

    public int getValue1()
    {
        return value1;
    }

    public int getValue2()
    {
        return value2;
    }

    public static void main(String[] args)
    {
        laboratory_work_7 obj1 = new laboratory_work_7(1, 2);
        laboratory_work_7 obj2 = new laboratory_work_7(3, 4);

        System.out.println("До обмена: obj1 = " + obj1.getValue1() + ", " + obj1.getValue2() + ", obj2 = " + obj2.getValue1() + ", " + obj2.getValue2());

        obj1.swapValues(obj2);

        System.out.println("После обмена: obj1 = " + obj1.getValue1() + ", " + obj1.getValue2() + ", obj2 = " + obj2.getValue1() + ", " + obj2.getValue2());
    }
}