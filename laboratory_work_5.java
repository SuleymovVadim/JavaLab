public class laboratory_work_5
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("Аргументы не были предоставлены.");
        }
        else
        {
            System.out.println("Аргументы:");
            for (String arg : args)
            {
                System.out.println(arg);
            }
        }
    }
}