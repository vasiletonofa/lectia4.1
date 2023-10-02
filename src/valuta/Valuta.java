package valuta;

public enum Valuta {


    EUR("euro", 223) , USD("dolari", 555), LEI("lei", 666);
    String descriere;

    Integer numCode;

    Valuta(String des, Integer num) {
        descriere = des;
        numCode = num;
    }

    public String getDescriere() {
        return descriere;
    }

    public Integer getNumCode() {
        return numCode;
    }

}
