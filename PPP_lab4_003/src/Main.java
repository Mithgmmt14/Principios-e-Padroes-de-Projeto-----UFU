import Fachada.*;
public class Main {
    public static void main (String[]args){
        CinemaFachada cinemateca = new CinemaFachada ();
        cinemateca.assistirFilme("Flow");
        cinemateca.fimDoFilme();
    }
}