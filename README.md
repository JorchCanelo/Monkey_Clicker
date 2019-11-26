
![alt text](https://github.com/JorchCanelo/Monkey_Clicker/blob/master/Monkey_Clicker/src/recursos/monkeyCoder.jpg "Logo Title Text 1")

## Descripción

Un pequeño juego similar a Cookie clicker con el tema de "Monkey Coder". En este juego se irá dando click a un mono, que irá codeando las líneas respecto a la cantidad de clicks que se le dé, también se podrá contar con mejoras como:

* Abstracción
* Modularidad
* Más monos
* Sucursales de monos


## Miembros del equipo

* Chí León Jorge Alberto 
* González Bautista Noé Alejandro
* López Madera Fernanda Jacqueline 

## Tabla de contenido 

**1. Introducción**

* 1.1 Resumen 
* 1.2 Publico objetivo 
    
**2. Definición del proyecto**

* 2.1 Metas y objetivos
    
**3. Requerimientos**

* 3.1 Actores de sistema 
* 3.2 Requerimientos de usuario
* 3.3 Requerimientos de sistema
	* 3.3.1 Funcionales
	* 3.3.2 No funcionales
	* 3.3.2.1 Requerimientos de producto
* 3.4 Casos de uso
	* 3.4.1 Diagramas
* 3.5 Product blacklog
	* 3.5.1 Historias de usuario
      
**4. Proceso de Desarrollo**

* 4.1 Heramientas 
    
**5. Trabajo en equipo**

* 5.1 Comunicación 

**6. Construcción**

* 6.1 Lenguaje de programación
* 6.2 Estándar de codificación 
* 6.3 Herramienta para la documentación
* 6.4 Uso de los temas

# 1. Introducción 
## 1.1 Resumen 
El Monkey Clicker es una adaptación del clásico juego “Cookie clicker”. Este juego fue creado para entretener al público de manera que, por medio de mejoras, el usuario tenga la motivación de desbloquearlas todas y llevarlos al máximo.
## 1.2 Público objetivo 
El juego va dirigido para todo tipo de persona, entre la edad de 7 años en adelante.
# 2. Definición del proyecto
## 2.1 Metas y objetivos
El objetivo principal de Monkey Clicker es entretener al usuario a mejorar los atributos del mono.

Entre los objetivos generales de Monkey Clicker podemos identificar los siguientes: 

1. Proveer al usuario un espacio recreacional con una dinámica de juego sencilla pero entretenida.

2. Brindar al usuario la oportunidad de adquirir habilidades y objetos que le permitan mejorar su rendimiento en el juego.

# 3. Requerimientos
## 3.1 Actores de sistema

Jugador: persona que utiliza el sistema.

* Puede dar click en los botones para producir nuevas líneas de código.
* Puede adquirir mejoras que incrementen la generación de líneas de código.
* Puede visualizar la cantidad de líneas de código escritas hasta el momento, cuántas líneas se escriben por segundo y cuántas líneas de código consume mejorar cada nivel de las habilidades u objetos.
## 3.2 Requerimientos de usuario
1. El jugador podrá dar click repetidas veces en los botones para ir generando líneas de código.

2. El jugador podrá intercambiar las líneas de código que ha producido por nuevas mejoras que incrementarán gradualmente la cantidad de líneas que se crean cada segundo a partir de la primera mejora. Dicho incremento corresponderá al nivel en que se encuentren las habilidades y objetos.

3. El jugador podrá visualizar la cantidad de líneas de código que ha generado, así como la cantidad de líneas que se producen automáticamente en caso de existir mejoras adquiridas.

## 3.3 Requerimientos de sistema
### 3.3.1 Funcionales
* RF001: Página principal; prioridad alta

Al abrir el juego, el sistema deberá iniciar en la página principal, misma que mostrará los botones en los cuales se hará click para adquirir las mejoras, la cantidad de líneas que se generan cada segundo, así como la imagen principal donde se necesita dar click para escribir nuevo código.

* RF002: Incremento de nivel de habilidades; prioridad alta

El juego debe proporcionar mostrar el nivel en el que se tienen las habilidades. Asimismo, debe reflejar el aumento de líneas de código generadas automáticamente cada vez que se mejore una habilidad, esto a partir de la primera mejora adquirida.

* RF003: Acceso a las habilidades u objetos; prioridad alta

El juego debe impedir que el usuario pueda adquirir habilidades/objetos antes de mejorar las previas hasta cierto nivel, en este caso: nivel 10. Es decir, será necesario mejorar la habilidad Abstracción a nivel 10 para desbloquear la habilidad Modularidad. Se repetirá el mismo proceso para poder activar la función de adquirir más monos, y así con todas las mejoras disponibles dentro del juego.

### 3.3.2 No funcionales
* RNF001: Resolución de imagen; prioridad alta

La imagen debe ser una solución mínima de 50x50 pixeles para encajar adecuadamente.

* RNF002: Usabilidad de la aplicación; prioridad alta

La interfaz deberá tener un diseño amigable para el usuario y ser intuitiva al uso, de forma que resulte fácil aprender autilizarla.

* RNF003: Tiempo de respuesta: prioridad alta

El tiempo de respuesta del programa entre cada click deberá ser inferior a 1 segundo. Es decir, el programa debe ser capaz de detectar cuando se realizan clicks consecutivos a una velocidad considerable y contabilizarlos.

## 3.4 Casos de uso
### 3.4.1 Diagrama

![alt text](https://github.com/JorchCanelo/Monkey_Clicker/blob/master/src/recursos/WhatsApp%20Image%202019-11-24%20at%205.40.38%20PM.jpeg "Logo Title Text 1")

# 4. Proceso de Desarrollo
## 4.1 Herramientas 
Para el planteamiento de los requerimientos, diseño, construcción, documentación y comunicación, se enlistarán a continuación: 

### 4.1.1 Herramientas de Requerimientos 
* Google Drive 
* Word 
### 4.1.2 Herramientas de Diseño 
* Lucidchart 
### 4.1.3 Herramientas de Construcción 
* GitHub 
* NetBeans 
* Eclipse-Java
### 4.1.4 Herramientas para Documentación 
* StackEdit 
### 4.1.5 Herramientas para la comunicación 
* Hangouts
# 5. Trabajo en equipo
## 5.1 Comunicación 
La comunicación durante el desarrollo del proyecto se dará en el espacio de trabajo de Hangouts, en el cual se discutirán diversos aspectos del mismo utilizando diversos canales, los cuales son los siguientes:

1. Documentación 

En este canal se discutirá todo lo relaciona con la documentación del proyecto.

2. coding 

En este canal se discutirá todo lo relacionado con la programación a lo largo del proyecto.

3. testing 

En este canal se reportarán los errores encontrados en el programa.

## 5.2 [Repositorio](https://github.com/JorchCanelo/Monkey_Clicker)

# 6. Construcción
## 6.1 Lenguaje de programación
El lenguaje de programación a usar será Java.

## 6.2 Estándar de codificación 
**Clases e interfaces:** El nombre es generalmente un sustantivo que empieza con mayúscula. Si tiene varias palabras, estas van pegadas y la primera letra es mayúscula.

Ejemplo: MonkeyPanel, Errors.

**Métodos y variables:** Generalmente son verbos. Empiezan con minúscula y siguen las otras reglas que las clases e interfaces. Las variables son privadas y solo accesibles con sus getters y setters.

Ejemplo: getMonkey(), imprimirTexto(), contador, banderaSecundaria.

**Métodos getter**: Son públicos con el prefijo “get” y no requieren de entradas.

Ejemplo: getMonos(){

return monos;

}

**Métodos setter**: Son públicos con el prefijo “set” y requieren de alguna entrada además de no retornar nada.

Ejemplo: setMonos(int entero){

monos = entero;

}


## 6.3 Herramienta para la documentación
StackEdit 

La documentación lo haremos por medio de StackEdit, nos permite visualizar del lado derecho la documentación mientras vamos escribiendo líneas de código

## 6.4 Uso de los temas
Herencia

La herencia se utiliza durante la creación de los objetos gráficos de Swing ya que se crearon objetos personalizados extendiendo a los objetos base como son botones, paneles, etc.

Polimorfismo

Para el uso de botones, cada uno tiene diferentes funciones, pero usa el mismo handler que detecta cuál botón recibe el click.

Interfaces

Al igual que el anterior el uso de los handlers implica el uso de sus interfaces, por lo cual se usan los métodos de los handlers de Java.

Excepciones

Cuando el jugador quiere mejorar una habilidad del mono a más de nivel 99 el juego envía un mensaje que le evita mejorarlo.




