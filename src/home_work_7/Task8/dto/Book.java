package home_work_7.Task8.dto;


public class Book {
    private String name;
    private String text;

    public Book(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
