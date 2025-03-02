package ch06.A2;

import ch06.A2.framework.Manager;
import ch06.A2.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 準備
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        
        // 복사 생성자 호출
        MessageBox copyOfsbox = new MessageBox(sbox);
        copyOfsbox.use("Duksung");

        // 登録
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 生成と使用
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
