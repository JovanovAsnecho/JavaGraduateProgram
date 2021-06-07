package javagraduateprogram.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "printcopy")
public class PrintCopy extends Kniga{

    private int brStranici;
    private int tezina;

    public PrintCopy(String naslov, int ISBN, int godinaIzdavanje) {
        super(naslov, ISBN, godinaIzdavanje);
    }

    public PrintCopy(String naslov, int ISBN, int godinaIzdavanje, int brStranici, int tezina) {
        super(naslov, ISBN, godinaIzdavanje);
        this.brStranici = brStranici;
        this.tezina = tezina;
    }

    public PrintCopy() {
    }

    public int getBrStranici() {
        return brStranici;
    }

    public void setBrStranici(int brStranici) {
        this.brStranici = brStranici;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }
}
