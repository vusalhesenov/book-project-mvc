package az.home.bookstore.controller;


import az.home.bookstore.entity.Book;
import az.home.bookstore.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Optional;


@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister(){
        return "book_register";
    }

    @GetMapping("/my_books")
    public ModelAndView myBooks(){
        List<Book> all = bookService.all();
        return new ModelAndView("my_books","book",all);
    }

    @GetMapping("/{id}")
    public Optional<Book> findById(@PathVariable("id") Long id){
        return bookService.getById(id);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book){
        bookService.addBook(book);
        return "redirect:/my_books";
    }
}
