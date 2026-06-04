import adapters.*;
import calculadora.*;
import calculadoraBinaria.*;

public class Main {
    public static void main ( String[] args ){
        System.out.println("==== TESTE Calculadora Decimal ====");
        Calculadora calcDecimal = new CalculadoraDecimal();

        System.out.println("Soma           = " + calcDecimal.somar(15, 5));
        System.out.println("Subtração      = " + calcDecimal.subtrair(15, 5));
        System.out.println("Multiplicação  = " + calcDecimal.multiplicar(15, 5));

        System.out.println();


        System.out.println("==== TESTE Calculadora Binária ====");

        Calculadora calcBinaria = new AdapterCalculadoraBinaria(new CalculadoraBinariaMercado());

        System.out.println("Soma           = " + calcBinaria.somar(10, 5));
        System.out.println("Subtração      = " + calcBinaria.subtrair(10, 4));
        System.out.println("Multiplicação  = " + calcBinaria.multiplicar(6, 3));

        System.out.println("\n==== Casos de teste adicionais (Sinais) ====");
        System.out.println("Subtração resultando em Negativo  = " + calcBinaria.subtrair(3, 8));
        System.out.println("Soma com número Negativo          = " + calcBinaria.somar(12, -4));
        System.out.println("Multiplicação com Negativo        = " + calcBinaria.multiplicar(4, -5));

    }
}
