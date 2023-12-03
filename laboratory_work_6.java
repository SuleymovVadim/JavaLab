public class laboratory_work_6
{
    private int maxSize;
    private int top;
    private int[] stackArray;

    public laboratory_work_6(int size)
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value)
    {
        if(top < maxSize - 1)
        {
            stackArray[++top] = value;
        }
        else
        {
            System.out.println("Стек заполнен. Невозможно добавить " + value);
        }
    }

    public int pop()
    {
        if(top >= 0)
        {
            return stackArray[top--];
        }
        else
        {
            System.out.println("Стек пуст.");
            return -1;
        }
    }

    public int peek()
    {
        if(top >= 0)
        {
            return stackArray[top];
        }
        else
        {
            System.out.println("Стек пуст.");
            return -1;
        }
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return (top == maxSize - 1);
    }

    public static void main(String[] args)
    {
        laboratory_work_6 stack = new laboratory_work_6(5);

        System.out.println("Пустой ли стек? " + stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Заполнен ли стек? " + stack.isFull());

        System.out.println("Top элемент: " + stack.peek());

        System.out.println("Удалённый элемент: " + stack.pop());

        System.out.println("Top элемент после удаления: " + stack.peek());

        stack.push(6);

        System.out.println("Top элемент после добавления: " + stack.peek());

        stack.push(7);
    }
}