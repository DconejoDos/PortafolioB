import java.util.ArrayList;
import java.util.Scanner;
public class GameShopping {
    public static void main(String[] args) {
        //Declarar un Scanner
        Scanner jg = new Scanner(System.in);
        //Crea un ciclo que finaliza cuando el Scanner no tiene mas datos por recibir, se soluciona asi, por que en el enunciado
        //del problema no  dicen cuantos casos se van a solucionar por ejecución de cada codigo
        while (jg.hasNext()) {
            //res es la variable responsable de ser la RESpuesta
            int res = 0;
            //Dos listas que van a servir para guardar los datos
            ArrayList<Integer>listaN = new ArrayList<>();
            ArrayList<Integer>listaM = new ArrayList<>();
            //Dos enteros que se encargan cada uno de dar el tamaño de cada lista
            int n= jg.nextInt();
            int m= jg.nextInt();
            //Un ciclo que itera n veces hasta llenar la lista "listaN"
            for (int i = 0; i < n; i++)
                listaN.add(jg.nextInt());
            //Un ciclo que itera m veces hasta llenar la lista "listaM"
            for (int i = 0; i < m; i++)
                listaM.add(jg.nextInt());
            //Declaro otro contador ademas de i para recorrer la otra lista    
            int j =0;
            //Itera sobre n ya qie es el costo de cada juego, es decir no importa la lista M, que son los billetes
            //pues, lo importante es verificar si puede comprar los videojuegos
            for (int i = 0; i < n; i++) {
                //Se usa la funcion get de la lista para obtener el dato de la lista en el indice j o i
                //Verifica si se puede comprar el videojuego
                if(listaM.get(j)>=listaN.get(i)) {
                    //Si se cumple, le suma a resultado 1, le suma 1 a j, el contador de la lista m, 
                    //indicando que ese billete se uso, y verifica si se acabaron los billetes.
                    res +=1;
                    j++;
                    if(j==m) break;
                }

            }
            //Imprime la respuesta
            System.out.println(res);

        }
        //cierra el Scanner
        jg.close();
        
    }




}