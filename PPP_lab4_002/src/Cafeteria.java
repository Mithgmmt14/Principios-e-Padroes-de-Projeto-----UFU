import Decorator.*;
import ObjetosBase.*;

public class Cafeteria {
    public static void main (String[] args) {

        CafeDecorator cappuccino = new CanelaDecorator(
                new ChocolateDecorator(
                        new LeiteDecorator(
                                new Expresso())));

        CafeDecorator mocha = new ChocolateDecorator(
                new LeiteDecorator(
                        new Expresso()));

        CafeDecorator decafEspecial = new CanelaDecorator(
                new ChocolateDecorator(
                        new LeiteDecorator(
                                new Decaf())));
        CafeDecorator cafeComCanela = new CanelaDecorator(
                new LeiteDecorator(
                        new Expresso()));

        System.out.println("1. CAPPUCCINO -> " + "[Descrição] : " + cappuccino.getDescricao() + " [Preço] : "+ cappuccino.calculaCusto());
        System.out.println("2. MOCHA -> " + "[Descrição] : " + mocha.getDescricao() + " [Preço] : "+ mocha.calculaCusto());
        System.out.println("3. DECAF ESPECIAL -> " + "[Descrição] : " + decafEspecial.getDescricao() + " [Preço] : "+ decafEspecial.calculaCusto());
        System.out.println("4. CAFÉ COM CANELA -> " + "[Descrição] : " + cafeComCanela.getDescricao() + " [Preço] : "+ cafeComCanela.calculaCusto());
    }
}