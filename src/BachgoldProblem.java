
import java.util.ArrayList;
import java.util.Scanner;
public class BachgoldProblem {
    public static void main(String[] args) {
        //Declarar un Scanner
        Scanner jg = new Scanner(System.in);
        //Ciclo que itera hastq que Jg no reciba mas datos
        while (jg.hasNext()){
            //Entero que corresponde al resultado
            int res = 0;
            //Recibe un numero que sera la unica entrada por cada caso
            int x = jg.nextInt();
            //Lista que constara en cada casa del maximo numero de  numeros primos
            //que pueden descomponer a x
            ArrayList<Byte> numerosPirmos = new ArrayList<Byte>();
            //Aux nos ayuda a saber si es un numero par o no
            int aux = x % 2;
            //Si es par entra en esta condicional
            if(aux == 0) {
                //Itera  x/2 veces añadiendo un 2, se añade como (byte)2, por el casting. 
                for (int i = 0; i < x/2; i++)
                    numerosPirmos.add((byte)2);
                //Res sera el tamaño de la lista, es decir cuantos numero 2 componen a x
                res = numerosPirmos.size();
            }
            //Si es primo
            else{
                //Itera (x/2)-1 veces  y añade (byte)2
                for (int i = 0; i < (x/2)-1; i++)
                    numerosPirmos.add((byte)2);
                //Agreag un (byte)3 por ser un numero impar
                numerosPirmos.add((byte)3);
                //Res sera el tamaño de la lista, es decir cuantos numero 2 componen a x
                res = numerosPirmos.size();
            }
            //Imprime res, la longitud de la lista dependiendo del caso, con un salto de linea 
            System.out.println(res + "\n");
            //Recorre la lista para imprimir cada byte de la lista concatenado con un espacio para que se diferencie cada byte.
            for (int i = 0; i < numerosPirmos.size(); i++)
                System.out.print(numerosPirmos.get(i) +" ");

        }
        //Cierra el Scanner.
        jg.close();
    }



}
