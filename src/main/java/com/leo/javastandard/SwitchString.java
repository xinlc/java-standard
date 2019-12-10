package com.leo.javastandard;

/**
 * 当switch括号内的变量类型为String并且此变量为外部参数时，必须先进行null 判断。
 */
public class SwitchString {
    public static void main(String[] args) {
        method(null);
    }

    /**
     * 反例: 猜猜下面的代码输出是什么?
     */
    public static void method(String param) {
        switch (param) {
            // 肯定不是进入这里
            case "sth":
                System.out.println("it's sth");
                break;
            // 也不是进入这里
            case "null":
                System.out.println("it's null");
                break;
            // 也不是进入这里
            default:
                System.out.println("default");
        }
    }
}
