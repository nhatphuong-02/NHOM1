public class Textbook extends Book {
    private String subject;
    private String level;
    
    public Textbook(String bookId, String title, String author, int publicationYear, int quantity, String subject, String level){
        super(bookId, title, author, publicationYear, quantity);
        this.subject=subject;
        this.level=level;
    }
    
    @Override
    public String toString() {
        return super.toString() +"\nMon hoc       : "+subject+"\nCap do        : "+level;
    }
}