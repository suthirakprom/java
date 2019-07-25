class Arithmetic {
    int add(int a, int b)
    {
        return a + b; 
    }
}

public class practiceTest1 {
    public static void main(String[] args)
    {
        Arithmetic obj = new Arithmetic();
        System.out.println(obj.add(5, 5));
    }
}