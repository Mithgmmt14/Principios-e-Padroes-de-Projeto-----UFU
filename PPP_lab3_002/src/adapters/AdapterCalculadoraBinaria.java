package adapters;

import calculadora.*;
import calculadoraBinaria.*;

public class AdapterCalculadoraBinaria implements Calculadora {
    private CalculadoraBinaria calculadorabinaria;

    public AdapterCalculadoraBinaria(CalculadoraBinaria calculadoraBinaria) {
        this.calculadorabinaria = calculadoraBinaria;
    }

    @Override
    public int somar(int a, int b) {
        if (a >= 0 && b >= 0) {
            String aBinario = Integer.toBinaryString(a);
            String bBinario = Integer.toBinaryString(b);
            String resultadoBinario = calculadorabinaria.somar(aBinario, bBinario);
            return Integer.parseInt(resultadoBinario);
        } else if (a < 0 && b < 0) {
            String aBinario = Integer.toBinaryString(-a);
            String bBinario = Integer.toBinaryString(-b);
            String resultadoBinario = calculadorabinaria.somar(aBinario, bBinario);
            return -Integer.parseInt(resultadoBinario);
        } else if (a >= 0 && b < 0) {
            return subtrair(a, -b);
        } else {
            return subtrair(b, -a);
        }
    }

    @Override
    public int subtrair(int a, int b) {
        if (a >= 0 && b >= 0) {
            String aBinario = Integer.toBinaryString(a);
            String bBinario = Integer.toBinaryString(b);
            String resultadoBinario = calculadorabinaria.subtrair(aBinario, bBinario);

            boolean ehNegativo = resultadoBinario.startsWith("-");
            if (ehNegativo) {
                resultadoBinario = resultadoBinario.substring(1);
            }

            int resultadoFinal = Integer.parseInt(resultadoBinario);
            return ehNegativo ? -resultadoFinal : resultadoFinal;
        }

        if (a < 0 && b < 0) {
            return subtrair(-b, -a);
        }
        if (a >= 0 && b < 0) {
            return somar(a, -b);
        }
        return -somar(-a, b);
    }

    @Override
    public int multiplicar(int a, int b) {
        int vezes = Math.abs(b);
        String resultadoBinario = "0";
        String aBinario = Integer.toBinaryString(Math.abs(a));

        for (int i = 0; i < vezes; i++) {
            resultadoBinario = calculadorabinaria.somar(resultadoBinario, aBinario);
        }

        int resultadoFinal = Integer.parseInt(resultadoBinario);

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            resultadoFinal = -resultadoFinal;
        }

        return resultadoFinal;
    }
}
