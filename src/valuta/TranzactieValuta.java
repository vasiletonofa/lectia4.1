package valuta;

public class TranzactieValuta {

    Valuta dinValuta; // LEI

    Valuta inValuta; // USD

    Float curs;
    Float suma;

    public TranzactieValuta(Valuta from, Float curs,  Valuta to, Float s) {
        this.curs = curs;
        suma = s;
        dinValuta = from;
        inValuta = to;
    }

    public Float cumpara() {
        return suma / curs;
    }

    public Float vinde() {
        return suma * curs;
    }

}
