package hw.ch10;

import java.util.Comparator;

public class ComparatorDeseding implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return b.compareTo(a);
    }
    
}
