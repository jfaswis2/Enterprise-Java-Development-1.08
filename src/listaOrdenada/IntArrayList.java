package listaOrdenada;

public class IntArrayList implements IntList{
    private int[] arrayNumeros = new int[10];
    private int contador = 0;

    public IntArrayList() {}

    public void add(int num) {

        if (contador< arrayNumeros.length) {
            arrayNumeros[contador] = num;
        } else {
            int [] nuevoArr = new int[(int) (arrayNumeros.length * 1.5)];
            for (int i = 0; i < arrayNumeros.length; i++) {
                nuevoArr[i] = arrayNumeros[i];
            }
            nuevoArr[contador] = num;
            arrayNumeros = nuevoArr;
        }
        contador++;
    }


    public int get(int index) {
        if(index > arrayNumeros.length && index < 0){
            return -1;
        } else {
            return arrayNumeros[index];
        }
    }

    public int[] getArrayNumeros() {
        return arrayNumeros;
    }
}
