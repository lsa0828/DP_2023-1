package ch02.practice1;

public class Main {
    public static void main(String[] args) {
        // Banner 이용하기
        // 가정:Banner를 클라이언트가 직접 사용하지 못한다
        Banner b = new Banner("lsa");
        b.showWithParen();
        b.showWithAster();

        // 어댑터를 이용하기
        // Banner 클래스를 수정해도 클라이언트는 영향을 안 받는다.
        Print x = new PrintBanner("lsa"); // 어댑터 생성
        x.printWeak();
        x.printStrong();
    }
}
