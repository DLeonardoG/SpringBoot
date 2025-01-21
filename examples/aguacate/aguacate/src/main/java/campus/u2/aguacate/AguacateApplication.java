package campus.u2.aguacate;

import campus.u2.aguacate.domain.service.AvocadoServiceImpl;
import campus.u2.aguacate.persistence.entity.Avocado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AguacateApplication {

	public static void main(String[] args) {
                ConfigurableApplicationContext contexto = SpringApplication.run(AguacateApplication.class, args);
//                AvocadoServiceImpl avocadoServiceImpl = contexto.getBean(AvocadoServiceImpl.class);
                
//                SaveAvocado
//                Avocado avocado = new Avocado("Potaxiano", Double.valueOf("100"), Boolean.FALSE);                
//                avocadoServiceImpl.saveAvocado(avocado);
                
//                System.out.println(avocadoServiceImpl.getAllAvocados());
	}

}
