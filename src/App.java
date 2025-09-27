public class App {
        
           public static void main(String[] args) {
        
        Carrera ingenieria = new Carrera("Ingeniería en Sistemas");

        Estudiante e1 = new Estudiante();
        e1.setNombre("Fernando");
        e1.setApellido("Perez");
        e1.setEdad(23);
        e1.setCarrera("Sistemas");

        Estudiante e2 = new Estudiante("Lionel", "Rojas", 22, "Sistemas", 0);
        Estudiante e3 = new Estudiante("Marcelo", "Gallardo", 19, "Sistemas", 0);

        Materia m1 = new Materia("Programación I", "PRG101", 6, 8);
        Materia m2 = new Materia("Base de Datos", "BD102", 4, 7);
        Materia m3 = new Materia("Matemática I", "MAT101", 5, 9);

        e1.agregarMateria(m1);
        e1.agregarMateria(m3);

        e2.agregarMateria(m2);
        e2.agregarMateria(m3);

        e3.agregarMateria(m1);
        e3.agregarMateria(m2);

        e1.calcularPromedio();
        e2.calcularPromedio();
        e3.calcularPromedio();

        ingenieria.agregarEstudiante(e1);
        ingenieria.agregarEstudiante(e2);
        ingenieria.agregarEstudiante(e3);

        System.out.println("Promedios:");
        System.out.println(e1.getNombre() + ": " + e1.getPromedio());
        System.out.println(e2.getNombre() + ": " + e2.getPromedio());
        System.out.println(e3.getNombre() + ": " + e3.getPromedio());

        System.out.println("\nEstudiantes de la carrera " + ingenieria.getNombre() + ":");
        ingenieria.listarEstudiantes();
    }
}
