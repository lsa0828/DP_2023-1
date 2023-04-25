package hw.ch11;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210802 이수아");
        System.out.println();

        Directory rootdir = new Directory("MyDocuments", "20230401", "LeeSuAh");
        Directory datadir = new Directory("MyData", "20230401", "LeeSuAh");
        Directory picdir = new Directory("MyPictures", "20230401", "LeeSuAh");

        File file0 = new File("이수아0.doc", "20230501", 1000, "LeeSuAh");
        File file1 = new File("이수아1.doc", "20230501", 2000, "LeeSuAh");
        File file2 = new File("이수아2.java", "20230501", 3000, "LeeSuAh");
        File file3 = new File("이수아3.gif", "20230601", 4000, "LeeSuAh");
        File file4 = new File("이수아4.jpg", "20230601", 5000, "LeeSuAh");
        File file5 = new File("이수아5.png", "20230601", 6000, "LeeSuAh");
        
        rootdir.add(file0);
        rootdir.add(datadir);
        
        datadir.add(file1);
        datadir.add(file2);
        datadir.add(picdir);

        picdir.add(file3);
        picdir.add(file4);
        picdir.add(file5);

        rootdir.printList();
    }
}
