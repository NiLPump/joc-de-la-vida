import java.util.Scanner;
public class jocdelavida {

    public static void main(String[] args) {
        jocdelavida p = new jocdelavida();
        p.principal();

    }

    public void principal() {
        int[][] array = new int[10][10];

    }

    public void insertarCelula(int celula, int [][]array){
        Scanner e = new Scanner(System.in);
        System.out.println("Selecciona una fila 1-10:");//Seleccionar fila
        i = e.nextInt();
        i = (i-1);
        System.out.println("Selecciona una columna 1-10");//Seleccionar colummna
        j = e.nextInt();
        j = (j-1);
        if (i > 10 || j > 10){
            System.out.println("Estas fora dels marges, selecciona una altre fila i columna dintre dels marges (10f, 10c!)");//Comprobar fila/columna
        }
        else if (i <= 10 && j <=10 ) {
            if (array[i][j]>0){
                System.out.println("Ja hi ha un numero en aquesta casella! Selecciona una altre!");

            }else if (j[i][j]==0){//dipositar numero
                System.out.println("Quin numero vols dipositar?");
                int numero = e.nextInt();
                j[i][j]= numero;
            }
        }
    }
}
