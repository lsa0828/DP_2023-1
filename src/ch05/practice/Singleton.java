package ch05.practice;

// 싱글턴 패턴을 적용
public class Singleton {
    //3: Singleton 객체 미리 생성
    private static Singleton singleton = new Singleton();

    // 1: 생성자를 private으로 한다
    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
    }

    // 2: 객체를 얻어가는 메소드를 구현
    public static Singleton getInstance() {
        return singleton;
    }
    // static 메소드는 static 변수만 접근 가능
}

enum Month {
    January, Feburary, March, April, May;
}

Month.January;