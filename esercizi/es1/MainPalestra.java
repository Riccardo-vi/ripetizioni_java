package esercizi.es1;

public class MainPalestra {
    public static void main(String[] args) {
        
        Iscritto iscritto1 = new Iscritto("Mario", "Rossi", "CORSO-YOGA", 3);

        System.out.println("--- DATI ISCRITTO ---");
        System.out.println("Nome: " + iscritto1.getNome() + " " + iscritto1.getCognome());
        System.out.println("Corso attuale: " + iscritto1.getIdCorso());
        System.out.println("Mesi residui: " + iscritto1.getMesiResidui());
        System.out.println("L'abbonamento è attivo? " + iscritto1.isAttivo());

        // 2. Test del rinnovo dell'abbonamento (+1 mese)
        System.out.println("\n--- TEST RINNOVO ---");
        iscritto1.rinnova();
        System.out.println("Abbonamento rinnovato! Mesi residui attuali: " + iscritto1.getMesiResidui());

        // 3. Test del cambio corso
        System.out.println("\n--- TEST CAMBIO CORSO ---");
        System.out.println("Vecchio corso: " + iscritto1.getIdCorso());
        iscritto1.cambiaCorso("CORSO-PILATES");
        System.out.println("Nuovo corso aggiornato: " + iscritto1.getIdCorso());
    }

}
