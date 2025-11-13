
import java.util.Random;
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
        //importamos clase de scanner y de aleatorio
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¿De cuanto quieres que sea el tablero?");
        int num=lector.nextInt();


        //mostramos tamaño del tablero de batalla.

        while (num<2){

                System.out.println("Vuelve a pedir");
                num= lector.nextInt();



        }
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
        System.out.println("el tamaño del tablero es de:" + num + " x " + num);
        imprimirTablero(tablero, num);
        //posicion del jugador

        int jugadorfila= random.nextInt(num);
        int jugadorColumna= random.nextInt(num);
        tablero[jugadorfila][jugadorColumna]='J';


        //Posicion Enemigo
        int enemigoFila= random.nextInt(num);
        int enemigoColumna= random.nextInt(num);
        tablero[enemigoFila][enemigoColumna]='E';

        boolean repetir=true;
        while (repetir)  //creamos condicion del bucle;
        {
             if(enemigoFila==jugadorfila && enemigoColumna==jugadorColumna)
             {
                 System.out.println("no puedes");
             }else
             {
                 System.out.println("juguemos");
             }
             repetir=false;
        }

        //Ponemos en el tablero.
        System.out.println("tablero con jugador y enemigo");
        for(int i=0;i< num;i++)
        {
            for (int j=0;j<num;j++)
            {

            }

        }
        System.out.println("el tamaño del tablero es de:" + num + " x " + num);
        imprimirTablero(tablero,num);


    }


}