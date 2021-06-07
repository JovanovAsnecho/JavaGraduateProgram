package javagraduateprogram.Controller;

import javagraduateprogram.Model.Avtor;
import javagraduateprogram.Repo.AvtorRepo;
import javagraduateprogram.Services.AvtorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/author")
public class AuthorrRestController {

    private final AvtorService avtorService;
    private final AvtorRepo avtorRepo;


    public AuthorrRestController(AvtorService avtorService, AvtorRepo avtorRepo) {
        this.avtorService = avtorService;
        this.avtorRepo = avtorRepo;
    }

    @GetMapping
    public List<Avtor> findAll() {
        return avtorService.findAll();
    }

    @GetMapping("/greaterThan")
    public List<Avtor> findAllGreaterThan() {
        return avtorService.findAll().stream()
                .filter(x -> x.getKnigi().size() > 3)
                .collect(Collectors.toList());

    }


}
