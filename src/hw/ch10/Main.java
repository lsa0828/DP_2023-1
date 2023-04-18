package hw.ch10;

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("20210802 이수아");
        System.out.println();

        Student a = new Student("최승훈", "20216547", 170);
        Student b = new Student("이수아", "20210802", 160);
        Student c = new Student("신혜림", "20214657", 180);
        Student d = new Student("박가현", "20211234", 140);
        Student e = new Student("임서연", "20217890", 150);

        List<Student> list = Arrays.asList(a, b, c, d, e);

        list.sort(new ComparatorAscending());
        System.out.println("** (1) 정렬 결과 (오름차순)");
        System.out.println(list);

        list.sort(new ComparatorDeseding());
        System.out.println("** (1) 정렬 결과 (내림차순)");
        System.out.println(list);
    }
}
