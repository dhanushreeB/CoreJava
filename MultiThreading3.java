public class MultiThreading3 {
    public static void main(String[] args) {
        ChildThread ct = new ChildThread();
        // now we need to craete a thread class object also
        // as start method is inside thread
        // Thread t = new Thread();
        // t.start();
        // System.out.println("main thread");
        //here what happens is the run() inside the main thread would be called andd main thread would be printed instead of child
        Thread t = new Thread(ct);

        //ct is target runnable 
        t.start();
        System.out.println("main thread");
    }
}

class ChildThread implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 5; i++) {
            System.out.print("child thread");
        }
    }

}