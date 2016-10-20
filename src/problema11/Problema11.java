/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema11;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
       n=solicitarDato();
       conversorRomano(n);
       System.out.println( "El numero " + n + " a romano es: " + conversorRomano(n) );
       mensajeSalida();
    }
    public static int solicitarDato(){
        int n;
        Scanner teclado= new Scanner (System.in);
        System.out.println("Introduce un numero para convertirlo a romano...");
        n= teclado.nextInt();
        return n;
    }
    public static String conversorRomano(int n){
        int i, millares, centenas, decenas, unidades;
        String romano= "";
        
        millares= n / 1000;
        centenas= n /100 % 10;
        decenas= n / 10 % 10;
        unidades= n % 10;
        
        for(i=1; i<=millares;++i){
            romano= romano + "M";
        }   
        //centenas
        if(centenas==9){ romano= romano + "CM";
        
        }else if (centenas>=5) { romano= romano + "D";
        
         for (i=6; i<=centenas; i++){ romano = romano + "C";
         }
        } else if (centenas==4){ romano = romano + "CD";
         }
          else { for(i=1; i<=centenas; i++){ romano= romano + "C";}
         }
         
         //decenas
         if (decenas==9){romano= romano + "XC";
         
         }else if (decenas>=5){ romano= romano + "L";
         
         for (i=6; i<=decenas; i++) { romano= romano + "X";
         }
         } else if (centenas==4) { romano = romano + "XL";
         }
         else { for (i=1; i<=decenas; i++){romano= romano + "X";}
         }
         //unidades
         
         if (unidades==9){ romano= romano + "IX";
         
         } else if (unidades>=5){romano = romano + "V";
         
         for (i=6; i<=unidades; i++){romano= romano + "I";
         }
         } else if (decenas==4){romano=romano + "IV";
         }
         else { for (i=1; i<=unidades; i++){ romano= romano + "I";}
         }
    
        
         return romano;
}
    
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa");
        System.exit(0);
    }

}
