package javagraduateprogram.Services.Impl;

import javagraduateprogram.Model.Avtor;
import javagraduateprogram.Model.Kniga;
import javagraduateprogram.Repo.AvtorRepo;
import javagraduateprogram.Services.AvtorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AvtorServiceImpl implements AvtorService {
    private final AvtorRepo avtorRepo;

    public AvtorServiceImpl(AvtorRepo avtorRepo) {
        this.avtorRepo = avtorRepo;
    }

    @Override
    public List<Avtor> findAll() {
        return avtorRepo.findAll();
    }

    @Override
    public Optional<Avtor> findById(Long id) {
        return avtorRepo.findById(id);
    }

    @Override
    public List<Avtor> findAllAuthorsWithThreeOrMoreBooks(Integer greaterThan) {
        return avtorRepo.findAllByKnigiGreaterThan(greaterThan);

    }

}
