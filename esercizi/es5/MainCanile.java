package esercizi.es5;

public class MainCanile {
    public static void main(String[] args) {
        // Creazione di un cane e di un gatto
        Cane cane1 = new Cane("Rex", 4, "12/02/2026", "Pastore Tedesco", true);
        Gatto gatto1 = new Gatto("Luna", 2, "05/05/2026", false);

        // Stampiamo i messaggi di presentazione richiesti
        System.out.println(cane1.getMessaggioPresentazione());
        System.out.println("\n-----------------------------------\n");
        System.out.println(gatto1.getMessaggioPresentazione());
    }
}
