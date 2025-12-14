class A
{
    int i, j;

    void show()
    {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A
{
    int k;

    void showk()
    {
        System.out.println("k: " + k);
    }

    void sum()
    {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

public class si
{
    public static void main(String args[])
    {
        B subOb = new B();
        subOb.i = 10;
        subOb.j = 20;
        subOb.k = 30;

        subOb.show();
        subOb.showk();
        subOb.sum();
    }
}
