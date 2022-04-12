
package sistock;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Control {

    
    public boolean CadenaNoNula(String c){
        boolean b = true;
        if(c.equalsIgnoreCase("")){
            b = false;
        }
        return b;
    }
    
    public boolean DNIValido(int dni){
        boolean b = false;
        if(dni > 1000000 && dni < 100000000) b = true;
        return b;
    }
    
    public boolean CUITValido(String cuit){
        boolean b = false;
        Pattern pattern = Pattern.compile("^[0-9]+{2}[-]+[0-9-]+{7,8}[-]+[0-9]+$");
        Matcher mather = pattern.matcher(cuit);
        if (mather.find() == true) b = true;
        else b = false;
        return b;
    }
        
    public boolean validarEmail(String email){
        boolean b = false;
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        if (mather.find() == true) b = true;
        else b = false;
        return b;
    }
    
    public boolean validarCodE(int c){
        boolean b = false;
        if(c > 999 && c < 100000) b = true;
        return b;
    }
    
    
}
