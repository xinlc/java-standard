package com.leo.javastandard;

public class VolatileTest {

    public  static boolean flag = true;
//    public volatile static boolean flag = true;


    public static class T1 extends Thread {
        public T1(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("线程" + this.getName() + " in");
            while (flag) {
                ;
            }
            System.out.println("线程" + this.getName() + "停止了");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 休眠1秒
        new T1("t1").start();
        Thread.sleep(1000);
        // 将flag置为false
        flag = false;
    }
}
