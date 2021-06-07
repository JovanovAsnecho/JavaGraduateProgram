package javagraduateprogram.config;


import javagraduateprogram.Model.Avtor;
import javagraduateprogram.Model.Kniga;
import javagraduateprogram.Repo.AvtorRepo;
import javagraduateprogram.Repo.BookRepo;
import javagraduateprogram.Services.BookService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    List<Kniga> listBooks = new ArrayList<>();
    List<Avtor> listAuthors = new ArrayList<>();
    private final BookRepo bookRepo;
    private final AvtorRepo avtorRepo;
    private final BookService bookService;

    public DataHolder(BookRepo bookRepo, AvtorRepo avtorRepo, BookService bookService) {
        this.bookRepo = bookRepo;
        this.avtorRepo = avtorRepo;
        this.bookService = bookService;
    }

    @PostConstruct
    public void init() throws IOException {

        Avtor avtor1 = new Avtor("asenco", "jovanov", 1998);
        Avtor avtor2 = new Avtor("marjan", "stankov", 1998);
        Kniga kniga1 = new Kniga("Kniga 1", 2001, avtor1);
        Kniga kniga2 = new Kniga("Kniga 2", 2019, avtor1);
        Kniga kniga3 = new Kniga("Kniga 3", 2029, avtor1);

        Kniga kniga1M = new Kniga("Kniga 2", 2019, avtor2);
        Kniga kniga2M = new Kniga("Kniga 3", 2029, avtor2);


        avtor1.addBook(kniga1);
        avtor1.addBook(kniga2);
        avtor1.addBook(kniga3);


        avtor2.addBook(kniga1M);
        avtor2.addBook(kniga2M);

        avtorRepo.save(avtor1);
        avtorRepo.save(avtor2);


    }
}
