import java.util.Date;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        Date date = new Date();
        System.out.println(Thread.currentThread().getName());
        System.out.println(date.toString());
    }
}
