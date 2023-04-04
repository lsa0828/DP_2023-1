package hw.ch03;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210802 이수아");

        AbstractDisplay d = new LeeSuAhDisplay("이수아", "20210802", 3);

        d.display(10);
        d.display(5);
    }
}
