
/**
 * FirstThread
 */
class FirstThread implements Runnable {

    private Thread t;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public void start(){
        t = new Thread(this,"first");
        t.start();
    }
}

public class Tread {
    public static void main(final String[] args) {
        final FirstThread f1 = new FirstThread();
        final FirstThread f2 = new FirstThread();

        f1.start();
        f2.start();
    }
}