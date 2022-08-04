package listaOrdenada;

public class IntArrayList implements IntList{
    private int[] arrayNumeros = new int[10];
    private int contador = 0;

    public int[] getArrayNumeros() {
        return arrayNumeros;
    }

    public IntArrayList() {

    }


    public void add(int num) {

        if (this.contador< arrayNumeros.length) {
            arrayNumeros[contador] = num;
            contador++;
            System.out.println(arrayNumeros.length);
        } else {
            int [] nuevoArr = new int[(int) (arrayNumeros.length * 1.5)];
            for (int i = 0; i < arrayNumeros.length; i++) {
                nuevoArr[i] = arrayNumeros[i];
            }
            arrayNumeros = nuevoArr;
            add(num);
            System.out.println(arrayNumeros.length);
            /*this.contadorArray = contadorArray + (contadorArray*50)/100;
            arrayNumeros = new int[this.contadorArray];
            for (int i = 0; i < arrayNumeros.length; i++) {

            }*/
        }
    }


    public void get() {

    }
}
