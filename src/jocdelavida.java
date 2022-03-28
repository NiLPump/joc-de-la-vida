import java.util.Scanner;
public class jocdelavida {
    Scanner e = new Scanner(System.in);
    int i, j;
    int vida;

    public static void main(String[] args) {
        jocdelavida p = new jocdelavida();
        p.principal();

    }

    public void principal() {
        boolean fi = false;
        System.out.println("Introdueix les files: ");
        i = e.nextInt();
        System.out.println("Introdueix les columnes: ");
        j = e.nextInt();
        int [][]array = new int [i][j];


        do {
            System.out.println();
            System.out.println();
            System.out.println("Tria una opció: ");
            System.out.println();
            System.out.println("Manual [1] ");
            System.out.println("Automàtic [2]");
            System.out.println("Imprimir taula [3]");
            System.out.println("Sortir [4] ");
            int opcio = e.nextInt();
            switch (opcio){
                case 1: manual(vida, array);
                break;
                case 2: automatic(vida, array);
                break;
                case 3: imprimirArray(array);
                break;
                case 4: fi = true;
                break;
            }

        }while (!fi==true);
    }

    public void imprimirArray(int  [][]array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }


    public void manual (int vida, int [][]array){
        int a = 5;
        for (a=0; a<5; a++){
            System.out.println("Introdueix una fila: ");
            i = e.nextInt();
            i = (i - 1);
            System.out.println("Introdueix una columna: ");
            j = e.nextInt();
            j = (j - 1);
            if (i > array.length || j > array.length) {
                System.out.println("ERROR: Fora dels limits ");
            } else if (i <= array.length && j <= array.length){
                if (array[i][j] > 0) {
                    System.out.println("ERROR: Ja hi ha un celula en aquesta posició ");
                } else if (array[i][j] == 0) {
                    System.out.println("Introdueix un numero: ");
                    vida = e.nextInt();
                    array[i][j] = vida;
                }
            }
        }
    }

    public void automatic (int vida, int [][]array){
        int a = 5;
        for (a = 0; a < 5; a++){
            i = (int)(Math.random()*array.length);
            j = (int)(Math.random()*array[i].length);
            vida = 1;
            array[i][j] = vida;
        }
    }

    public void jugar (int [][]array, int [][]array2){

    }
}