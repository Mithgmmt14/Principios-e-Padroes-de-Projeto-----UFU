import Template.*;

public class Cafeteria {
    public static void main(String[] args){
        System.out.println("=================== TESTES ====================");
        ProdutoTemplate cafe = new Cafe();
        cafe.preparoCompleto();
        System.out.println("================================================");

        ProdutoTemplate capuccino= new Capuccino();
        capuccino.preparoCompleto();
        System.out.println("================================================");

        ProdutoTemplate cha = new Cha();
        cha.preparoCompleto();
        System.out.println("================================================");
    }
}

