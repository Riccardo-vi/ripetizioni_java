package esercizi.es6;

public class MainStudioAssociato {
    public static void main(String[] args) {
        
        MembroStaff staff = new MembroStaff("Luca", "Rossi", 6, "Amb-02");
        System.out.println(staff.getProfiloProfessionale());
        System.out.println();

       
        Medico medico = new Medico("Elena", "Gialli", 10, "Amb-05", "Cardiologia", "ALBO-GE-45892");
        System.out.println(medico.getProfiloProfessionale());
        System.out.println();

        
        Chirurgo chirurgo = new Chirurgo("Marco", "Neri", 18, "Amb-10", "Chirurgia Generale", "ALBO-MI-99881", 420, true);
        System.out.println(chirurgo.getProfiloProfessionale());
    }
}
