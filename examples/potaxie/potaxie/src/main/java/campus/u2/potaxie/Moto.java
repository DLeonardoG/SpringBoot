
package campus.u2.potaxie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Moto {
    
    @Autowired
    private Fife propietario;
    
    public Moto(){
        
    }
    
    public Fife getPropietario(){
        return propietario;
    }
    
    public void hacerRuido(){
        System.out.println("Run run putites!!");
    }
}
