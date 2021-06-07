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

    List<Kniga> listBooks=new ArrayList<>();
    List<Avtor> listAuthors=new ArrayList<>();
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

        Avtor avtor1=new Avtor("asenco","jovanov",1998);
        Kniga kniga1=new Kniga("Kniga 1",2001,avtor1);
        Kniga kniga2=new Kniga("Kniga 2",2019,avtor1);

        avtorRepo.save(avtor1);
        bookService.save(kniga1);
        bookService.save(kniga2);

    }
}
