import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BookStoreTest {

    BookStore bookStore;
    BookRepository bookRepository;
    PaymentService paymentService;

    @Before
    public void before() {
        bookRepository = Mockito.mock(BookRepository.class);
        paymentService = Mockito.mock(PaymentService.class);
        bookStore = new BookStoreImp(bookRepository, paymentService);
    }

    @Test
    public void borrowBookTest() {
        //when
        when(bookRepository.findByTitle("Lord of the rings")).thenReturn(new Book(100));
        Book book = bookStore.borrowBook("Lord of the rings");
        //then
        assertNotNull(book);
        verify(paymentService).pay(100);
    }
}
