public class BookStoreImp implements BookStore {

    BookRepository bookRepository;
    PaymentService paymentService;

    public BookStoreImp(BookRepository bookRepository, PaymentService paymentService){
        this.bookRepository = bookRepository;
        this.paymentService = paymentService;
    }

    public Book borrowBook(String title) {
        Book book = this.bookRepository.findByTitle(title);
        paymentService.pay(book.price);
        return book;
    }
}
