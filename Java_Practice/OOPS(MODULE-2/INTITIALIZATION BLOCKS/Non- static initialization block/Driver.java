class Driver
{
    int val ;

    {
        System.out.println("Executing non-static bllock");
        val = 20000;
    }


    public static void main(String[] args)
    {
        
        System.out.println("main starts");
        Driver d1 = new Driver();
        System.out.println(d1.val);
        System.out.println("main starts");

    }
}