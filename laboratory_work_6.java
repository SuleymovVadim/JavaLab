import java.util.ArrayList;

public class laboratory_work_6
{
    private ArrayList<Integer> stackArray;

    public laboratory_work_6()
    {
        stackArray = new ArrayList<>();
    }

    public void push(int value)
    {
        stackArray.add(value);
    }

    public int pop()
    {
        if(!stackArray.isEmpty())
        {
            return stackArray.remove(stackArray.size()-1);
        }
        else
        {
            System.out.println("Стек пуст.");
            return -1;
        }
    }

    public int peek()
    {
        if(!stackArray.isEmpty())
        {
            return stackArray.get(stackArray.size()-1);
        }
        else
        {
            System.out.println("Стек пуст.");
            return -1;
        }
    }

    public boolean isEmpty()
    {
        return stackArray.isEmpty();
    }

    public static void main(String[] args)
    {
        laboratory_work_6 stack = new laboratory_work_6();

        System.out.println("Пустой ли стек? " + stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Top элемент: " + stack.peek());

        System.out.println("Удалённый элемент: " + stack.pop());

        System.out.println("Top элемент после удаления: " + stack.peek());

        stack.push(6);

        System.out.println("Top элемент после добавления: " + stack.peek());

        stack.push(7);
    }
}