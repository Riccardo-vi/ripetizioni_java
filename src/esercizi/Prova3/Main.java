package ripetizioni_java.Prova3;

public class Main {
    public static void main(String[] args) {
        // Test Auto
        Auto auto = new Auto(180, 4, "Fiat Panda");
        auto.suonaClacson();
        
        try {
            auto.setColor(""); // Lancerà eccezione
        } catch (IllegalArgumentException e) {
            System.out.println("Errore Auto: " + e.getMessage());
        }

        // Test Drone
        Drone drone = new Drone(60, 500, "DJI");
        drone.attivaModalitaScatto();
        
        try {
            drone.setAutonomia(0); // Lancerà eccezione
        } catch (IllegalArgumentException e) {
            System.out.println("Errore Drone: " + e.getMessage());
        }

        // Test Nave
        Nave nave = new Nave(40, 15000, "Amerigo Vespucci");
        nave.attivaSOS();
        
        try {
            nave.setCapacitaPasseggeri(-50); // Lancerà eccezione
        } catch (IllegalArgumentException e) {
            System.out.println("Errore Nave: " + e.getMessage());
        }
    }
}
