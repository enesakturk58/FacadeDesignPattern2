public class AkilliEv {
    Isik isik = new Isik();
    Kapi kapi = new Kapi();
    Klima klima = new Klima();

    public void isikAc(){
        isik.ac();
    }
    public void isikKapat(){
        isik.kapat();
    }
    public void kapiKilitle(){
        kapi.kilitle();
    }
    public void kapiAc(){
        kapi.kilitAc();
    }
    public void sicaklikAyarla(int sicaklik){
        System.out.println("Sicaklik ayarlandi : " + sicaklik);
    }

    public void ac(){
        isikAc();
        kapiAc();
    }
    public void kapat(){
        isik.kapat();
        kapi.kilitle();
    }
}
