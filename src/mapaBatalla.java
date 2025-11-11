import java.util.Scanner;

public class mapaBatalla {
    public static void imprimirTablero(char[][]tablero, int num)
    {
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                System.out.print(tablero[i][j] + " ");
            }
            //colocamos un salto vacio para que al pasar el primer for,el siguiente se imprima abajo y no adelante.
            System.out.println(" ");
        }
    }
    public static void main (String[] ads)
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿De cuanto quieres que sea el tablero?");
        int num=lector.nextInt();

        //para el tamaño del tablero cojemos la variable "num" que es la que pedimos al usuario por teclado.

        char tablero[][]=new char[num][num];
        //pedimos al usuario q nos de un array
        for(int i=0;i< num;i++)
        {
            for (int j=0;j<num;j++)
            {
                tablero[i][j]='.';

            }

        }
        //mostramos tamaño del tablero de batalla.
        System.out.println("el tamaño del tablero es de:" + num + " x " + num);
        imprimirTablero(tablero,num);
        






    }


}