public class Book {
    private String name;
    private int publicationYear;
    private Author author;

    public Book(Author author, String name, int publicationYear) {
        this.author = author;
        this.name = name;
        this.publicationYear = publicationYear;
    }
    public Author getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public void setPublicationYear(int Year){
        this.publicationYear = Year;
    }
    public String toString(){
        return this.name + ", " + this.author + ", " + this.publicationYear;
    }


}

