package javagraduateprogram.Model;

import javagraduateprogram.Enumerations.EbookEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "ebook")
public class Ebook extends Kniga{

    private int golemina;
    @Enumerated(EnumType.STRING)
    private EbookEnum status = EbookEnum.epub;

    public Ebook(String naslov, int ISBN, int godinaIzdavanje, int golemina, EbookEnum status) {
        super(naslov, ISBN, godinaIzdavanje);
        this.golemina = golemina;
        this.status = status;
    }

    public Ebook(String naslov, int ISBN, int godinaIzdavanje) {
        super(naslov, ISBN, godinaIzdavanje);
    }

    public Ebook() {

    }

    public int getGolemina() {
        return golemina;
    }

    public void setGolemina(int golemina) {
        this.golemina = golemina;
    }

    public EbookEnum getStatus() {
        return status;
    }

    public void setStatus(EbookEnum status) {
        this.status = status;
    }
}
