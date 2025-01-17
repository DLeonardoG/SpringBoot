
package campus.u2.potaxie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuraciones {
    
    @Bean
    public Usuario potaxie(){
        return new Potaxie("Holguer");
    }
    
    @Bean
    public Usuario fife(){
        Fife fife = new Fife();
        return fife;
    }
    
    @Bean
    public Moto moto(){
        return new Moto();
    }
}
