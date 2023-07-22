import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        Date date = new Date();
        System.out.println(date.toString());

        Runnable runnable ;
        runnable = ()->
        {
            System.out.println(Thread.currentThread().getName());
            Date date1 = new Date();
            System.out.println(date1.toString());
        };
        Thread thread2 = new Thread(runnable);
        thread2.start();


        Thread thread = new Thread(new ThreadClass());
        thread.start();


    }
}
