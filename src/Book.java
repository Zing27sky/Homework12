public class Book {
    private String name;
    private int publicationYear;
    private String author;

    public Book(String author, String name, int publicationYear) {
        this.author = author;
        this.name = name;
        this.publicationYear = publicationYear;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }

}

