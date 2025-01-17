package campus.u2.carro;

import campus.u2.carro.controller.CarroService;
import campus.u2.carro.model.clases.Carro;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CarroApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CarroApplication.class, args);

        CarroService carroService = context.getBean(CarroService.class);

        //Save car
        Carro carro = new Carro("Mazda", null, 2020, 70);
        carroService.saveCar(carro);
        //Get all cars
//        List<Carro> carros = carroService.getAll();
//        System.out.println("Todos los carros");
//        for (Carro carro : carros) {
//            System.out.println(carro);
//        }
        
        //Get cars by marca
//        List<Carro> carros = carroService.buscarPorMarca("Mazda");
//        System.out.println("Todos los carros de marca mazda");
//        for (Carro carro : carros) {
//            System.out.println(carro);
//        }

    }

}
