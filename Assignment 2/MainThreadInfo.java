public class MainThreadInfo
{
    public static void main(String[] args)
    {
        Thread t=Thread.currentThread();
        System.out.println("===Main Thread Info===");
        System.out.println("Name: " + t.getName()); 
        System.out.println("Priority: " + t.getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("After changing priority:");
        System.out.println("Name : " + t.getName());
        System.out.println("New Priority : " + t.getPriority());
        System.out.println("Main Thread ");
    }
}