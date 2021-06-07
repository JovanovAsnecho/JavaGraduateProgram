package javagraduateprogram.Controller;

import javagraduateprogram.Model.Avtor;
import javagraduateprogram.Model.Kniga;
import javagraduateprogram.Services.AvtorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorrRestController {

    private final AvtorService avtorService;


    public AuthorrRestController(AvtorService avtorService) {
        this.avtorService = avtorService;
    }

    @GetMapping
    public List<Avtor> findAll()
    {
        return avtorService.findAll();
    }

}
