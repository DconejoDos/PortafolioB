import java.util.Scanner;
public class JumpingMario {
    public static void main(String[] args) {
        //Declaramos un Scanner
        Scanner in= new Scanner(System.in);
        //Para el total de casos por cada ejecucion del algoritmo
        int cases=  in.nextInt();
        //Auxuliar comienza en 1 y va hasta cases para el total de casos
        int aux=1;
        //Ciclo para el total de casos
        while (aux<=cases){
            //Variable para los saltos altos
            int highJump = 0;
            //Variable para los saltos bajos
            int lowJump = 0;
            //Variable para la longitud del tamaño de saltos por cada caos
            int longitud = in.nextInt();
            //Arreglo de enteros para guardar todas las alturas de la paltaforma
            int [] arr = new int [longitud];
            //Ciclo de o a longitud para en cada caso recorrer la cantidad de plataformas
            for (int i = 0; i < longitud; i++) {
                //Añadir al arreglo el siguiente entero del Scanenr
                arr[i]= in.nextInt();
                //Si no es el primero entero en ser guardado en el Scanner
                if (i > 0) {

                    //Verificia si el indice en -1 es menor al indice en i del arreglo
                    if(arr[i-1]<arr[i]){
                        //Suma 1 al contador de salto alto
                        highJump+=1;
                    }
                    //Si no verifica si el indice en i-1 es mayor al indice en i del arreglo
                    else if(arr[i-1]>arr[i]){
                        //Suma 1 al contador de salto bajo
                        lowJump+=1;
                    }
                    //Si las plataformas son iguales d ealtas no suma a ningun contadolr
                }
            }
            //Imprime por cada caso, el caso, los saltos altos y los saltos bajos
            System.out.println("Case "+ aux + ": " + highJump + " "+ lowJump);
            //Para al siguiente caso
            aux+=1;
        }

    }
}
