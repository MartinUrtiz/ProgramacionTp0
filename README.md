Informe del Proyecto Java

1. Encapsulamiento
En mi solución, todos los atributos de las clases son privados, evitando que se modifiquen directamente desde fuera de la clase. Para manejar estos valores, implementé métodos getters y setters, lo que permite controlar cómo se acceden y modifican los datos.

2. Relaciones entre clases

Estudiante: tiene una lista de materias que cursa.

Carrera: contiene varios estudiantes.

Universidad: posee estudiantes y datos propios de la institución.

Esto permite representar correctamente las relaciones entre las entidades y manejar la información de forma organizada.

3. Validaciones en los setters

Estudiante:

Edad debe ser mayor a 16.

Promedio entre 0 y 10.

Nombre y apellido no pueden estar vacíos.

Materia:

La nota debe estar entre 0 y 10.

Estas validaciones aseguran que los datos ingresados sean correctos y consistentes, evitando errores durante la ejecución del programa.
