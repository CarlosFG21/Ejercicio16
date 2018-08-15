
package ejercicio16video21;

import java.util.*;
import javax.swing.JOptionPane;

public class prueba {
    
    public void operacion(){
        
        int arroba = 0;
    
    boolean punto = false;
    
    String correo = JOptionPane.showInputDialog("INGRESA TU DIRECCION DE EMAIL");
    
    for(int i=0; i<correo.length(); i++){
    
        if(correo.charAt(i)=='@'){
            
            arroba++;
            
        }
        
        if(correo.charAt(i)=='.'){
            
            punto = true;
        }
        
    }
    
    if(arroba == 1 && punto==true){
        
        JOptionPane.showMessageDialog(null,"EL EMAIL ES CORRECTO");
        
    }else{
        
        JOptionPane.showMessageDialog(null,"EL EMAIL ES INCORRECTO");
    }
    
        
        }
    }

