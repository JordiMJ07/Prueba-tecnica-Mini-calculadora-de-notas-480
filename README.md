# Prueba técnica: Mini calculadora de notas
En este repositorio encontrarás mi solución a la prueba técnica en el programa Calculadora.java.

## ¿Qué hace el programa?
Se trata de una mini calculadora de notas que ayuda a un alumno a saber su nota media, si ha aprobado el curso y cuántas asignaturas ha suspendido. Para ello hay que proporcionarle el número de asignaturas, que si no se encuentra entre 1 y 10 el programa nos devolverá un error y lo pedirá de nuevo, y la nota de cada una de estas, que si alguna es menor que 0 o mayor que 10 devolverá otro error y la pedirá nuevamente.

En cuanto al programa, el lenguaje empleado es java y está dividido en una serie de métodos con tareas específicas:
- **TodasLasNotas:** Devuelve un String con todas las notas separadas por comas.
- **NotaMedia:** Suma todas las notas y las divide entre el número de asignaturas para calcular la media.
- **Suspensos:** Cuenta cuántas notas están por debajo de 5, es decir, contabiliza los suspensos.
- **AprobadoSuspendido:** Dice si el curso está aprobado o suspendido en función de si la media es mayor o menor a 5 y si se suspenden más de una asignatura.

## Dificultades
### Parte más sencilla
La compresión e interpretación del problema planteado.

### Parte más compleja
La programación de los errores obtenidos al escribir un parámetro fuera del rango especificado.
