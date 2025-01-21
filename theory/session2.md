# M1 - Sesión 2️⃣ : Manejo de dependencias y Java Beans (90 Minutos)

## Dificultad : ★★★☆☆

<aside>
📌 **Descripción de la sesión: Este módulo está diseñado para explicar los elementos principales para el manejo de dependencias y Java Beans adentro de nuestro proyecto de SpringBoot.**

---

**Tema general:** Manejo de dependencias y Java Beans.

**Objetivo de la sesión**: Dar introducción a las diferentes formas disponibles de implementar dependencias y Java Beans mediante su aplicación adentro de proyectos basados en Spring Boot con el fin de tener una base principal para iniciar a desarrollar de manera correcta y funcional de un servicio basado en Java.

**🎓 Después de la sesión, el estudiante aprenderá:**

- Conceptos básicos sobre las dependencias.
- Estructura principal de las dependencias.
- Implementación de dependencias.
- Conceptos básicos de Java Bean.
- Estructura principal de Java Bean.
- Implementación de un Bean mediante Serializable.

**Tiempo práctico estimado:** 90 minutos

</aside>

<aside>
📔 Tabla de contenidos

---

| [1. ¿Qué es una dependencia?](https://www.notion.so/1-Qu-es-una-dependencia-d1fde99d301b4df6983553046faa1676?pvs=21)  |
| --- |
| [1.1. ¿Qué es una dependencia? - Dependencias en la lógica del negocio](https://www.notion.so/1-1-Qu-es-una-dependencia-Dependencias-en-la-l-gica-del-negocio-f4e7c702ff124082b09706bf8e346898?pvs=21)  |
| [1.2. ¿Qué es una dependencia? - Inyección de dependencias](https://www.notion.so/1-2-Qu-es-una-dependencia-Inyecci-n-de-dependencias-b758df06dae5420d951c1d1aa8311a12?pvs=21)  |
| [2. Estructura básica de una dependencia ](https://www.notion.so/2-Estructura-b-sica-de-una-dependencia-79bb3136fae64a518d33fa5d0f360cbe?pvs=21)  |
| [3. Implementación de una dependencia general](https://www.notion.so/3-Implementaci-n-de-una-dependencia-general-6f9343f31b7f451fae87488f0d5c9bfb?pvs=21)  |
| [4. ¿Qué es un Java Bean?](https://www.notion.so/4-Qu-es-un-Java-Bean-d9d81f2f1914466382bec73f99aba889?pvs=21)  |
| [4.1.  ¿Qué es un Java Bean? - Sintáxis Básica](https://www.notion.so/4-1-Qu-es-un-Java-Bean-Sint-xis-B-sica-a90ea07593d049b98a92f8dbde8de930?pvs=21)  |
| [4.2.  ¿Qué es un Java Bean? - Ciclo de vida de Bean](https://www.notion.so/4-2-Qu-es-un-Java-Bean-Ciclo-de-vida-de-Bean-e1258f646b9a4ca18ac5bc0413e17554?pvs=21)  |
| [4.3.  Component](https://www.notion.so/4-3-Component-bf08876c455e49d0beb76c85bc12e8f2?pvs=21)  |
</aside>

---

# 1. ¿Qué es una dependencia?

![9405338.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/e7f6b704-e8e0-43c8-a2e7-220614cd28ab/9405338.png)

En el ámbito de la programación, se establece una relación denominada "dependencia" entre dos módulos de código, donde un módulo, llamado "dependiente", requiere la presencia de otro módulo, conocido como "dependencia", para funcionar de manera adecuada. En términos sencillos, el módulo dependiente no puede operar de manera independiente sin la existencia del módulo en el que depende.

Existen dos tipos de dependencias a considerar:

1. **Dependencias directas:** Estas se establecen de manera inmediata entre dos módulos. Por ejemplo, si el módulo A utiliza la función f() del módulo B, se establece una dependencia directa de A hacia B.
2. **Dependencias transitivas:** Estas se generan de manera indirecta. Si el módulo A depende del módulo B, y a su vez, B depende del módulo C, entonces se establece una dependencia transitiva de A hacia C.

Las dependencias ofrecen diversas ventajas:

- **Reutilización de código:** Facilitan la reutilización de código común entre diferentes módulos, evitando la duplicación de esfuerzos y mejorando la mantenibilidad del código.
- **Modularidad:** Favorecen la modularidad del código, permitiendo la división en módulos independientes que pueden modificarse y probarse de manera individual.
- **Especialización:** Posibilitan que los desarrolladores se especialicen en la implementación de módulos específicos, sin necesidad de conocer todos los detalles de otros módulos.

No obstante, también existen desventajas asociadas a las dependencias:

- **Acoplamiento:** Incrementan el grado de acoplamiento entre módulos, lo que puede complicar la modificación y el mantenimiento del código.
- **Complejidad:** Dificultan la comprensión del código al requerir la consideración de las relaciones entre los diferentes módulos.
- **Vulnerabilidades:** Pueden ampliar la superficie de ataque del código, ya que las dependencias podrían contener vulnerabilidades de seguridad.

## 1.1. ¿Qué es una dependencia? - Dependencias en la lógica del negocio

Comprender la noción de dependencia es un concepto fundamental en la programación orientada a objetos (POO). En programación, la dependencia se refiere al grado en que una porción de código depende de otra para su correcto funcionamiento. En el contexto de la POO, solemos abordar las dependencias cuando una clase depende de otra para su funcionamiento. Por ejemplo, consideramos que la clase A es "dependiente" de la clase B si la clase A utiliza de alguna manera la clase B. Esto puede implicar llamar a un método de la clase B, utilizar una propiedad de la clase B o crear una instancia de la clase B. En términos más simples, cualquier cambio en la segunda clase podría potencialmente afectar la funcionalidad de la primera clase.

No obstante, no todas las dependencias son iguales. Mientras que algunas son necesarias y constituyen una parte saludable de un sistema orientado a objetos bien diseñado, otras pueden generar complicaciones como mayor complejidad, reducción de flexibilidad y dificultades en las pruebas. Dependencias mal gestionadas pueden hacer que el código sea difícil de mantener y modificar. 

<aside>
🖼️ Lógica de negocio en un sistema de cotizaciones. Tomado de: [enlace](https://blog.devgenius.io/how-to-code-in-java-spring-like-a-pro-dependency-injection-69249fdb68).

---

![0_LN_bPbd5w9NizTKC.webp](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/0b8e62ad-b665-43f7-9f70-0edf09782c61/0_LN_bPbd5w9NizTKC.webp)

</aside>

El diagrama exhibe la estructura de un sistema de cotizaciones que opera de la siguiente manera:

- La solicitud de una cotización proviene del cliente, y este puede realizarla a través de diversos canales como una interfaz web, una aplicación móvil o correo electrónico.
- El sistema de cotizaciones inicia una búsqueda en la base de datos para localizar los productos o servicios solicitados por el cliente, abarcando información detallada como precios, disponibilidad y características técnicas.
- Una vez obtenida la información relevante, el sistema de cotizaciones procede a generar una propuesta detallada que incluye el precio total, impuestos, plazos de entrega, condiciones de pago, entre otros elementos basados en la solicitud del cliente y la información de la base de datos.
- La cotización resultante es enviada al cliente a través de diversos medios como correo electrónico, fax, interfaz web o aplicación móvil.

## 1.2. ¿Qué es una dependencia? - Inyección de dependencias

![free-injection-icon-3674-thumb.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/8b1dc8ab-d9d6-4b23-9962-237373bd1c43/free-injection-icon-3674-thumb.png)

La inyección de dependencias (DI) es un patrón de diseño orientado a objetos que consiste en proporcionar a una clase los objetos que necesita para funcionar, en lugar de que la propia clase cree esos objetos. En otras palabras, la inyección de dependencias es un mecanismo que permite desacoplar las clases entre sí, haciendo que estas no dependan de la implementación de los objetos que necesitan. Por ejemplo, supongamos que tenemos una clase `Vehículo` que necesita un objeto `Motor` para funcionar. Si no usamos la inyección de dependencias, la clase `Vehículo` tendría que crear el objeto `Motor` por sí misma. Esto haría que la clase `Vehículo` estuviera acoplada a la clase `Motor`.Si usamos la inyección de dependencias, podríamos proporcionar a la clase `Vehículo` un objeto `Motor` ya creado. Esto haría que la clase `Vehículo` no dependiera de la implementación de la clase `Motor`.

La inyección de dependencias tiene una serie de beneficios, entre los que se incluyen:

- **Mejora la modularidad del código:** Al desacoplar las clases entre sí, la inyección de dependencias hace que el código sea más modular y fácil de mantener.
- **Reduce la complejidad del código:** La inyección de dependencias puede ayudar a reducir la complejidad del código, haciendo que este sea más fácil de entender y depurar.
- **Aumenta la flexibilidad del código:** La inyección de dependencias hace que el código sea más flexible, permitiendo cambiar la implementación de los objetos sin tener que modificar el código de las clases que los utilizan.

Existen diferentes formas de implementar la inyección de dependencias. Una de las formas más comunes es utilizar un contenedor de inyección de dependencias. Un contenedor de inyección de dependencias es un componente de software que se encarga de crear e inyectar los objetos necesarios a las clases que los necesitan.

Otros métodos para implementar la inyección de dependencias incluyen:

- **Inyección de constructores:** Este método consiste en inyectar los objetos necesarios a una clase a través de su constructor.
- **Inyección de propiedades:** Este método consiste en inyectar los objetos necesarios a una clase a través de sus propiedades.

# 2. Estructura básica de una dependencia

<aside>
<img src="/icons/code_gray.svg" alt="/icons/code_gray.svg" width="40px" /> Sintáxis básica de una dependencia en Java.

---

```java
// ClaseB.java
public class ClaseB {
    // Implementación de ClaseB
}

// ClaseA.java
public class ClaseA {
    private ClaseB objetoB;  // Declaración de la dependencia

    // Constructor que acepta un objeto de ClaseB como parámetro
    public ClaseA(ClaseB objetoB) {
        this.objetoB = objetoB;
    }

    // Resto de la implementación de ClaseA que utiliza objetoB
}

```

</aside>

El hecho simple de manejar una dependencia irá hacia cómo se crea la declaración y de aquí su uso en una clase separada.

En este ejemplo, `ClaseA` tiene una dependencia de `ClaseB`, la cual es pasada a través de un constructor. Esto sigue el principio de inyección de dependencias. Cuando creamos una instancia de `ClaseA`, necesitaremos proporcionar una instancia válida de `ClaseB`.

Veamos a continuación otro ejemplo de cómo se implementaría una dependencia en Java:

<aside>
<img src="/icons/code_gray.svg" alt="/icons/code_gray.svg" width="40px" /> Ejemplo general de uso de una dependencia en Java.

---

```java
// Definición de la interfaz Motor
interface Motor {
    void arrancar();
}

// Implementación de la interfaz Motor
class MotorGasolina implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Motor de gasolina arrancando...");
    }
}

// Clase Vehiculo que utiliza inyección de dependencias
class Vehiculo {
    private final Motor motor;

    // Constructor que acepta un objeto Motor
    public Vehiculo(Motor motor) {
        this.motor = motor;
    }

    // Método que utiliza el motor para arrancar el vehículo
    public void iniciar() {
        System.out.println("Iniciando el vehículo...");
        motor.arrancar();
    }
}

// Clase principal para probar el ejemplo
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto Motor de gasolina
        Motor motorGasolina = new MotorGasolina();

        // Creamos un objeto Vehiculo y le pasamos el motor de gasolina mediante inyección de dependencias
        Vehiculo miCoche = new Vehiculo(motorGasolina);

        // Iniciamos el vehículo
        miCoche.iniciar();
    }
}

```

</aside>

En este ejemplo, `Vehiculo` acepta un objeto `Motor` en su constructor, eliminando así la responsabilidad de crear el motor dentro de la clase `Vehiculo`. Esto sigue el principio de inyección de dependencias y hace que `Vehiculo` no esté acoplado a una implementación específica de `Motor`. Si en el futuro necesitas cambiar la implementación de `Motor` (por ejemplo, utilizar un motor eléctrico en lugar de un motor de gasolina), simplemente puedes proporcionar una nueva implementación de `Motor` sin afectar la lógica de `Vehiculo`.

# 3. Implementación de una dependencia general

Entendiendo sobre cómo una dependencia funciona a nivel general, veamos a continuación sobre cómo esta se puede implementar, o en otros casos, inyectar en un programa en Java:

<aside>
<img src="/icons/code_gray.svg" alt="/icons/code_gray.svg" width="40px" /> Implementación de una dependencia a nivel general:

---

```java
// Definición de la interfaz Servicio
public interface Servicio {
    void realizarOperacion();
}

// Implementación de la interfaz Servicio
public class ServicioImpl implements Servicio {
    @Override
    public void realizarOperacion() {
        System.out.println("Realizando operación en el servicio.");
    }
}

// Clase Cliente que utiliza inyección de dependencias
public class Cliente {
    private final Servicio servicio;  // Declaración de la dependencia

    // Constructor que acepta un objeto Servicio como parámetro (inyección de dependencia)
    public Cliente(Servicio servicio) {
        this.servicio = servicio;
    }

    // Método que utiliza el servicio para realizar una operación
    public void ejecutarOperacion() {
        System.out.println("Cliente ejecutando operación.");
        servicio.realizarOperacion();
    }

    public static void main(String[] args) {
        // Crear una instancia de Servicio
        Servicio servicio = new ServicioImpl();

        // Crear una instancia de Cliente e inyectar el Servicio
        Cliente cliente = new Cliente(servicio);

        // Ejecutar la operación en el cliente
        cliente.ejecutarOperacion();
    }
}

```

</aside>

En este ejemplo veremos los siguientes elementos a continuación:

1. `Servicio` es una interfaz que define el contrato para realizar una operación.
2. `ServicioImpl` es una implementación concreta de la interfaz `Servicio`.
3. La clase `Cliente` tiene una dependencia de la interfaz `Servicio`, que se declara en la clase mediante la variable de instancia `servicio`.
4. El constructor de `Cliente` acepta un objeto `Servicio` como parámetro, lo que permite inyectar la dependencia al crear una instancia de `Cliente`.
5. En el método `ejecutarOperacion` de `Cliente` se utiliza la instancia de `Servicio` para realizar una operación.

Ahora, su implementación dependerá de como lo queremos hacer, pues algunas dependencias serán de manera externa o interna, donde esta primera tendrá una dinámica parecida.

# 4. ¿Qué es un Java Bean?

![120176-200.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/73125e19-3c07-4da6-9411-bf7312c91779/120176-200.png)

Un "Bean" en el contexto del framework Spring se define como **un objeto administrado, creado y controlado por el contenedor de Spring**. Estos objetos son utilizados para encapsular y proveer servicios, utilidades y funcionalidades a otros componentes dentro de una aplicación. En Spring Boot se usa la anotación "@Bean" declarar un método como un bean. Este método debe retornar un objeto que se desea registrar como un bean en el contenedor de Spring y este último se encargará entonces de gestionar el ciclo de vida y de inyectarlo en otros componentes según sea necesario.

Los Java Bean tienen una serie de características y funcionalidades, las cuales son las siguientes:

1. **Reutilizable**: Los Beans están diseñados para ser empleados en distintas aplicaciones, lo que simplifica el proceso de desarrollo y mantenimiento del software.
2. **Manipulable visualmente**: Los Beans pueden ser manejados de manera visual en herramientas de desarrollo como los Entornos de Desarrollo Integrados (IDEs), facilitando así su utilización por parte de los desarrolladores.
3. **Serializable**: Los Beans pueden ser convertidos en una secuencia de bytes, lo que posibilita su almacenamiento y transmisión entre diferentes sistemas a través de la red o en dispositivos de almacenamiento.
4. **Propiedades**: Los Beans poseen propiedades que encapsulan tanto datos como comportamiento. Estas propiedades pueden ser de solo lectura o de lectura y escritura, dependiendo de la configuración deseada.
5. **Métodos**: Los Beans contienen métodos que permiten acceder y modificar sus propiedades. Los más comunes son los métodos getter, que permiten obtener el valor de una propiedad, y los setter, que permiten establecer o modificar el valor de una propiedad.
6. **Eventos**: Los Beans tienen la capacidad de generar eventos para informar a otros componentes sobre cambios en su estado, lo que facilita la comunicación entre distintos elementos de un sistema.
7. **Introspección**: Los Beans pueden ser examinados por herramientas de desarrollo para obtener información sobre sus propiedades y métodos, lo que facilita su manipulación y utilización en el proceso de desarrollo de software.

## 4.1.  ¿Qué es un Java Bean? - Sintáxis Básica

Cuando estamos hablando de un Java Bean hay unos temas a tener en cuenta al momento de construir o implementar uno:

1. **Clase pública**: La clase debe ser pública para que pueda ser accesible desde otras partes del código.
2. **Constructores**: Debe tener un constructor público sin argumentos (constructor por defecto) para garantizar que pueda ser instanciado correctamente.
3. **Propiedades privadas**: Las propiedades del Bean deben ser privadas para encapsular los datos.
4. **Métodos de acceso (getter y setter)**: Deben ser públicos para permitir el acceso controlado a las propiedades privadas.
5. **Convención de nombres**: Los métodos getter y setter deben seguir la convención de nombres de JavaBean, comenzando con "get" o "set" seguido del nombre de la propiedad en camelCase.
6. **Serializable (opcional)**: Si es necesario, la clase puede implementar la interfaz Serializable para permitir que los objetos de la clase se serialicen y deserialicen.

A continuación se muestra un ejemplo de un Bean en SpringBoot. Supongamos que existe la clase Persona y Serpiente que implementan la interfaz SerVivo de la siguiente manera: 

<aside>
<img src="/icons/code_gray.svg" alt="/icons/code_gray.svg" width="40px" /> Ejemplo SerVivo

---

```java
public interface SerVivo {
    String caminar();
}
```

```java
public class Persona implements SerVivo{
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String caminar() {
        return "La persona camina";
    }
}
```

```java
public class Serpiente implements SerVivo {

    @Override
    public String caminar() {
        return "La serpiente se arrastra";
    }
    
}
```

</aside>

Entonces, se crea una configuración para Spring Boot de la siguiente manera:

<aside>
<img src="/icons/code_gray.svg" alt="/icons/code_gray.svg" width="40px" /> Configuración de SpringBoot

---

```java
@Configuration
public class ConfiguracionSpring {

    @Bean
    public SerVivo persona() {
        return new Persona("Juan Marino");
    }

    @Bean
    public SerVivo serpiente(Persona persona) {
        Serpiente serpiente = new Serpiente();
        System.out.println("La serpiente ataca a "+persona.getNombre());
        
        return serpiente;
    }
}
```

Este código es una configuración de Spring Boot que utiliza anotaciones para definir beans y establecer la inyección de dependencias. 

1. **`@Configuration`**: Esta anotación marca la clase como una configuración de Spring, indicando que contiene definiciones de beans y configuraciones específicas del contexto de la aplicación.
2. **`@Bean`**: Esta anotación se utiliza para marcar métodos que producen beans gestionados por el contenedor de Spring. Los métodos anotados con **`@Bean`** devuelven instancias de objetos que serán administradas por Spring.
3. **`public SerVivo persona()`**: Este método, anotado con **`@Bean`**, crea y devuelve un bean de tipo **`SerVivo`** llamado "persona". El objeto creado es una instancia de la clase **`Persona`** con el nombre "Juan Marino".
4. **`public SerVivo Serpiente(Persona persona)`**: Este método, también anotado con **`@Bean`**, crea y devuelve un bean de tipo **`SerVivo`** llamado "Serpiente". El método toma un parámetro de tipo **`Persona`**, lo que indica a Spring que inyecte el bean "persona" en este método cuando se cree el bean "Serpiente". Luego, crea una instancia de la clase **`Serpiente`** y realiza una acción imprimiendo un mensaje indicando que la serpiente ataca a la persona.
</aside>

Después se podría utilizar esta configuración en la aplicación Spring Boot:

<aside>
<img src="/icons/code_gray.svg" alt="/icons/code_gray.svg" width="40px" /> Clase principal

---

```java
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);

        SerVivo persona = contexto.getBean(Persona.class);
        SerVivo serpiente = contexto.getBean(Serpiente.class);

        System.out.println(persona.caminar());
        System.out.println(serpiente.caminar());     
        
    }

}
```

</aside>

En el código proporcionado, se está utilizando Spring Boot y la clase **`DemoApplication`** está marcada con **`@SpringBootApplication`**. Esto indica que se trata de la clase principal de la aplicación Spring Boot. Analizando el código paso a paso se tiene:

1. **`@SpringBootApplication`**: Esta anotación combina varias anotaciones, incluyendo **`@Configuration`**, **`@EnableAutoConfiguration`**, y **`@ComponentScan`**. En resumen, esta anotación se utiliza para marcar la clase principal de la aplicación Spring Boot, activar la configuración automática y escanear componentes en el paquete actual y subpaquetes.
2. **`ApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);`**: Aquí se está creando un **`ApplicationContext`** utilizando **`AnnotationConfigApplicationContext`**, que es un tipo de contexto de aplicación de Spring basado en anotaciones de configuración. La clase de configuración que se utiliza es **`ConfiguracionSpring.class`**.
3. **`SerVivo persona = contexto.getBean(Persona.class);`**: Se obtiene un bean llamado "persona" del contexto. En este caso, se está indicando que el tipo del bean debe ser **`Persona`**, que es una implementación de la interfaz **`SerVivo`**.
4. **`SerVivo serpiente = contexto.getBean(Serpiente.class);`**: Similar al paso anterior, se obtiene un bean llamado "serpiente", pero esta vez del tipo **`Serpiente`**.
5. **`System.out.println(persona.caminar());`**: Imprime el resultado del método **`caminar()`** en el objeto **`persona`**. Ten en cuenta que el método **`caminar()`** es parte de la interfaz **`SerVivo`**.
6. **`System.out.println(serpiente.caminar());`**: Imprime el resultado del método **`caminar()`** en el objeto **`serpiente`**. Al igual que con **`persona`**, este método también es parte de la interfaz **`SerVivo`**.

Si se ejecuta este código se puede apreciar que se imprime el mensaje de la serpiente atacando a Juan antes que los métodos **`caminar()`**, esto se debe a la secuencia en la que se están invocando los métodos. En el **`main`**:

```java
System.out.println(persona.caminar());
System.out.println(serpiente.caminar());
```

Primero, se llama al método **`caminar()`** en el objeto **`persona`** y luego en el objeto **`serpiente`**. Sin embargo, la lógica de atacar a Juan está dentro del constructor de la clase **`Serpiente`**. Al crear una instancia de **`Serpiente`** con **`contexto.getBean(Serpiente.class)`**, se ejecuta el constructor de **`Serpiente`** y, por lo tanto, se imprime el mensaje de la serpiente atacando a Juan antes de los métodos **`caminar()`**.

En resumen, el orden de ejecución de los métodos y constructores determina el orden en el que se muestran los mensajes.

## 4.2.  ¿Qué es un Java Bean? - Ciclo de vida de Bean

El ciclo de vida de un bean en Spring Boot es el conjunto de fases que atraviesa un bean desde su creación hasta su destrucción. El contenedor de Spring Boot administra el ciclo de vida de los beans, proporcionando una serie de métodos de devolución de llamada que pueden ser usados para realizar tareas específicas en cada fase.

Las fases del ciclo de vida de un bean en Spring Boot son las siguientes:

- **Instantiation:** En esta fase, el contenedor de Spring Boot crea una instancia del bean.
- **Configuration:** En esta fase, el contenedor de Spring Boot llama a los métodos de configuración del bean.
- **Initialization:** En esta fase, el contenedor de Spring Boot llama a los métodos de inicialización del bean.
- **Ready:** En esta fase, el bean está listo para ser utilizado.
- **Destruction:** En esta fase, el contenedor de Spring Boot destruye el bean.

El ciclo de vida de un bean en Spring consiste en una serie de fases que van desde su creación hasta su destrucción. Analizando el ciclo de vida de los beans del ejemplo anterior se tiene:

<aside>
<img src="/icons/code_gray.svg" alt="/icons/code_gray.svg" width="40px" /> Configuración Spring

---

```java
@Configuration
public class ConfiguracionSpring {

    @Bean
    public SerVivo persona() {
        return new Persona("Juan Marino");
    }

    @Bean
    public SerVivo Serpiente(Persona persona) {
        Serpiente serpiente = new Serpiente();
        System.out.println("La serpiente ataca a " + persona.getNombre());
        return serpiente;
    }
}
```

1. **Inicialización del contenedor:** Cuando la aplicación arranca, Spring inicializa su contenedor de aplicaciones. Durante esta fase, se exploran las configuraciones de beans y se crea el contexto de aplicación.
2. **Creación del bean `persona`:** Spring detecta el método anotado con **`@Bean`** llamado **`persona()`** y crea un bean de tipo **`SerVivo`** usando el método. En este caso, se instancia un objeto de la clase **`Persona`** con el nombre "Juan Marino".
3. **Creación del bean `Serpiente`:** Spring detecta el método anotado con **`@Bean`** llamado **`Serpiente(Persona persona)`** y crea un bean de tipo **`SerVivo`**. Al hacerlo, automáticamente inyecta el bean **`persona`** en el método como un parámetro. Luego, se imprime "La serpiente ataca a Juan Marino" en el constructor de la clase **`Serpiente`**.
4. **Utilización de los beans en el `main`:** En el método **`main`**, se obtienen los beans **`persona`** y **`Serpiente`** del contexto de aplicación utilizando **`contexto.getBean(...)`**. En este punto, los beans ya han sido creados, y se pueden utilizar según sea necesario.
5. **Ejecución de los métodos `caminar()`:** Se invocan los métodos **`caminar()`** en los beans **`persona`** y **`Serpiente`**, y se imprime el resultado.
6. **Destrucción del contenedor:** Cuando la aplicación se cierra, Spring realiza operaciones de limpieza y destruye los beans que ya no son necesarios.
</aside>

Se debe tener en cuenta que en este ejemplo, el ciclo de vida real del bean **`Serpiente`** se inicia cuando el contenedor de Spring crea la instancia de la clase **`Serpiente`**, lo que provoca la impresión del mensaje "La serpiente ataca a Juan Marino" en el constructor. Esto sucede antes de que se invoquen los métodos **`caminar()`** en el **`main`**.

## 4.3.  Component

A nivel de Spring Framework esta anotación simplemente registra un bean dentro del framework sin mayor efecto . Es decir si se dispone de una clase como la siguiente:

```java
@Component
public class MiComponente {
}
```

Spring la registrará dentro del framework y se podrá hacer uso de ella sin problema.

<aside>
🖼️ Registro de componentes en Spring. Tomado de: [enlace](https://www.arquitecturajava.com/spring-component-anotaciones-y-jerarquia/)

---

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/5be0af04-ff4f-42ad-b6e9-38f6d9e28f75/Untitled.png)

</aside>

Por ejemplo, modificando el ejemplo anterior con un Gato que tiene dueño se podría representar de la siguiente manera:

<aside>
<img src="/icons/code_gray.svg" alt="/icons/code_gray.svg" width="40px" /> Ejemplo Gato y dueño de tipo Persona

---

**Interfaz `SerVivo`**

```java
public interface SerVivo {
    String caminar();
}
```

**`SerVivo`** es una interfaz que define el método **`caminar()`**. Cualquier clase que implemente esta interfaz deberá proporcionar una implementación para el método **`caminar()`**.

**Clase `Persona`**

```java
public class Persona implements SerVivo {
    private String nombre;

		public Persona(String nombre){
				this.nombre = nombre;
		}

    @Override
    public String caminar() {
        return "La persona camina";
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
}
```

- **`Persona`** es una clase que implementa la interfaz **`SerVivo`** y proporciona una implementación para el método **`caminar()`**.
- También tiene un método **`toString()`** para representar la información de la persona en forma de cadena.

**Clase `Gato`**

```java
@Component
public class Gato implements SerVivo {

    @Autowired
    private Persona duenio;
    
    public Gato(Persona duenio){
        this.duenio = duenio;
    }

    public Persona getDuenio() {
        return duenio;
    }   

    @Override
    public String caminar() {
        return "El gato camina con sus cuatro patas";
    }
}
```

- **`Gato`** es una clase anotada con **`@Component`**, lo que la convierte en un componente de Spring. Esta clase también implementa la interfaz **`SerVivo`** y proporciona una implementación para el método **`caminar()`**.
- Además, tiene un atributo **`duenio`** que es de tipo **`Persona`** y se inyecta a través del constructor.

> La etiqueta **`@Autowired`** en Spring se utiliza para realizar la inyección de dependencias automáticamente. Cuando se coloca sobre un campo, un método setter, un constructor o un método de configuración (como un método anotado con **`@Bean`** en una clase de configuración), Spring automáticamente proporciona la instancia del objeto requerido en ese punto.
> 

**Clase para la configuración del dueño**

```java
@Configuration
@ComponentScan(basePackageClasses = Gato.class)
public class ConfiguracionDuenio {
    @Bean
    public Persona getPersona() {
        return new Persona("Juan Marino");
    } 
}
```

- **`ConfiguracionDuenio`** es una clase de configuración anotada con **`@Configuration`**. Indica a Spring que contiene métodos para configurar y crear beans.
- Utiliza **`@ComponentScan`** para escanear el paquete de la clase **`Gato`** y sus subpaquetes en busca de componentes de Spring.
- Define un bean llamado **`getPersona()`** que crea y devuelve una instancia de **`Persona`** con el nombre "Juan Marino".

**Clase `Main`**

```java
@SpringBootApplication
public class BeansApplication {
    public static void main(String[] args) {
        ApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracionDuenio.class);

        Gato gato = contexto.getBean(Gato.class);
        System.out.println(gato.getDuenio());
    }
}
```

- **`BeansApplication`** es la clase principal de la aplicación anotada con **`@SpringBootApplication`**.
- En el método **`main`**, se crea un contexto de aplicación utilizando la configuración definida en **`ConfiguracionDuenio.class`**.
- Se obtiene un bean de tipo **`Gato`** del contexto y se imprime el dueño del gato.
</aside>

> **`@Configuration`** se utiliza para marcar una clase como una clase de configuración de Spring. Indica a Spring que la clase contiene métodos que generan y configuran beans. Los métodos anotados con **`@Bean`** dentro de una clase **`@Configuration`** devuelven instancias de objetos que serán gestionados por el contenedor de Spring.
> 

> **`@ComponentScan`** se utiliza para activar la exploración automática de componentes en un paquete y sus subpaquetes. Se puede utilizar con varias opciones, una de las cuales es **`basePackageClasses`**, que especifica las clases que se utilizan para determinar el paquete base de escaneo. En el ejemplo anterior **`@ComponentScan`** indica a Spring que escanee el paquete de la clase **`Gato`** y sus subpaquetes en busca de componentes. Esto permite que Spring encu
>