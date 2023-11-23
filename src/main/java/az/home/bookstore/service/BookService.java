package az.home.bookstore.service;

import az.home.bookstore.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {

    public List<Book> all();

    Optional<Book> getById(Long id);

    Book addBook(Book book);
}
