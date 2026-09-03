# actividad3
En esta actividad desarrollé una simulación de una televisión aplicando los conceptos fundamentales de la Programación Orientada a Objetos. Para mantener una buena organización y estructurar bien la práctica, dividí el trabajo en dos clases: la clase tv y la clase main.

Redacción del Reporte de la Actividad
1. Construcción de la Clase tv
Para modelar el comportamiento de un televisor real, primero identifiqué sus características y las acciones que puede realizar:

Atributos:

canal (int): representa el canal sintonizado actualmente.

volumen (int): almacena el nivel actual del audio.

estado (booleano): indica si la televisión está encendida (true) o apagada (false).

Constructor:
Definí el constructor de la clase para asignarle valores iniciales por defecto al objeto en cuanto se crea, asegurando que comience en un estado conocido (por ejemplo, apagada, en el canal 1 y con un volumen inicial moderado).

Métodos de Comportamiento:

encender() y apagar(): modifican la variable de estado para controlar la energía del equipo.

setcanal(): recibe como argumento un número entero para cambiar la televisión directamente a un canal específico.

upcanal() y downcanal(): permiten navegar entre la lista de canales, avanzando un canal hacia adelante o retrocediendo uno hacia atrás.

upvolumen() y downvolumen(): ajustan la intensidad del sonido incrementando o decrementando el valor actual en 1 unidad según se requiera.

2. Ejecución y Pruebas en la Clase main
En la clase main creé la instancia del objeto tv para poner a prueba toda la lógica programada. Realicé una secuencia de prueba simulando el uso cotidiano de un televisor: encendí el aparato, ingresé un canal directo con setcanal, utilicé upcanal y downcanal para probar la navegación secuencial, y ajusté el audio con upvolumen y downvolumen.

Finalmente, mandé a llamar las instrucciones necesarias para imprimir en la consola la información del objeto. De esta forma pude comprobar en pantalla que los métodos funcionaban correctamente y que los atributos de canal, volumen y estado cambiaban según lo esperado tras cada instrucción.
Clase main:
<img width="521" height="291" alt="image" src="https://github.com/user-attachments/assets/3bb26781-4343-42cc-975c-ffc6c5e65cbc" />

clase tv:

<img width="833" height="898" alt="image" src="https://github.com/user-attachments/assets/2341d29a-2ec5-4e0a-9937-cbe0cab1087e" />
<img width="833" height="898" alt="image" src="https://github.com/user-attachments/assets/090c1d9c-a5b7-4b73-a8f4-97418152bd7f" />

Puntos clave de la actividad
Encapsulamiento y Modelado Realista:
Representar el estado (estado, canal, volumen) y el comportamiento (encender, upcanal, upvolumen) de forma separada permite entender cómo se estructuran las entidades en software. El uso de métodos set, up y down demuestra una manipulación controlada de los atributos, evitando modificaciones desordenadas.

Lógica de Estado:
En una implementación real o más avanzada, métodos como upcanal o upvolumen suelen depender de la condición del objeto (por ejemplo, validar si estado == true antes de cambiar de canal o ajustar el volumen). Reflexionar sobre estas interacciones ayuda a comprender la importancia de las reglas de negocio en POO.

Separación de Responsabilidades:
Mantener la lógica del televisor dentro de la clase TV y la ejecución en la clase Main aplica el principio de responsabilidad única. La clase TV sabe cómo funcionar; la clase Main solo orchestró la prueba.

