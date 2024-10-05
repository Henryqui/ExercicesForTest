import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{9, 2, 3, 1, 4};


        Arrays.sort(array);

        int[] array2 = encontrarNumerosRestantes(array, 10);

        System.out.println("Nova array com os números faltantes: " + Arrays.toString(array2));
    }

    public static int[] encontrarNumerosRestantes(int[] array, int limite){

        boolean[] numQuetem = new boolean[limite];


        for (int i = 0; i < array.length; i++) {
            if (array[i] <= limite) {
                numQuetem[array[i] - 1] = true;
            }
        }

        int numQueNTem = 0;
        for (int i = 0; i < limite; i++) {
            if (!numQuetem[i]) {
                numQueNTem++;
            }
        }

        int[] array2 = Arrays.copyOf(array, array.length + numQueNTem);

        int a = array.length;
        for (int i = 0; i < limite; i++) {
            if (!numQuetem[i]) {
                array2[a++] = i + 1;
            }
        }

        Arrays.sort(array2);

        return array2;
    }
}
