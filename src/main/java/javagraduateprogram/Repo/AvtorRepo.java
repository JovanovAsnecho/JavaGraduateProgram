package javagraduateprogram.Repo;

import javagraduateprogram.Model.Avtor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AvtorRepo extends JpaRepository<Avtor, Long> {


    List<Avtor> findAllByKnigiGreaterThan(Integer greaterThan);

}
