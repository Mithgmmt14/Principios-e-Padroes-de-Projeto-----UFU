import Decorator.*;
import ObjetoBase.*;

public class Pizzaria {
    public static void main ( String[]args){
        PizzaDecorator marguerita = new OreganoDecorator(
                new TomateDecorator(
                        new QueijoDecorator(
                                new MassaEspessaPizza())));

        Pizza pepperoni = new PepperoniDecorator(
                new QueijoDecorator(
                        new MassaEspessaPizza()));

        Pizza ovo = new TomateDecorator(
                new OvoDecorator(
                        new QueijoDecorator(
                                new MassaEspessaPizza())));

        Pizza vegetariana = new OreganoDecorator(
                new TomateDecorator(
                        new MassaEspessaPizza()));

        System.out.println("1. MARGUERITA -> " + "[Descrição] : " + marguerita.getDescricao() + " [Preço] : "+ marguerita.getPreco());
        System.out.println("2. PEPPERONI -> " + "[Descrição] : " + pepperoni.getDescricao() + " [Preço] : "+ pepperoni.getPreco());
        System.out.println("3. OVO -> " + "[Descrição] : " + ovo.getDescricao() + " [Preço] : "+ ovo.getPreco());
        System.out.println("4. VEGETARIANA -> " + "[Descrição] : " + vegetariana.getDescricao() + " [Preço] : "+ vegetariana.getPreco());
    }
}
