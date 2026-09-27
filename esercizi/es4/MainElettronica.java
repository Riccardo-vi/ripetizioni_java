package esercizi.es4;

public class MainElettronica {
    public static void main(String[] args) {
        
        Smartphone phone = new Smartphone("SM-01", "Galaxy X20", 699.99, 256, "Android");
        
        
        Televisore tv = new Televisore("TV-99", "Smart TV OLED", 1199.00, 55, true);

        
        System.out.println(phone.getSchedaDescrittiva());
        System.out.println("Prezzo scontato (10%): " + phone.calcolaPrezzoScontato(10) + " €\n");

        System.out.println(tv.getSchedaDescrittiva());
        System.out.println("Prezzo scontato (15%): " + tv.calcolaPrezzoScontato(15) + " €");
    }
}