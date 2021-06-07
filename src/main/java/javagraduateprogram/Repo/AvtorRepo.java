package javagraduateprogram.Repo;

import javagraduateprogram.Model.Avtor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AvtorRepo extends JpaRepository<Avtor, Long> {
}
