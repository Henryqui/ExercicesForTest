
public class Main {
    public static void main(String[] args) {

        // Declaração da array
        int[] numeros = new int[]{2, 1, 5, 2, 5, 2, 1, 1, 1, 7, 9, 13, 127, 21};

        //Declaração da variavel que vai mover os números 1
        int posicao = 0;

        //Declaração da array temporaria que vai guardar os numeros != de 1
        int[] numerostemporario = new int[numeros.length];

        //Declaração da variavel que vai reposicionar os numeros != de 1
        int posicaotemporaria = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == 1){
                numeros[posicao++] = 1;

            }
            else {
                numerostemporario[posicaotemporaria++] = numeros[i];
            }

        }
        // Coloca novamente os numeros diferentes de um na array
        for (int i = 0; i < posicaotemporaria ; i++) {
            numeros[posicao++] = numerostemporario[i];
        }


        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}