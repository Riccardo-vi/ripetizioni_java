public class Main {
    public static void main(String[] args) {
        RegistroStudente registro = new RegistroStudente("Mario Rossi");

        try {
            registro.aggiungiVoto(8.5);
            registro.aggiungiVoto(9.0);
            registro.aggiungiVoto(7.5);
            registro.aggiungiVoto(15.0);                        // Questo dovrebbe lanciare IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());                 // e.getMessage() restituisce il messaggio dell'eccezione calcolata in aggiungiVoto:
                                                                // errore di tipo ArgumentException, quindi sappiamo che stamperà proprio quel messaggio.                                                               
        }

        registro.aggiungiAssenza();
        registro.aggiungiAssenza();
                                                                // Aggiungiamo altre assenze per superare il limite
        for (int i = 0; i < 10; i++) 
            registro.aggiungiAssenza();
        
        try {
            registro.calcolaMedia();                            // Questo dovrebbe lanciare IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            registro.salvaPagella("pagella.txt");               // Questo dovrebbe lanciare LimiteAssenzeSuperatoException
        } catch (LimiteAssenzeSuperatoException | IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operazioni sul registro terminate per la sessione corrente.");
        }
    }
}