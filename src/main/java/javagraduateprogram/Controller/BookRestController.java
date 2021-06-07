package javagraduateprogram.Controller;

import javagraduateprogram.Model.Kniga;
import javagraduateprogram.Services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookRestController {
    private final BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Kniga> getAllBooks()
    {
        return bookService.findAll();
    }
    @GetMapping("/byAuthorFirstLetter/{c}")
    public List<Kniga> getAllBookByAuthorFirstLetter(@PathVariable Character c)
    {
        return bookService.findAllBooksByAuthorFirstLetter(c);
    }
    @GetMapping("/authorName/{name}")
    public List<Kniga> getAllBooksByAuthorName(@PathVariable String name)
    {
        return bookService.findAllBooksByAuthorName(name);
    }

}
