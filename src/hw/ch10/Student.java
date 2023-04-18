package hw.ch10;

import java.lang.Comparable;

public class Student implements Comparable<Student> {
    String name, id;
    int height;

    public Student(String name, String id, int height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    @Override
    public int compareTo(Student s) {
        if(height >= s.height) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "(이름: " + name + ", 학번: " + id + ", 키: " + height + ")";
    }
}
