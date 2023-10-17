
import java.util.*;

public class LunchBreak {


    public static void main(String[] args) {
        //Declaramos Scanner
        Scanner uwu = new Scanner (System.in);
        //Declaramos un entero t que sera el numero de casos
        int t = uwu.nextInt();
        //Ciclo para todos los casos
        while(t!=0){
            //declaramos un arreglo de longs de tamaño 3, por que siempre tendramos 3 opciones de caminos
            long []cases = new long[3];
            //inicializamos el resultado en 0
            int resultado = 0;
            //declaramos un auxiliar en 0
            long aux = 0;
            //ciclo que se repite 3 veces, para recorrer los 3 caminos
            for (int i = 0; i < 3; i++) {
                //agregamos en el arreglo cada long que nos de el Scanner
                cases[i] = uwu.nextLong();
                //Si es el primer long en ser agregado
                if(i == 0) {
                    // el aux es el numero recien agregado
                    aux = cases[i];
                    //el resultado sera el camino 1
                    resultado= i+1;
                }
                //Si ya se agrego algun Long a el arreglo
                else{
                    //Si el Long recien agregado es menor a el auxiliar
                    if(cases[i]<aux) {
                        //el auxiliar es el nuevo numero comparado
                        aux = cases[i];
                        // y el resultado es el indice del numero recien comparado
                        resultado= i+1;
                    }
                }
            }
            //Si el resultado es cada camino escrime la respuesta en cada caso
            if(resultado==1) System.out.println("First");
            else if (resultado == 2) System.out.println("Second");
            else System.out.println("Third");


            //Pasa al siguiente caso
            t--;
        }



    }



}
