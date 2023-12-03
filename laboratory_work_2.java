import java.util.Scanner;

public class laboratory_work_2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int counter = 1;

        System.out.println("Введите слова: ");
        while (in.hasNext())
        {
            String word = in.next();
            System.out.println("Слово " + counter + ": " + word);
            counter++;
        }

        in.close();
    }
}