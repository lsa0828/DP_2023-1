package ch15.Sample;

import ch15.Sample.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        // Facade를 이용함
        PageMaker.makeWelcomePage("hyuki@example.com", "welcome.html");
        PageMaker.makeWelcomePage("csh@duksung.ac.kr", "welcome2.html");
    }
}
