package ch04.practice.idcard;

//import java.util.Hashtable;

import ch04.practice.framework.Factory;
import ch04.practice.framework.Product;

public class IDCardFactory extends Factory {
    //private int serial = 100;
    //private Hashtable manager = new Hashtable<>();

    @Override
    protected Product createProduct(String owner) {
        //manager.put(serial, owner);
        //manager.get(serial);
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
