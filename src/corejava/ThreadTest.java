package corejava;
/**
 * 线程的三种实现方式
 *
 * */
public class ThreadTest extends Thread{
    public void run() {

        System.out.println("MyThread.run()");
    }


    public static void main(String arg[]){
        ThreadTest myThread1 = new ThreadTest();
        ThreadTest myThread2 = new ThreadTest();
        myThread1.start();
        myThread2.start();


    }

}