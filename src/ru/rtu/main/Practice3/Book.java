package ru.rtu.main.Practice3;

public class Book {
    private String name;
    private String author;
    private int publication_year;
    private int pop_level; //from zero to ten
    public Book(String name, String author, int publication_year, int pop_level) {
        this.name = name;
        this.author = author;
        this.publication_year = publication_year;
        this.pop_level = pop_level;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublicationYear(int publication_year){
        this.publication_year = publication_year;
    }
    public void setPopLevel(int pop_level){
        this.pop_level = pop_level;
    }


    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublicationYear(){
        return publication_year;
    }
    public int getPopLevel(){
        return pop_level;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publication_year=" + publication_year +
                ", pop_level=" + pop_level +
                '}';
    }
}
