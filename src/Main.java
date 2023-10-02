import valuta.TranzactieValuta;
import valuta.Valuta;

public class Main {
    public static void main(String[] args) {

        TranzactieValuta tranzactie = new TranzactieValuta(Valuta.USD, 18.10F,  Valuta.LEI, 20000.0F);

        Valuta usd = Valuta.USD;

        System.out.println(tranzactie.cumpara());
        System.out.println(tranzactie.vinde());

        Valuta eur = Valuta.EUR;

        boolean v = eur == usd; // false

        Integer c = 2;
        Integer b = 3;

        boolean r = c == b;

        String tt = "Ion";
        String vv = "Ion";

        System.out.println(tt == vv);


    }
}