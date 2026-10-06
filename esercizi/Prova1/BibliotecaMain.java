package esercizi.Prova1;

public class BibliotecaMain {
    public static void main (String[] args) {
        // Creazione di un libro
        Libro libro1 = new Libro("Il Signore degli Anelli", "L001", 1954, "J.R.R. Tolkien", 1216);
        Libro libro2 = new Libro("1984", "L002", 1949, "George Orwell", 328);
        libro1.getInfo();
        libro1.prestato();
        libro1.prestato();
        libro1.getInfo();
        libro1.restituito();
        libro1.getInfo();

        libro2.prestato();
        libro2.prestato();
        libro2.restituito();
        libro2.restituito();
        libro2.getInfo();

        System.out.println();

        // Creazione di un DVD
        DVD dvd1 = new DVD("Inception", "D001", 2010, "Christopher Nolan", 148);
        DVD dvd2 = new DVD("The Matrix", "D002", 1999, "Lana Wachowski, Lilly Wachowski", 136);
        dvd1.getInfo();
        dvd1.prestato();
        dvd1.getInfo();
        dvd1.restituito();
        dvd1.getInfo();

        System.out.println();

        // Creazione di una rivista
        Rivista rivista1 = new Rivista("National Geographic", "R001", 2021, 5, "Maggio");
        Rivista rivista2 = new Rivista("Time", "R002", 2021, 10, "Ottobre");
        rivista1.getInfo();
        rivista1.prestato();
        rivista1.getInfo();
        rivista1.restituito();
        rivista1.getInfo();
    }
}
