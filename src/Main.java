import listaOrdenada.IntArrayList;
import listaOrdenada.IntVector;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        System.out.println(dobleNumero(new BigDecimal("4.788534")));
        invertirSigno(new BigDecimal("-4.788534"));


        IntArrayList intArrayList = new IntArrayList();

        for (int i = 1; i <= 16; i++) {
            intArrayList.add(i);
        }

        int[] num= intArrayList.getArrayNumeros();

        System.out.println("\n\n====LISTA 1=====");
        for (int numero:num) {
            System.out.println(numero);
        }

        IntVector intVector = new IntVector();

        for (int i = 1; i <= 21; i++) {
            intVector.add(i);
        }

        num = intVector.getArrayNumeros();

        System.out.println("\n\n====LISTA 2=====");

        for (int numero : num){
            System.out.println(numero);
        }

    }

    public static double dobleNumero(BigDecimal bigDecimal){
        System.out.println("\n======= EJERCICIO 1 ========");
        double result = bigDecimal.multiply(new BigDecimal("2")).setScale(2,RoundingMode.HALF_UP).doubleValue();
        return result;
    }

    public static void invertirSigno(BigDecimal bigDecimal){
        System.out.println("\n======= EJERCICIO 2 ========");
        BigDecimal result = bigDecimal.multiply(new BigDecimal("-1")).setScale(1,RoundingMode.HALF_UP);
        System.out.println(result);
    }
}