
import java.util.*;
public class CheckTheString {
    public static void main(String[] args) {
        //Scanner para recibir datos
        Scanner jg = new Scanner (System.in);
        //Ciclo hasta que el scanner este vacío
        while(jg.hasNext()) {
            //Cadenas de texto principal a ser evaluada
            String s = jg.next();
            //Enteros para contar cada letra en S
            int cuentaA = 0, cuentaB = 0, cuentaC = 0;
            //Indicativos para saber si ya aparecio una b o una c en S
            int indicativoB = -2, indicativoc = -2;
            //Comenzamos declarando el String como valido
            boolean esValido = true;
            //Recorremos S
            for (int i = 0; i < s.length(); i++) {

                //Obtenemos de S cada caracter
                char letraActual = s.charAt(i);
                //Caso para la letra A
                if (letraActual == 'a') {
                    //Aumentamos el contador de A en 1
                    cuentaA++;
                    //Verificamos que no se haya puesto una b o c antes de una a
                    if (indicativoB != -2 || indicativoc != -2) {
                        //la palabra ya no es valida y rompre el ciclo
                        esValido = false;
                        break;
                    }
                }
                //Caso para la letra B
                else if (letraActual == 'b') {
                    //Aumentamos la cuenta de B en 1
                    cuentaB++;
                    //Verificamos que no exista ninguna c antes de una b
                    if (indicativoc != -2) {
                        //La palabra no es valida y se rompre el ciclo
                        esValido = false;
                        break;
                    }
                    //Si es la primera b en S cambia el indicativo a el indice
                    if (indicativoB == -2) indicativoB = i;
                }
                //Caso para la letra C
                else {
                    //Aumenta la cuenta en C en 1
                    cuentaC++;
                    //Si es la primera c cambia el indicativo a el indice
                    if (indicativoc == -2) indicativoc = i;
                }

            }
            //Verifica todas las condidiones para que la palabra sea valida
            //La variable es valido, verifica que exista almenos una a,b o c en S, verifica que el indicativo de B sea anterior al de C
            // y por ultima que al menos dos de 3 letras sean de igual tamaño.
            if (esValido && cuentaA > 0 && cuentaB > 0 && cuentaC > 0 && indicativoB < indicativoc && (cuentaC == cuentaA || cuentaC == cuentaB))
                System.out.println("YES");
            //La palabra no es aceptada
            else System.out.printf("NO");
        }
    }
}
