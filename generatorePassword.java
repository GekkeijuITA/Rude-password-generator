import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.awt.*;

public class generatorePassword {
    private String password;
    public String generaPassword(){
        password="";
        int i;
        for(i=0;i<16;i++){            
            password+=(char)numeroCasuale();
        }
        return password;
    }
    
    public int numeroCasuale(){
        int min=33,max=126;
        int rand=ThreadLocalRandom.current().nextInt(min, max + 1);
        return rand;
    }
    
    public void copia(String psw,String utente,File f) throws IOException{//crea un file         
            Desktop desktop = Desktop.getDesktop();
            FileWriter w= new FileWriter(f);
            desktop.open(f);
            w.write("Nome utente: "+utente+"\n");
            w.write("Password: "+psw);           
            w.flush();     
            w.close();
    }
}
