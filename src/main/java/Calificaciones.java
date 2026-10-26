import java.util.Scanner;
public class Calificaciones {
    static String nombre;
    static int alumnos = 0;
    static double eva1=0;
    static double eva2=0;
    static double eva3=0;
    static double promedio = 0;
    static int elec = 0;
    public static void promedio() {

        promedio = (eva1 + eva2 + eva3) / 3;

    }

    public static void datos (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Nombre: ");
        nombre= scanner.next();
        System.out.print(" Evaluacion 1: ");
        eva1 = scanner.nextDouble();
        System.out.print(" Evaluacion 2: ");
        eva2 = scanner.nextDouble();
        System.out.print(" Evaluacion 3: ");
        eva3 = scanner.nextDouble();
        promedio();
        System.out.println(" Promedio: " + promedio);

        if (promedio<6){
            System.out.println("Resultado: REPROBADO");
        }
        if (promedio >= 6 && promedio <= 10){
            System.out.println("Resultado: APROBADO");
        }

    }

    public static void volver (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Desea registrar mas alumnos?");
        System.out.println("1. si ");
        System.out.println("2. No");
        System.out.println("Seleccione una opcion: ");
        elec = scanner.nextInt();
        while (elec != 1 && elec != 2 && elec != 3){
            System.out.println("El numero ingresado es invalido vuelve a ingresarlo: ");
            elec = scanner.nextInt();
            switch (elec){
                case 1:
                    registro();
                    break;

                case 2:
                    menu();
                    break;

            }
        }

    }
    public static void estadisticas () {
        System.out.pr

    }
    public static void registro (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========================");
        System.out.println("REGISTRAR ESTUDIANTES");
        System.out.println("========================");
        System.out.println("¿Cuantos estudiantes registrara? : ");
        alumnos = scanner.nextInt();
        for ( int i = 1; i <= alumnos; i++){
            System.out.println("_______________");
            System.out.println("Alumno "+ i);
            System.out.println("_______________");
            datos();

        }

    }

    public static void menu(){
        System.out.println("=========================");
        System.out.println("CONTROL DE CALIFICACIONES");
        System.out.println("=========================");
        System.out.println("1. Registrar calificaciones");
        System.out.println("2. Mostrar estadisticas");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opcion  (1, 2 o 3): ");

    }
    public static void main (String []a){
        int opc =0;
        Scanner scanner = new Scanner(System.in);
        menu ();
        opc = scanner.nextInt();
        while (opc != 1 && opc != 2 && opc != 3){
            System.out.println("El numero ingresado es invalido vuelve a ingresarlo: ");
            opc = scanner.nextInt();
        }
        switch (opc){
            case 1:
                registro();
            break;

            case 2:
                estadisticas();
            break;

            case 3:
                System.out.println("Fin del programa");
            break;
        }

    }
}
