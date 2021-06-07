package javagraduateprogram.Controller;

import javagraduateprogram.Model.Kniga;
import javagraduateprogram.Repo.BookRepo;
import javagraduateprogram.Services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookRestController {
    private final BookService bookService;
    private final BookRepo bookRepo;

    public BookRestController(BookService bookService, BookRepo bookRepo) {
        this.bookService = bookService;
        this.bookRepo = bookRepo;
    }

    @GetMapping
    public List<Kniga> getAllBooks() {
        return bookService.findAll();
    }

    @GetMapping("/byAuthorFirstLetter/{c}")
    public List<Kniga> getAllBookByAuthorFirstLetter(@PathVariable Character c) {
        return bookService.findAllBooksByAuthorFirstLetter(c);
    }

    @GetMapping("/authorName/{name}")
    public List<Kniga> getAllBooksByAuthorName(@PathVariable String name) {
        return bookService.findAllBooksByAuthorName(name);
    }

    @GetMapping("/chronological")
    public List<Kniga> getAllBooksChronological() {
        return bookService.findAllBooksChronological();
    }

    @GetMapping("/oldest")
    public Optional<Kniga> getOldestBook() {
        return bookService.findOldestBook();
    }
    @GetMapping("/newest")
    public Optional<Kniga> getNewestBook() {
        return bookService.findNewestBook();
    }
}
