class Beta
{
    static int x = 10;

    static
    {
        System.out.println("Executing static block");
         x = 1000;
    }

    public static void main(String[] args)
    {
        System.out.println("main starts");
        System.out.println(Beta.x);
        System.out.println("main ends");
        
    }
}