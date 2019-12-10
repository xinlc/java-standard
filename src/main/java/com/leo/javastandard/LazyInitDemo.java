package com.leo.javastandard;

/**
 * 在并发场景下，通过双重检查锁(double-checked locking)实现延迟初始化的优化 问题隐患(可参考 The "Double-Checked Locking is Broken" Declaration)，推荐解决方案中较为 简单一种(适用于 JDK5 及以上版本)，将目标属性声明为 volatile 型。
 */
public class LazyInitDemo {
    private Helper helper = null;
    private volatile static Helper helper2 = null;

    /**
     * 反例
     */
    public Helper getHelper() {
        if (helper == null) {
            synchronized (this) {
                if (helper == null) {
                    helper = new Helper();
                }
            }
        }
        return helper;
    }


    /**
     * 推荐懒加载优雅写法 Initialization on Demand Holder（IODH）。
     */
//    public class Singleton {
//        static class SingletonHolder {
//            static Singleton instance = new Singleton();
//        }
//
//            return SingletonHolder.instance;
//        }
//    }

    private class Helper {
    }
}
