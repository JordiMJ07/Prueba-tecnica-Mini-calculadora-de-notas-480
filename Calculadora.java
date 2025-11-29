import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numasignaturas;
        double[] notas;

        do {
            System.out.print("Introduce el número de asignaturas: ");
            numasignaturas = teclado.nextInt();

            if (numasignaturas < 1 || numasignaturas > 10) {
                System.out.println("ERROR: El valor introducido debe estar entre 1 y 10");
            }

        }while (numasignaturas < 1 || numasignaturas > 10);


        notas = new double[numasignaturas];
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Introduce la nota de la asignatura " + (i + 1) + " (0-10): ");
                nota= teclado.nextDouble();

                if (nota < 0 || nota > 10) System.out.println("ERROR: El valor introducido debe estar entre 0 y 10");

            }while (nota < 0 || nota > 10);
            notas[i] = nota;
        }
        System.out.println("");
        System.out.println("Estas son tus notas: " + TodasLasNotas(numasignaturas, notas));
        System.out.println("Nota media: " + NotaMedia(numasignaturas, notas));
        System.out.println("Notas suspendidas: " + Suspensos(notas));
        System.out.println("Resultado final: " + AprobadoSuspendido(numasignaturas, notas));
    }

    public static String TodasLasNotas(int asignaturas, double[] notas) {
        String respuesta = "";

        for (int i = 0; i < notas.length; i++) {
            if (i == notas.length - 1) respuesta += notas[i];
            else respuesta += notas[i] + ", ";
        }
        return respuesta;
    }
    public static double NotaMedia(int asignaturas, double[] notas) {
        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        return total / asignaturas;
    }
    public static int Suspensos (double[] notas) {
        int suspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) suspensos++;
        }
        return suspensos;
    }
    public static String AprobadoSuspendido(int asignaturas, double[] notas) {
        int suspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) suspensos++;
        }
        if (NotaMedia(asignaturas, notas) < 5) return "SUSPENDIDO";
        else if(suspensos > 1) return "SUSPENDIDO (Por tener más de 1 asignatura suspendida)";
        return "APROBADO";
    }
}
