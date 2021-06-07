package javagraduateprogram.Services;

import javagraduateprogram.Model.Avtor;
import javagraduateprogram.Model.Kniga;

import java.util.List;
import java.util.Optional;

public interface AvtorService {
    List<Avtor> findAll();
    Optional<Avtor> findById(Long id);
    List<Avtor> findAllAuthorsWithThreeOrMoreBooks();
}
