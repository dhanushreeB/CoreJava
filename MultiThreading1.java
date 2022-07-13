//inheritance 
class ChildThread extends Thread {
    // thread class contains a method called as run ,we need to override it
    // runnable interface actually contains the method run
    // and thread class is implemented using it,thus we need to implement the run
    // without a single line of code
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread");
        }
    }// the block of code is also known as child thread job
}

class MultiThreading1 {
    public static void main(String[] args) {
        // by default java has a thread and it is main and created by jvm
        // this leads to execution of main thread first
        // initialize the object
        ChildThread ct = new ChildThread();
        ct.start();
        // after this there arises 2 threads main and child
        System.out.println("job of main thread");
    }
}
// o/p:job of main thread
// child thread
// child thread
// child thread
// child thread
// child thread
// the order of execution depends on the thread scheduler(algo used to implement
// threadscheduler(rr,robin,fcfs...))