package javagraduateprogram.Services.Impl;

import javagraduateprogram.Model.Avtor;
import javagraduateprogram.Model.Kniga;
import javagraduateprogram.Repo.AvtorRepo;
import javagraduateprogram.Repo.BookRepo;
import javagraduateprogram.Services.BookService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;
    private final AvtorRepo avtorRepo;

    public BookServiceImpl(BookRepo bookRepo, AvtorRepo avtorRepo) {
        this.bookRepo = bookRepo;
        this.avtorRepo = avtorRepo;
    }

//    @Override
//    public Kniga create(Kniga kniga, Long ISBN, int godinaIzdavanje, Avtor avtor) throws IOException {
//        Optional<Kniga> createKniga =this.findByIsbn(ISBN);
//
//        createKniga.get().setAvtor(createKniga.get().getAvtor());
//        createKniga.get().setISBN(createKniga.get().getISBN());
//        createKniga.get().setNaslov(createKniga.get().getNaslov());
//        createKniga.get().setGodinaIzdavanje(createKniga.get().getGodinaIzdavanje());
//
//        return this.bookRepo.save(createKniga.get());
//    }

    @Override
    public Optional<Kniga> findByIsbn(Long ISBN) throws IOException {
        return this.bookRepo.findById(ISBN);
    }

    @Override
    public Kniga save(Kniga kniga) {
        if (kniga.getAvtor() != null) {
            Optional<Avtor> avtor = this.avtorRepo.findById(kniga.getAvtor().getId());
            kniga.setAvtor(avtor.get());

        }
        return this.bookRepo.save(kniga);
    }


    @Override
    public Kniga edit(Kniga kniga, Long ISBN) throws IOException {

        Optional<Kniga> editKniga = this.findByIsbn(ISBN);
        Kniga editKniga1 = editKniga.get();
        if (kniga.getAvtor() != null) {
            Optional<Avtor> avtor = this.avtorRepo.findById(kniga.getAvtor().getId());
            kniga.setAvtor(avtor.get());
            editKniga1.setAvtor(avtor.get());
        }

        editKniga1.setISBN(kniga.getISBN());
        editKniga1.setGodinaIzdavanje(kniga.getGodinaIzdavanje());

        return this.bookRepo.save(kniga);
    }

    @Override
    public void deleteById(Long ISBN) {
        this.bookRepo.deleteById(ISBN);
    }

    @Override
    public List<Kniga> findAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public List<Kniga> findAllBooksByAuthorFirstLetter(Character c) {
        return bookRepo.getAllBooksByAuthorFirstLetter(c);
    }

    @Override
    public List<Kniga> findAllBooksByAuthorName(String name) {
        return bookRepo.findAllByAvtor_Ime(name);
    }

    @Override
    public Optional<Kniga> findOldestBook() {
        return bookRepo.findTopByOrderByGodinaIzdavanjeAsc();
    }

    @Override
    public Optional<Kniga> findNewestBook() {
        return bookRepo.findTopByOrderByGodinaIzdavanjeDesc();
    }

    @Override
    public List<Kniga> findAllBooksChronological() {
        return bookRepo.findAllByOrderByGodinaIzdavanjeAsc();
    }


}
