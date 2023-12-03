public class laboratory_work_10
{
    public static void main(String[] args)
    {
        TripleClass<Integer> triple = new TripleClass<>(5, 10, 15);

        System.out.println("First: " + triple.getFirst());
        System.out.println("Second: " + triple.getSecond());
        System.out.println("Third: " + triple.getThird());

        System.out.println("Min: " + triple.min());
        System.out.println("Max: " + triple.max());
        System.out.println("Mean: " + triple.mean());
    }
}