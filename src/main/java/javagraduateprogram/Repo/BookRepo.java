package javagraduateprogram.Repo;

import javagraduateprogram.Model.Kniga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<Kniga, Long> {
    @Query(value = "SELECT k FROM Kniga k WHERE k.avtor.prezime LIKE :c%")
    List<Kniga> getAllBooksByAuthorFirstLetter(Character c);
    List<Kniga> findAllByAvtor_Ime(String ime);
    List<Kniga> findAllByOrderByGodinaIzdavanjeAsc();
    List<Kniga> findAllByAvtor_PrezimeStartingWith(String s);
    Optional<Kniga> findTopByOrderByGodinaIzdavanjeAsc();
    Optional<Kniga> findTopByOrderByGodinaIzdavanjeDesc();
}
