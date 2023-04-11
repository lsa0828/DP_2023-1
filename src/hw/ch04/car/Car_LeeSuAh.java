package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_LeeSuAh extends Product {
    private String modelName;

    Car_LeeSuAh(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void use() {
        System.out.println("모델명 " + modelName + "인 car를 사용합니다.");
    }

    public String getModelName() {
        return modelName;
    }
}