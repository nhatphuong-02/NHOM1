public class Novel extends Book {
    private String genre;
    private boolean isSeries;

    public Novel(String bookId, String title, String author, int publicationYear, int quantity, String genre, boolean isSeries){
        super(bookId, title, author, publicationYear, quantity);
        this.genre=genre;
        this.isSeries=isSeries;
    }

    @Override
    public String toString() {
        return super.toString() +"\nThe loai      : "+genre+"\n"+(isSeries?"Thuoc the loai series":"Khong thuoc the loai series");
    }
}
