import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Elephant  {

	public static void main(String[] args) throws IOException  {
		//Se declara un BufferedReader teniendo en cuenta las Exception
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//Se va referir a las lineas que lee desde el Buffered
        String y;
        //Ciclo itera hasta que la linea leida por Buffered en y no sea nula, es decir
        //hasta que se  dejen de ingresar datos
        //El ciclo tambien soluciona iterativamente a x que es el entero a tratar, con el metodo Solve
		while (( y = reader.readLine()) != null) {
            int x = Integer.parseInt(y);
            System.out.println(solve(x)); 
        }
		
	}	
    //Metodo que soluciona el problema
	public static int solve(int x) {
        //Res es el entero responsable de dar la respuesta, en este caso la cantidad de pasos del elefante
		int res = 0;
		//Comienza un ciclo infinito
		while(true) {
            //Si x>=5 se dice que el elefante puede dar 1 o mas pasos de tamaño 5
			if( x >= 5) {
                //A res se le suma los pasos de tamaño 5,se hace el casting (int)5, para evitar los decimales y a 
                //x se le restan los pasos*5 para guardar en x los pasos restantes.
                //Si x=0, rompe el ciclo, es decir que la minima cantidad de pasos del elefante es realizable con pasos de 
                //longitud 5.
				res += (int)x/5;
				x -= res*5;
				if(x==0)break;
				
			}
            //Si es menor a 5, se le suma uno a res, pues solo quedaria un paso independientemente si es de 1,2,3 o 4 del elefante.
			else {
			
				res += 1;
				break;
			}
		}
		
		
		// retorna la respuesta
		return res;
	}

}
