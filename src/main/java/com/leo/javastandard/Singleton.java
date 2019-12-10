package com.leo.javastandard;

/**
 * 单例模式的实现, 双重检验锁定
 */
public class Singleton {
    static Singleton instance;

    static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

/**
 * 现在比较好的做法就是采用静态内部内的方式实现
 */
//public class SingletonDemo {
//    private SingletonDemo () { }
//    private static class SingletonDemoHandler {
//        private static SingletonDemo instance = new SingletonDemo ();
//    }
//    public static SingletonDemo getInstance() {
//        return SingletonDemoHandler .instance;
//    }
//}
