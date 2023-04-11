package hw.ch04.car;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import java.util.Vector;
import java.util.Iterator;

public class CarFactory extends Factory {
    private Vector<String> modelNames = new Vector<>();

    @Override
    protected Product createProduct(String modelName) {
        return new Car_LeeSuAh(modelName);
    }

    @Override
    protected void registerProduct(Product product) {
        modelNames.add(((Car_LeeSuAh)product).getModelName());
    }

    public void printAllModelNames() {
        Iterator<String> it = modelNames.iterator();
        System.out.println("<모델명 리스트>");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
