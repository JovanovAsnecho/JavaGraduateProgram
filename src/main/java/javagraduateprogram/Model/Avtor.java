package javagraduateprogram.Model;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "avtor")
public class Avtor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String ime;
    private String prezime;
    private int godinaNaRagjanje;
    @OneToMany
    private List<Kniga> knigi=new ArrayList<>();

    public Avtor(String ime, String prezime, int godinaNaRagjanje) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaNaRagjanje = godinaNaRagjanje;
    }

    public List<Kniga> getKnigi() {
        return knigi;
    }

    public void setKnigi(List<Kniga> knigi) {
        this.knigi = knigi;
    }

    public Avtor() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodinaNaRagjanje() {
        return godinaNaRagjanje;
    }

    public void setGodinaNaRagjanje(int godinaNaRagjanje) {
        this.godinaNaRagjanje = godinaNaRagjanje;
    }
}
