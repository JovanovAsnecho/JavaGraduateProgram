package javagraduateprogram.Model;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "knigi")
public class Kniga {

    private String naslov;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ISBN;
    private int godinaIzdavanje;
    @ManyToOne
    @Nullable
    private Avtor avtor;

    public Kniga(String naslov, int godinaIzdavanje,Avtor avtor) {
        this.naslov = naslov;
        this.godinaIzdavanje = godinaIzdavanje;
        this.avtor = avtor;
    }

    public Kniga(String naslov, Long ISBN, int godinaIzdavanje,Avtor avtor) {
        this.naslov = naslov;
        this.ISBN = ISBN;
        this.godinaIzdavanje = godinaIzdavanje;
        this.avtor = avtor;
    }

    public Kniga(String naslov, int ISBN, int godinaIzdavanje) {

    }

    public Kniga() {
    }


    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public int getGodinaIzdavanje() {
        return godinaIzdavanje;
    }

    public void setGodinaIzdavanje(int godinaIzdavanje) {
        this.godinaIzdavanje = godinaIzdavanje;
    }

    public Avtor getAvtor() {
        return avtor;
    }

    public void setAvtor(Avtor avtor) {
        this.avtor = avtor;
    }


}
