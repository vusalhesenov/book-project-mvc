package az.home.bookstore.service;


import az.home.bookstore.entity.Book;
import az.home.bookstore.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> all() {
        System.out.println(bookRepo.findAll());
        return bookRepo.findAll();
    }

    @Override
    public Optional<Book> getById(Long id) {
        return bookRepo.findById(id);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

}
