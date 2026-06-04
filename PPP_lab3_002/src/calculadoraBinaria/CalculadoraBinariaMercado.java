package calculadoraBinaria;

public class CalculadoraBinariaMercado implements CalculadoraBinaria{

    @Override
    public String somar(String a, String b) {
        if (a == null || a.isEmpty()) return b;
        if (b == null || b.isEmpty()) return a;

        String aInvertida = new StringBuilder(a).reverse().toString();
        String bInvertida = new StringBuilder(b).reverse().toString();

        StringBuilder resultadoInvertido = new StringBuilder();
        int carry = 0;
        int i = 0;

        while (i < aInvertida.length() || i < bInvertida.length() || carry > 0) {
            int bitA = (i < aInvertida.length()) ? (aInvertida.charAt(i) - '0') : 0;
            int bitB = (i < bInvertida.length()) ? (bInvertida.charAt(i) - '0') : 0;

            int soma = bitA + bitB + carry;

            resultadoInvertido.append(soma % 2);
            carry = soma / 2;

            i++;
        }

        return resultadoInvertido.reverse().toString();
    }

    @Override
    public String subtrair(String a, String b) {
        if (a == null || b == null) return "0";

        String aInvertida = new StringBuilder(a).reverse().toString();
        String bInvertida = new StringBuilder(b).reverse().toString();
        boolean negativo = false;

        if (a.length() < b.length() || (a.length() == b.length() && a.compareTo(b) < 0)) {
            String temp = aInvertida;
            aInvertida = bInvertida;
            bInvertida = temp;
            negativo = true;
        }

        StringBuilder resultadoInvertido = new StringBuilder();
        int borrow = 0;
        int i = 0;

        while (i < aInvertida.length()) {
            int bitA = aInvertida.charAt(i) - '0';
            int bitB = (i < bInvertida.length()) ? (bInvertida.charAt(i) - '0') : 0;

            int diff = bitA - bitB - borrow;
            if (diff < 0) {
                diff += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }
            resultadoInvertido.append(diff);
            i++;
        }

        String resultadoFinal = resultadoInvertido.reverse().toString().replaceFirst("^0+(?!$)", "");

        return negativo ? "-" + resultadoFinal : resultadoFinal;
    }
}
