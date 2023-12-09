import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        String authorPoslebala = "Lev Toltoy";
        String namePosleBala = "Posle bala";
        int yearPosleBala = 1911;
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book posleBala = new Book(levTolstoy,"Posle Bala", 1911);


    }
}