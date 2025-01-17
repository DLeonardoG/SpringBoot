package campus.u2.potaxie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PotaxieApplication {

	public static void main(String[] args) {
		SpringApplication.run(PotaxieApplication.class, args);
                
                ApplicationContext contexto = new AnnotationConfigApplicationContext(Configuraciones.class);
                
//                Usuario potaxie = contexto.getBean(Potaxie.class);
//                Usuario fife = contexto.getBean(Fife.class);
//                
//                System.out.println(potaxie.hablar());
//                System.out.println(fife.hablar());

                Moto moto = contexto.getBean(Moto.class);
                System.out.println(moto.getPropietario());
                moto.hacerRuido();
	}

}
