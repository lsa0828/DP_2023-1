package hw.ch10;

import java.util.Comparator;

public class ComparatorAscending implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.compareTo(b);
    }
    
}
