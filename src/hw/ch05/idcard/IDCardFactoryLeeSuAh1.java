package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryLeeSuAh1 extends Factory {
    private static IDCardFactoryLeeSuAh1 factory = new IDCardFactoryLeeSuAh1();

    public static IDCardFactoryLeeSuAh1 getInstance() {
        return factory;
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