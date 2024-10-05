

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array= new int[]{1, 15, 2, 7, 2, 5, 7, 1, 4};

        System.out.println("Digite o número que você gostaria de verificar" +
                " se é resultado da soma de dois números da array: ");
        int num = sc.nextInt();

        System.out.println("A função teve como resultado " + checarSoma(num, array));
    }

    public static boolean checarSoma(int num, int[] array){
        boolean checado = false;

        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] + array[j] == num){
                    checado = true;
                }
            }
        }

        return checado;
    }

}
