package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryLeeSuAh2 extends Factory {
    private static IDCardFactoryLeeSuAh2 factory = null;

    public static synchronized IDCardFactoryLeeSuAh2 getInstance() {
        if (factory == null) {
            System.out.println("인스턴스가 생성되었습니다.");
            slowdown();
            factory = new IDCardFactoryLeeSuAh2();
        }
        return factory;
    }

    private static void slowdown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}