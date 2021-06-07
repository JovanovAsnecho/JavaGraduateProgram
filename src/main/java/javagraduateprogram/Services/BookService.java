package javagraduateprogram.Services;

import javagraduateprogram.Model.Avtor;
import javagraduateprogram.Model.Kniga;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface BookService {


   // Kniga create(Kniga kniga, Long ISBN, int godinaIzdavanje, Avtor avtor) throws IOException;
    Optional<Kniga> findByIsbn(Long ISBN)throws IOException;
    Kniga save(Kniga kniga) throws IOException;
    Kniga edit(Kniga kniga,Long ISBN) throws IOException;
    void deleteById(Long ISBN);
    List<Kniga> findAll();
    List<Kniga> findAllBooksByAuthorFirstLetter(Character c);
    List<Kniga> findAllBooksByAuthorName(String name);
    List<Kniga> findOldestBook(int godinaNaIzdavanje);
    List<Kniga> findNewestBook(int godinaNaIzdavanje);
    List<Kniga> allBooks(Long ISBN,int godinaNaIzdavanje);
}
