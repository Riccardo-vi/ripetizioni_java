
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- TEST CREAZIONE SMARTPHONE ---");
        Smartphone mioTelefono = new Smartphone(899.99, 4500, "Galaxy S23", "Android", 128);
        
        mioTelefono.accendere();
        System.out.println("Prezzo Smartphone: " + mioTelefono.getPrezzoBase() + " Euro");
        mioTelefono.effettuaChiamata("333-1234567");
        mioTelefono.spegnere();

        System.out.println("\n--- TEST CREAZIONE SERVER ---");
        Server mioServer = new Server(2500.00, 850, "SRV-AZIENDALE-01", 16, "192.168.1.10");
        
        mioServer.accendere();
        mioServer.riavviaServizi();

        System.out.println("\n--- TEST GESTIONE ECCEZIONI (SMARTPHONE) ---");
        try {
            System.out.println("Tento di impostare la memoria a -10 GB...");
            mioTelefono.setMemoriaGB(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Eccezione catturata correttamente: " + e.getMessage());
        }

        try {
            System.out.println("Tento di impostare un Sistema Operativo vuoto...");
            mioTelefono.setSistemaOperativo("");
        } catch (IllegalArgumentException e) {
            System.out.println("Eccezione catturata correttamente: " + e.getMessage());
        }

        System.out.println("\n--- TEST GESTIONE ECCEZIONI (SERVER) ---");
        try {
            System.out.println("Tento di impostare il numero di processori a 0...");
            mioServer.setNumeroProcessori(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Eccezione catturata correttamente: " + e.getMessage());
        }

        try {
            System.out.println("Tento di impostare un prezzo base negativo...");
            mioServer.setPrezzoBase(-500.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Eccezione catturata correttamente: " + e.getMessage());
        }
    }
}