package MultiThreading;

import java.lang.Thread;

class YieldDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread.mt = Thread.currentThread();
        t1.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread " + i);
        }
    }
}

class MyThread extends Thread {
    static Thread mt;
    public void run() {
        System.out.println("Thread class " + Thread.currentThread().getName());
        for (int k = 0; k < 100; k++) {
            System.out.println("child thread " + k);
            if (k == 50) {
                try {
                    mt.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

// class MySecondThread implements Runnable{
//     public void run(){
//         try{
//             System.out.println("Runnable " + Thread.currentThread().getName());
//             System.out.println("runnable thread priority " + Thread.currentThread().getPriority());
//             for(int J=0;J<100;J++){
//                 System.out.println("child thread "+ J);
//             }
//         }catch(Exception e){
//             System.out.println("errror "+e);
//         }
//     }
// }
