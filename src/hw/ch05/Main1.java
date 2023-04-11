package hw.ch05;

import hw.ch05.framework.Factory;
import hw.ch05.idcard.IDCardFactoryLeeSuAh1;

public class Main1 {
    public static void main(String[] args){
        System.out.println("20210802 이수아");

        Factory factory1 = IDCardFactoryLeeSuAh1.getInstance();
        Factory factory2 = IDCardFactoryLeeSuAh1.getInstance();

        if(factory1 == factory2) {
            System.out.println("factory1과 factory2는 같은 인스턴스입니다.");
        } else {
            System.out.println("factory1과 factory2는 다른 인스턴스입니다.");
        }
    }
}
