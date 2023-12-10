public class laboratory_work_7<T>
{
    private T value1;
    private T value2;

    public laboratory_work_7(T value1, T value2)
    {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void swapValues()
    {
        T temp = this.value1;
        this.value1 = this.value2;
        this.value2 = temp;
    }

    public T getValue1()
    {
        return value1;
    }

    public T getValue2()
    {
        return value2;
    }

    public static void main(String[] args)
    {
        laboratory_work_7<Integer> obj1 = new laboratory_work_7<>(1, 2);
        laboratory_work_7<Integer> obj2 = new laboratory_work_7<>(3, 4);

        System.out.println("До обмена: obj1 = " + obj1.getValue1() + ", " + obj1.getValue2() + ", obj2 = " + obj2.getValue1() + ", " + obj2.getValue2());

        obj1.swapValues();

        System.out.println("После обмена: pair1 = " + obj1.getValue1() + ", " + obj1.getValue2() + ", obj2 = " + obj2.getValue1() + ", " + obj2.getValue2());
    }
}