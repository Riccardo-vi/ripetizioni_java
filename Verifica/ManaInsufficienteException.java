package Verifica;

public class ManaInsufficienteException extends Exception{ // corretto
     public ManaInsufficienteException(String messaggio){
         super(messaggio);
     }
}