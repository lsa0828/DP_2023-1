package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210802 이수아");

        FileIO f = new FileProperties(); // 어댑터 생성
        
        try {
            f.readFromFile("file.txt");
            f.setValue("Year", "2023");
            f.setValue("bornYear", "2002");
            f.setValue("StudentId", "20210802");
            f.setValue("Name", "LeeSuah");
            f.setValue("Location", "Bucheon");
            f.writeToFile("LeeSuah.txt");
            System.out.println("LeeSuah.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
