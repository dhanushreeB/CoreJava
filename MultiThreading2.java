//start and run 
class ChildThread extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread");
        }
    }

    // this method will behave as a normal fn
    public void run(int k) {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread executed by the main thread");
        }
    }
}

class MultiThreading2 {
    public static void main(String[] args) {

        ChildThread ct1 = new ChildThread();
        ct1.start();
        // after this there arises 2 threads main and child
        // the start method is used from the thread class extended earlier
        // inside the start method we have acll to the run method this will lead to call
        // the run in childthread
        // y to call a start when u can directly call run..........?
        // start by default calls the method run of no parameters
        System.out.println("job of main thread");

        ct1.run(2);
    }
}
// opjob of main thread
// child thread
// child thread
// child thread
// child thread
// child thread overloaded
// child thread overloaded
// child thread
// child thread overloaded
// child thread overloaded
// child thread overloaded