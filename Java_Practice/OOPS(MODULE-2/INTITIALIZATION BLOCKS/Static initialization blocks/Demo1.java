class Demo1
{
    static int a;
    static double b;
    static char c;

    static
    {
        a = 10;
        b = 12.0;
        c = 'N';
    }
    

    public static void main(String[] args)
    {
        System.out.println(Demo1.a);
        System.out.println(Demo1.b);
        System.out.println(Demo1.c);

    }
}