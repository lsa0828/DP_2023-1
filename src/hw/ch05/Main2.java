package hw.ch05;

import hw.ch05.framework.Factory;
import hw.ch05.idcard.IDCardFactoryLeeSuAh2;

public class Main2 extends Thread {
    public static void main(String[] args) {
        System.out.println("20210802 이수아");

        System.out.println("Start.");
        new Main2("최승훈").start();
        new Main2("이수아").start();
        new Main2("신혜림").start();
        System.out.println("End.");
    }

    @Override
    public void run() {
        Factory obj = IDCardFactoryLeeSuAh2.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }

    public Main2(String name) {
        super(name);
    }
}
