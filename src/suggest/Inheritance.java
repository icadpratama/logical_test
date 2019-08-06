package suggest;

class Binatang {
    String makanan;
    String kaki;
    String suara;

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getKaki() {
        return kaki;
    }

    public void setKaki(String kaki) {
        this.kaki = kaki;
    }

    public String getSuara() {
        return suara;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }
}

class Burung extends Binatang{
    Binatang b = new Binatang();

    Burung() {
        b.setMakanan("Biji");
        b.setKaki("2");
    }

    public void showData() {
        System.out.println(b.getMakanan());
        System.out.println(b.getKaki());
    }
}

class Unggas extends Burung {
    Burung b = new Burung();

    Unggas() {
        b.setKaki("2 juga");
        b.setMakanan("Cacing");
        b.showData();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Unggas u = new Unggas();
    }
}
