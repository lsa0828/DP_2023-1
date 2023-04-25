package hw.ch11;

public class File extends Entry {
    private String name, date, author;
    private int size;

    public File(String name, String date, int size, String author) {
        this.name = name;
        this.date = date;
        this.size = size;
        this.author = author;
    }

    public int getCount() {
        return 1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this + " [" + date + "] [" + getCount() + "개] [" + author + "]");
    }
}
