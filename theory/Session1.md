# M1 - Sesión 1️⃣ : Introducción a Spring Boot (45 Minutos)

## Dificultad : ★★☆☆☆

<aside>
📌 **Descripción de la sesión: El módulo de conceptos básicos de Spring Boot está diseñado como una inmersión integral en el universo del desarrollo de aplicaciones Java empresariales modernas.**

---

**Tema general:** Introducción a Spring Boot.

**Objetivo de la sesión**: El objetivo principal de este módulo es proporcionar a los participantes los conocimientos esenciales y habilidades prácticas necesarias para comprender, desarrollar y desplegar aplicaciones con Spring Boot.

**🎓 Resultados esperados. Después de la sesión, el estudiante aprenderá:**

- Explicar los principios fundamentales de Spring Boot, su propósito y ventajas en el desarrollo de aplicaciones empresariales.
- Identificar las ventajas y desventajas al momentos de desarrollar backend usando Spring Boot.
- Configurar entorno de desarrollo para poner en marcha la producción de un Backend usando como principal stack tecnológico Java y Spring Boot.

**Tiempo práctico estimado:** 45 minutos

</aside>

<aside>
📔 Tabla de contenidos

---

| [1. **¿**Qué son los frameworks?](https://www.notion.so/1-Qu-son-los-frameworks-4c997d8d9e06483289f17b6218b7c9cb?pvs=21)  |
| --- |
| [1.1. Historia de los frameworks](https://www.notion.so/1-1-Historia-de-los-frameworks-f312d0d0829647a3832df8fbf2b0b792?pvs=21)  |
| [2. **¿**Qué son las librerías?](https://www.notion.so/2-Qu-son-las-librer-as-b5b7daed3c62484caea2da7cf7ac3541?pvs=21)  |
| [3. Diferencias entre *frameworks* y librerías](https://www.notion.so/3-Diferencias-entre-frameworks-y-librer-as-8f767a223d4a432c85c7334a1e1e3889?pvs=21)  |
| [4. **¿**Qué es **Spring Boot?**](https://www.notion.so/4-Qu-es-Spring-Boot-cd101ecb23ee4ca0a4d3068f42afcf9f?pvs=21)  |
| [4.1. **¿**Qué es **Spring Boot? - Historia de Spring Boot**](https://www.notion.so/4-1-Qu-es-Spring-Boot-Historia-de-Spring-Boot-1f476c11589f467fb90c9f98035493d9?pvs=21)  |
| [4.2. **¿**Qué es **Spring Boot? - Estructura de Proyecto General**](https://www.notion.so/4-2-Qu-es-Spring-Boot-Estructura-de-Proyecto-General-d532edb626de4454bd5e4b25bfbfce53?pvs=21)  |
| [5. Creación del Proyecto](https://www.notion.so/5-Creaci-n-del-Proyecto-29cdec5f106e47e093d27f575a7140d3?pvs=21)  |
| [5.1 Creación del Proyecto - Estructura de proyecto generado por NetBeans](https://www.notion.so/5-1-Creaci-n-del-Proyecto-Estructura-de-proyecto-generado-por-NetBeans-1dd97d6dd26a4665b928735bdefe8de0?pvs=21)  |

</aside>

---

# 1. **¿**Qué son los frameworks?

![2620969.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/6fa62aa1-a180-4f81-9369-6c3f83938141/2620969.png)

Los *frameworks* son “***marcos de trabajo***” o conocidos por ser **entornos de trabajo** que buscan **apoyar** el desarrollo de aplicaciones profesionales que sean estables y dinámicas. Estos *Frameworks* vienen con un conjunto de **paquetes (librerías), herramientas y diversas utilidades** que buscan apoyar el desarrollo de un macro-proyecto.

Un *framework* busca ser parte del paradigma del desarrollo de software ágil , con el fin de desarrollar proyectos de manera productiva y en menos tiempo. En este caso, desarrollar aplicativos web que tengan alta complejidad de consumo a nivel de información y contenido será de gran ayuda al momento de implementar *frameworks* en el proyecto.

Las características principales de un *framework* son las siguientes : 

- **Escalabilidad** : Un proyecto basado en un *framework* permite crearlo al ritmo y necesidades del cliente en el momento que sea necesario.
- **Inversión de Control (IoC)**: Permite reutilizar código en diversas partes del programa sin necesidad de que gestionen sus propias dependencias, pues estas estarán delegadas a un contenedor o *framework* de más alto nivel.
- **Modelo Vista - Controlador (MVC):** Al estar ligado al modelo vista-controlador permitirá tener una estructura estandarizada, no solamente para manejar los elementos internos sino también para consumir correctamente la información proveída
- **Minimizar la escritura de código repetitivo**: Gracias a los elementos anteriormente mencionados, se puede minimizar la creación de código anteriormente establecido, pues su utilidad es referenciar dicho código para su posterior implementación.
- **Bases generales auto-gestionadas**: Elementos tales como la seguridad, manejo de información, implementación de vistas serán elementos que podrán ser gestionados con mayor facilidad desde un framework.

Tomado *de: [enlace](https://www.arimetrics.com/glosario-digital/notion#:~:text=Notion%20es%20una%20herramienta%20multiuso,todo%20en%20un%20solo%20lugar).*

### 1.1. Historia de los frameworks

Los frameworks tienen historias dependientes de acuerdo a su año de lanzamiento y enfoque dado, por lo cual cada uno se alineará a la necesidad que se buscaba en dicho momento o época.

<aside>
🖼️ Línea del tiempo frameworks. Tomado de: [fuente](https://developer.okta.com/blog/2020/12/04/25-years-javascript-java)

---

![history-of-web-frameworks-timeline-2c6e70391b674e95d2279442a006fe3b6ec2fd5140bac7914ba13a70242d0642.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/b24e4703-95ef-4fbb-a3fb-2760b9048c38/history-of-web-frameworks-timeline-2c6e70391b674e95d2279442a006fe3b6ec2fd5140bac7914ba13a70242d0642.png)

</aside>

Como se puede ver en la imagen, cada uno fue lanzado en dicha época de acuerdo a la necesidad encontrada en el momento, sea desde el navegador de internet primitivo hasta las nuevas tendencias encontradas en los dispositivos móviles. Dicho esto, sus primeros inicios fueron desde lo que conocemos como “Tomcat” , la cual buscaba inicializar un servicio web desde su manera más primitiva. Luego, con el surgimiento de Internet Explorer se desplegó lo que conocemos hoy en día como “ASP.NET”, pues este terminará siendo líder en el mercado con sus avances conocidos como “.NET Framework”.

# 2. **¿**Qué son las librerías?

Las librerías son un conjunto de archivos que buscan apoyar o solucionar una necesidad en específico, las cuales pueden rondar desde el manejo de operaciones matemáticas hasta la gestión de bases de datos a nivel relacional. Las librerías son implementadas a nivel general y se van escalando cada vez que se encuentre algún ítem o requerimiento adicional en el proyecto en desarrollo.

Hay diferentes tipos de librerías que podemos encontrar a lo largo del desarrollo de nuestro proyecto, la cuales son las siguientes: 

- **Librerías Estáticas**: Las librerías estáticas son grabadas directamente al programa cuando se ejecutan, esto con el fin de ser borradas.
- **Librerías Dinámicas**: Las librerías dinámicas buscan en ser usadas en el momento que el programa esté en ejecución.

Algunas de las librerías que son comúnmente conocidas:

| Javascript | C++ | Python |
| --- | --- | --- |
| Jquery, Mootols, Moments.js, Anime.js, Ramda, D3.js, Chart.js, MathJS, Hammer.js, Glimmer.js, entre otras. | iostream, cmath, cstring, ctime, algorithm, entre otras. | matplotlib, seaborn, bokeh, Numpy, Scipy, Pandas, Numba, Gensim, entre otras. |

*Tomado de: [enlace](https://www.arimetrics.com/glosario-digital/notion#:~:text=Notion%20es%20una%20herramienta%20multiuso,todo%20en%20un%20solo%20lugar).*

---

# 3. Diferencias entre *frameworks* y librerías

Al estar alineadas la implementación de una de ellas, será de gran importancia establecer sus principales diferencias al momento de usarlas:

| Aspecto | Framework | Librería |
| --- | --- | --- |
| Tecnologías | Angular, React, Django, Spring Boot | jQuery, Axios, Lodash |
| Dependencias | Permite proporcionar una estructuración a nivel de componentes definidos. | Permite proporcionar algunas funciones en específico. |
| Arquitectura | Permite definir la arquitectura general de la aplicación. | No define la arquitectura general de la aplicación. |
| Flexibilidad | Puede llegar a limitar esta flexibilidad por sus convenciones. | Permite más flexibilidad por la manera de cómo está implementado. |

### ⚠️ *Tener en cuenta que dependiendo del contexto y de una o varias tecnologías puede cambiar lo establecido acá.*⚠️

---

# 4. **¿**Qué es **Spring Boot?**

![logo.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/6d76b79c-f5a9-48ee-9bfe-2d4c26f92a2f/logo.png)

Spring Boot es un marco de desarrollo avanzado que ha revolucionado el panorama de desarrollo de aplicaciones Java empresariales. Diseñado para simplificar el proceso de creación, configuración y despliegue de aplicaciones, Spring Boot se destaca por su enfoque en la convención sobre la configuración, lo que significa que los desarrolladores pueden concentrarse en la lógica de negocio sin la carga de configuraciones extensas. Al utilizar anotaciones y proporcionar una estructura de proyecto bien definida, Spring Boot elimina gran parte de la complejidad asociada con la configuración manual de un proyecto Spring tradicional.

Una característica distintiva de Spring Boot es su capacidad para empaquetar aplicaciones como archivos ejecutables independientes, ya sea en formato JAR o WAR, lo que simplifica significativamente el despliegue y la gestión de dependencias. Además, Spring Boot ofrece una amplia integración con tecnologías modernas, como Spring Data JPA para el acceso a bases de datos, Spring Security para la implementación de medidas de seguridad, y Thymeleaf para el desarrollo de vistas en aplicaciones web.

Al igual que esto hay otras características representativas las cuales son las siguientes:

- **Configuración Automática:** Spring Boot realiza la configuración automática, lo que significa que intenta configurar la aplicación basándose en las dependencias presentes en el proyecto. Esto reduce la cantidad de configuración manual que un desarrollador necesita realizar.
- **Incrustación de Servidor:** Spring Boot incluye servidores integrados como Tomcat, Jetty o Undertow, lo que significa que no es necesario configurar un servidor por separado para ejecutar la aplicación. Puedes empaquetar la aplicación como un archivo JAR ejecutable o un archivo WAR para implementarla en un servidor.
- **Inicio Rápido:** Spring Boot facilita la creación de aplicaciones con un inicio rápido. Con unas pocas anotaciones y configuraciones mínimas, puedes desarrollar aplicaciones funcionales de manera rápida.
- **Microservicios:** Spring Boot es ampliamente utilizado en el desarrollo de arquitecturas de microservicios. Facilita la creación de servicios independientes que se pueden implementar y escalar de manera independiente.
- **Gestión de Dependencias:** Spring Boot utiliza Spring Boot Starter, que son dependencias preconfiguradas para varias tecnologías y frameworks. Esto facilita la inclusión de las dependencias necesarias en tu proyecto.
- **Monitorización y Actuadores:** Spring Boot incluye un conjunto de actuadores que proporcionan características de monitorización y administración, como la información sobre la aplicación, la salud del sistema y la gestión de los beans de Spring.
- **Soporte para Spring Ecosystem:** Spring Boot se integra bien con otros proyectos del ecosistema Spring, como Spring Data, Spring Security y Spring Cloud, para facilitar el desarrollo de aplicaciones más completas.

---

## 4.1. **¿**Qué es **Spring Boot? - Historia de Spring Boot**

<aside>
🖼️ Línea del tiempo representativa de las diferentes versiones sacadas de SpringBoot. Tomado de: [enlace](https://se.ewi.tudelft.nl/desosa2019/chapters/spring-boot/).

---

![spring_versions.PNG](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/f652332e-bee8-416d-b897-57157168536e/spring_versions.png)

</aside>

Spring es un marco de desarrollo para aplicaciones Java que fue introducido por primera vez por Rod Johnson en 2002. La historia de Spring se origina en la idea de simplificar el desarrollo de aplicaciones empresariales, abordando las limitaciones y complejidades asociadas con el desarrollo de software en el entorno empresarial. Rod Johnson, un experto en desarrollo de software, buscó crear un marco que fuera más liviano, modular y fácil de usar que las tecnologías existentes en ese momento.

La primera versión de Spring se lanzó en 2003 como una alternativa al modelo de programación basado en Enterprise JavaBeans (EJB) de Java EE. Spring ofrecía una solución más flexible y menos acoplada, permitiendo a los desarrolladores construir aplicaciones más fácilmente y con un enfoque en la inversión de control (IoC) para gestionar las dependencias.

A medida que Spring ganó popularidad, se convirtió en un ecosistema integral que abarcaba no solo el contenedor de IoC, sino también módulos para acceso a datos, seguridad, desarrollo web y más. La versión 2.0, lanzada en 2006, introdujo nuevas características como la programación basada en anotaciones y Spring AOP (Aspect-Oriented Programming).

Con el tiempo, Spring evolucionó para abordar los desafíos emergentes en el desarrollo de software, como la construcción de aplicaciones basadas en microservicios y la integración con tecnologías modernas. Spring Boot, lanzado en 2014, simplificó aún más el desarrollo al proporcionar convenciones sobre configuración y herramientas para la creación rápida de aplicaciones con opiniones predeterminadas sensatas.

Hoy en día, Spring se ha convertido en un marco ampliamente adoptado en la comunidad de desarrollo Java y es conocido por su flexibilidad, modularidad y capacidad para adaptarse a diversas arquitecturas de aplicaciones. La visión de Spring sigue siendo la de proporcionar un marco integral que simplifique el desarrollo de software, fomente las mejores prácticas y promueva la creación de aplicaciones empresariales robustas y eficientes.

---

## 4.2. **¿**Qué es **Spring Boot? - Estructura de Proyecto General**

<aside>
🖼️ Estructura general de proyecto de SpringBoot V3.2.2 (Maven).

---

![Screenshot 2024-02-22 at 11.14.01 AM.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/cffc1bf3-4550-4954-86ab-7e54ab89a391/Screenshot_2024-02-22_at_11.14.01_AM.png)

</aside>

Al momento de hablar sobre la creación de un proyecto de SpringBoot , debemos tener en cuenta que se crea una estructura más robusta que cualquier proyecto común de Java, donde su primer cambio es la implementación de Maven, la cual es un creador automatizado de proyectos con especificaciones dadas por el usuario.

Dicho esto, encontraremos los siguientes detalles en su estructura:

La carpeta raíz del proyecto alberga diversos elementos esenciales para el desarrollo y gestión del proyecto en IntelliJ IDEA, un IDE utilizado para su creación. Entre estos, se incluyen carpetas como ".idea", que contiene la configuración específica del IDE, ".mvn", que guarda archivos temporales de Maven, y "pom.xml", un archivo crucial de configuración de Maven que define las dependencias, plugins y configuración de compilación.

Además, encontramos scripts como "mvnw" y "mvnw.cmd", destinados a la ejecución de comandos Maven en entornos Unix y Windows, respectivamente. El archivo "[HELP.md](http://help.md/)" proporciona información de ayuda sobre el proyecto, mientras que ".gitignore" especifica archivos que no deben cargarse en el repositorio Git.

Dentro de la carpeta "src", la subcarpeta "main" contiene los archivos fuente de la aplicación, incluyendo el paquete "java" con las clases Java en "com.example.maven", siendo "MavenApplication.java" la clase principal de la aplicación Spring Boot. "Resources" almacena recursos estáticos, como configuraciones y archivos HTML, con "application.properties" como archivo de configuración de Spring Boot.

La carpeta "test" dentro de "src" contiene archivos de prueba, incluyendo "MavenApplicationTests.java", una clase de prueba JUnit para la clase principal. Otras carpetas relevantes son "External Libraries", que guarda bibliotecas externas, y "Scratches and Consoles", usada por IntelliJ IDEA para archivos temporales y consolas.

En cuanto a archivos clave, "pom.xml" es fundamental, definiendo dependencias, plugins y configuración de compilación. "MavenApplication.java" actúa como la clase principal de la aplicación Spring Boot, conteniendo el método "main" para iniciar la aplicación, mientras que "application.properties" contiene propiedades para configurar la aplicación.

La estructura de paquetes sigue convenciones específicas de Spring Boot, destacando "com.example.maven" como el paquete principal, y otros como "model" para entidades de modelo, "controller" para controladores REST, "service" para servicios de la aplicación, y "repository" para repositorios de datos.

---

# 5. Creación del Proyecto

A continuación veremos cuáles son los pasos a seguir para la creación de un proyecto basado en SpringBoot:

### Primer Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/546360b3-565b-4bec-8a6f-46222797f66f/Untitled.png)

Como primer paso ingresamos a la pagina oficial de Spring Boot (https://spring.io/) y seleccionamos la opción Projects>Spring Boot Initializr.

### Segundo Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/df8185a3-7e60-41e4-9259-c0190812ae03/Untitled.png)

Como segundo paso en la pagina de Spring Initializr llenamos los parámetros del proyecto de acuerdo a los requerimientos del diseño (Los que utilizaremos se encuentran en la imágen anexada). 

### Tercer Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/fd51b508-dcfb-4c21-9526-8e790941c567/Untitled.png)

Después de haber seleccionado los elementos a crear en el proyecto añadimos las dependencias necesarias de acuerdo al diseño establecido para este mismo. Para ello solamente de damos clic sobre el boton “Add Dependencies”.

### Cuarto Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/bf21aee4-52d6-4c1c-8429-6a0ddd3141ee/Untitled.png)

Finalmente cuando tengamos todo generado le damos click a “Generar” y con ello tendremos nuestro proyecto creado 🎉.

Para agregar la extensión de SpringBoot en NetBeans debemos hacer los siguientes pasos:

### Primer Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/91638d1a-93f2-4b9c-be50-802897286bac/Untitled.png)

Ingresamos a la [Url](https://github.com/AlexFalappa/nb-springboot/releases) ‣, donde descargaremos la version 3.1 nbm.

### Segundo Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/1fcac2c9-49f0-4f0a-a54a-192f34811498/Untitled.png)

Luego abrimos NetBeans y nos vamos para la sesión de “Tools > Plugins”

### Tercer Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/905b1da5-0889-4fa8-a22a-7ebba14c159a/Untitled.png)

En la ventana emergente seleccionamos la pestaña “Downloaded”, donde le daremos clic en el botón “Add Plugins…”.

### Cuarto Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/399ab2f2-8e0f-46e3-9e5b-9e02090b4530/Untitled.png)

En la ventana emergente seleccionamos el archivo descargado en el punto 1 y lo abrimos.

### Quinto Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/9990aa79-9fe5-4b57-bf01-69510a16bedc/Untitled.png)

Después de abrirlo nos aparecerá una ventana emergente para confirmar su instalación, donde la confirmaremos dandole click a “Install”.

### Quinto Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/9990aa79-9fe5-4b57-bf01-69510a16bedc/Untitled.png)

Después de abrirlo nos aparecerá una ventana emergente para confirmar su instalación, donde la confirmaremos dandole click a “Install”.

### Sexto Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/b7f12637-5f39-4631-92d2-e53db9e58db8/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/ace9bee9-977c-4ea6-b32b-379fa8f630fe/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/5331269f-130b-4d39-9126-e610ac81b261/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/044c7bcd-5a99-46df-8198-e1a97977cef5/Untitled.png)

Nos aparecerá los elementos necesarios para la instalación, por lo cual le daremos “Siguiente” con las opciones que vienen por default.

### Séptimo Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/412f478c-290c-4483-97b5-f2061cc86411/Untitled.png)

Cuando termine de instalar nos indicará si queremos reiniciar nuestro IDE, para lo cual le damos en “Confirmar”.

### Octavo Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/a32fb829-c305-4b5d-ac8a-643a6520fb8f/Untitled.png)

Si todo nos fue bien deberíamos ver en la parte superior un indicador de instalación para Spring Boot 🎉

Si queremos que se genere automáticamente por el mismo entorno de desarrollo (en este caso NetBeans), haremos los siguientes pasos:

### Primer Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/1e21a496-81b0-4b59-adb0-1eb1db91bd8d/Untitled.png)

Como primer paso ingresamos a NetBeans y haremos clic en el menu File > New Project.

### Segundo Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/5ae4d4fd-46fd-4a65-957b-d2e9b33738e3/Untitled.png)

Cuando nos aparezca la ventana de “New Project” escogemos en las categorías “Java with Maven” y luego en “Projects” la opción “Spring Boot Initializr project”.

### Tercer Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/9575cab1-bdcc-45fd-8ff2-277512a205bc/Untitled.png)

Al momento de preguntarnos por las propiedades seleccionamos las mismas que hicimos en el ejemplo anterior y le damos en “Siguiente”.

### Cuarto Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/fee7b578-178f-4291-b980-3f50ab06db51/Untitled.png)

Cuando tengamos configurado bien la definición del proyecto, solamente escogemos las dependencias necesarias, como lo habíamos hecho en anteriores ocasiones.

### Quinto Paso

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/21803634-62d7-4c00-9a52-4bb9882a2d32/Untitled.png)

Finalmente definimos el nombre y locación de nuestro proyecto, donde si todo sale bien nos aparecerá nuestro proyecto creado de manera satisfactoria 🎉.

---

# 5.1 Creación del Proyecto - Estructura de proyecto generado por NetBeans

<aside>
🖼️ Estructura del proyecto generado por NetBeans basado en SpringBoot.

---

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/bf851b09-d16e-4199-9124-f1cd1c03e52d/Untitled.png)

</aside>

Como podemos ver hay varios archivos que serán de gran importancia al momento de manejar algún servicio creado en NetBeans. Veamos a continuación los archivos que más se destacan: 

- [**application.properties**](http://application.properties) es un archivo de configuración utilizado en proyectos basados en Spring Boot. En este archivo, se pueden especificar diversas configuraciones para la aplicación, como propiedades de conexión a bases de datos, configuración de seguridad, configuración de logging, entre otras.
- **static** se utiliza para almacenar recursos estáticos que serán servidos directamente por el servidor web sin procesamiento dinámico por parte de la aplicación. Estos recursos son accesibles de manera pública y suelen incluir archivos como hojas de estilo (CSS), scripts (JavaScript), imágenes y otros archivos estáticos.

<aside>
💡 Ejemplo de estructura interna del folder static:

---

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/174536b2-683a-4f41-924c-e7f8cb5e3db1/8c0e189c-af05-4fb9-8b43-ffe87eaade3c/Untitled.png)

</aside>

- **templates** La carpeta "templates" se emplea para almacenar plantillas de vista que son procesadas por el motor de plantillas configurado en la aplicación. Estas plantillas son ampliamente utilizadas en aplicaciones web para generar contenido dinámico que se presenta al usuario. Al construir una aplicación web con Spring Boot, los desarrolladores pueden optar por utilizar un motor de plantillas como Thymeleaf, FreeMarker o Velocity, lo que facilita la creación de páginas HTML dinámicas. La carpeta "templates" actúa como el directorio por defecto donde Spring Boot busca estas plantillas, permitiendo una integración eficiente y organizada en el desarrollo de la interfaz de usuario.
- **dependencies** donde se especifican las dependencias del proyecto.
- **pom.xml** es un componente esencial en proyectos basados en Maven, un sistema de gestión de proyectos y construcción de software utilizado en entornos Java. "POM" significa "Project Object Model", y el archivo **pom.xml** define la configuración y la estructura del proyecto.
- **nbactions.xml** es específico de proyectos que utilizan NetBeans, un entorno de desarrollo integrado (IDE) popular para Java y otros lenguajes. La función principal del archivo **nbactions.xml** es definir las acciones y configuraciones relacionadas con la construcción y ejecución del proyecto en NetBeans.