public class TripleClass<T extends Number & Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public TripleClass(T first, T second, T third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {return first;}
    public T getSecond() {return second;}
    public T getThird() {return third;}
    public T min() {
        if (first.compareTo(second) < 0 && first.compareTo(third) < 0)
        {
            return first;
        }
        else if (second.compareTo(first) < 0 && second.compareTo(third) < 0)
        {
            return second;
        }
        else
        {
            return third;
        }
    }

    public T max()
    {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
        {
            return first;
        }
        else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
        {
            return second;
        }
        else
        {
            return third;
        }
    }

    public double mean()
    {
        return (first.doubleValue() + second.doubleValue() + third.doubleValue()) / 3;
    }

}

