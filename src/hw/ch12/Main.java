package hw.ch12;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210802 이수아");
        System.out.println();
        
        MultiStringDisplay md = new MultiStringDisplay();

        md.add("학번: 20210802");
        md.add("이름: 이수아");
        md.add("핸드폰 번호: 010-9800-9538");

        Display d = new MultiSideBorder(
                        new UpDownBorder(
                            new FullBorder(
                                new SideBorder(md, '%')
                            ), 
                            '='
                        ), 
                        '*', 3
                    );
        d.show();
    }
}