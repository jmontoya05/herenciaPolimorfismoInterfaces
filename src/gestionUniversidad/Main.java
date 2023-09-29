package gestionUniversidad;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Profesor profesorMatematicas = new Profesor("Alexis Pinilla", 35, "Masculino", "Licenciado en matemáticas");
        Profesor profesorCastellano = new Profesor("Carlos Tobón", 24, "Masculino", "Licenciado en literatura");
        Profesor profesorAnatomia = new Profesor("Yadira Gómez", 20, "Femenino", "Licenciada en anatomía");
        Profesor profesorFisica = new Profesor("Alfonso Montes", 42, "Masculino", "Licenciada en educación física");

        Estudiante estudiante1 = new Estudiante("Nelson Carvajal", 35, "Masculino", "abc123");
        Estudiante estudiante2 = new Estudiante("Luisa Calderon", 34, "Femenino", "def456");
        Estudiante estudiante3 = new Estudiante("Juan Nanclares", 28, "Masculino", "ghi789");
        Estudiante estudiante4 = new Estudiante("Milena Pérez", 39, "Femenino", "jkl012");
        Estudiante estudiante5 = new Estudiante("Diana García", 45, "Femenino", "mno345");
        Estudiante estudiante6 = new Estudiante("Juan Villa", 32, "Masculino", "pqr678");
        Estudiante estudiante7 = new Estudiante("Mariana Cardona", 23, "Femenino", "stu901");
        Estudiante estudiante8 = new Estudiante("Andrés Orrego", 26, "Masculino", "vwx234");

        profesorMatematicas.setMateria("Matemáticas");
        profesorMatematicas.setMateria("Estadistica");
        profesorAnatomia.setMateria("Ciencias naturales");
        profesorAnatomia.setMateria("Medio ambiente");
        profesorAnatomia.setMateria("Zootecnia");
        profesorCastellano.setMateria("Español");
        profesorFisica.setMateria("Educación física");
        profesorFisica.setMateria("Gimnasia");

        CursoPresencial cursoFundamentos = new CursoPresencial("Fundamentos básicos",profesorMatematicas,"Lunes a viernes");
        CursoVirtual cursoLiteratura = new CursoVirtual("Literatura básica",profesorCastellano,"Teams");
        CursoPresencial cursoSalud = new CursoPresencial("Muevase pues",profesorFisica,"Lunes a miercoles");
        CursoVirtual cursoBotanica = new CursoVirtual("Botanica escencial",profesorAnatomia,"Zoom");

        cursoFundamentos.setEstudiante(estudiante1);
        cursoFundamentos.setEstudiante(estudiante2);
        cursoFundamentos.setEstudiante(estudiante3);
        cursoFundamentos.setEstudiante(estudiante4);

        cursoLiteratura.setEstudiante(estudiante5);
        cursoLiteratura.setEstudiante(estudiante6);

        cursoSalud.setEstudiante(estudiante7);
        cursoSalud.setEstudiante(estudiante8);
        cursoSalud.setEstudiante(estudiante1);

        cursoBotanica.setEstudiante(estudiante2);
        cursoBotanica.setEstudiante(estudiante3);
        cursoBotanica.setEstudiante(estudiante4);
        cursoBotanica.setEstudiante(estudiante5);
        cursoBotanica.setEstudiante(estudiante6);

        List<Estudiante> estudiantes = new ArrayList<>(Arrays.asList(estudiante1, estudiante2, estudiante3, estudiante4, estudiante5, estudiante6, estudiante7, estudiante8));
        Random  random = new Random();
        for (Estudiante estudiante: estudiantes) {
            double [] notas = new double[3];
            for (int i = 0; i < notas.length; i++) {
                notas[i] = random.nextInt(10);
            }
            estudiante.setNotas(notas);
        }

        System.out.println("\nNotas alumnos curso fundamentos:");

        for (int i = 0; i < cursoFundamentos.calcularAsistenciaPromedio(); i++) {
            System.out.println(cursoFundamentos.getEstudiantes().get(i).mostrarInformacion());
        }

        System.out.println("\nNotas alumnos curso literatura:");

        for (int i = 0; i < cursoLiteratura.calcularParticipacionPromedio(); i++) {
            System.out.println(cursoLiteratura.getEstudiantes().get(i).mostrarInformacion());
        }

        System.out.println("\nNotas alumnos curso salud:");

        for (int i = 0; i < cursoSalud.calcularAsistenciaPromedio(); i++) {
            System.out.println(cursoSalud.getEstudiantes().get(i).mostrarInformacion());
        }

        System.out.println("\nNotas alumnos curso botánica:");

        for (int i = 0; i < cursoBotanica.calcularParticipacionPromedio(); i++) {
            System.out.println(cursoBotanica.getEstudiantes().get(i).mostrarInformacion());
        }

        System.out.println("\nInformación del curso de botánica");
        System.out.println(cursoBotanica.mostrarInformacion());
    }
}
