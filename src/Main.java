import Zoologico.model.*;
import java.util.Scanner;
package ClubDeportivo.model;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // DECLARACIÓN E INICIALIZACIÓN DE LOS ARREGLOS
        Animal[] animales = {
                new Mamifero("León", "sabana", 2, 2, 1, false, TipoPelaje.GUARDIA),
                new Reptil("Cobra", "venenosa", 3, 0, 2, true, true, false),
                new Ave("Águila", "Austral", 1, 3, 3, false, "Bueno", CapacidadDeVuelo.VOLADOR)
        };

        Cuidador[] cuidadores = {
                new Cuidador("Carlos", 38123456, 450000.0, Especialidad.MAMIFERO),
                new Cuidador("Ana", 40987654, 480000.0, Especialidad.REPTIL),
                new Cuidador("Luis", 42111222, 460000.0, Especialidad.AVE)
        };

        boolean incorrect;
        String seguir = "si";
        int opcionEjercicio;

        System.out.println("Ingrese 1 para ir a El zoologico o 2 para dirigirse al Club deportivo");
        opcionEjercicio = scanner.nextInt();
        if(opcionEjercicio == 1){
        while (seguir.equalsIgnoreCase("si")) {

            do {
                incorrect = false;

                System.out.println("\n=== MENÚ ZOOLÓGICO ===");
                System.out.println("1. Mostrar todos los animales");
                System.out.println("2. Mostrar todos los cuidadores");
                System.out.println("3. Alimentar un animal");
                System.out.println("4. Limpiar un animal");
                System.out.println("5. Vacunar / Rehabilitar un animal");
                System.out.println("6. Jugar / Hacer correr a un animal");
                System.out.print("Elija una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("\n--- ANIMALES ---");
                        for (int i = 0; i < animales.length; i++) {
                            System.out.println("[" + i + "] " + animales[i]);
                        }
                        break;

                    case 2:
                        System.out.println("\n--- CUIDADORES ---");
                        for (int i = 0; i < cuidadores.length; i++) {
                            System.out.println("[" + i + "] " + cuidadores[i]);
                        }
                        break;

                    case 3:
                        System.out.print("Índice del cuidador (0-2): ");
                        int c1 = scanner.nextInt();
                        System.out.print("Índice del animal (0-2): ");
                        int a1 = scanner.nextInt();
                        scanner.nextLine();

                        if (cuidadores[c1].alimentar(animales[a1])) {
                            System.out.println("¡Animal alimentado con éxito!");
                        } else {
                            System.out.println("No se pudo alimentar (especialidad no coincide o no tiene hambre).");
                        }
                        break;

                    case 4:
                        System.out.print("Índice del cuidador (0-2): ");
                        int c2 = scanner.nextInt();
                        System.out.print("Índice del animal (0-2): ");
                        int a2 = scanner.nextInt();
                        scanner.nextLine();

                        if (cuidadores[c2].limpiar(animales[a2])) {
                            System.out.println("¡Animal limpiado con éxito!");
                        } else {
                            System.out.println("No se pudo limpiar (especialidad no coincide o ya está limpio).");
                        }
                        break;

                    case 5:
                        System.out.print("Índice del cuidador (0-2): ");
                        int c3 = scanner.nextInt();
                        System.out.print("Índice del animal (0-2): ");
                        int a3 = scanner.nextInt();
                        scanner.nextLine();

                        if (cuidadores[c3].vacunar(animales[a3])) {
                            System.out.println("¡Animal rehabilitado con éxito!");
                        } else {
                            System.out.println("No se pudo vacunar (especialidad no coincide o salud mayor a 0).");
                        }
                        break;

                    case 6:
                        System.out.print("Índice del cuidador (0-2): ");
                        int c4 = scanner.nextInt();
                        System.out.print("Índice del animal (0-2): ");
                        int a4 = scanner.nextInt();
                        scanner.nextLine();

                        if (cuidadores[c4].jugar(animales[a4])) {
                            System.out.println("El animal corrió.");
                        } else {
                            System.out.println("No se pudo jugar (especialidad no coincide o el azar no activó la salud).");
                        }
                        break;

                    default:
                        System.out.println("ERROR defaulting to main MENU\n");
                        incorrect = true;
                        break;
                }
            } while (incorrect);

            System.out.println("Desea continuar en el MENU? (si/no):");
            seguir = scanner.nextLine();
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }else if(opcionEjercicio == 2){

            //while desea continuar
            while (seguir.equalsIgnoreCase("si")) {
                //while ERROR
                do {
                    incorrect = false;

                    int opcion = 0;
                    System.out.println("MENU\n");

                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcion) {
                        //revisar los case nose porq me aparecen en rojo
                        case 1:
                            Jugador nuevoJugador = new Jugador(33016244, "Lionel Messi", "24/06/1987", Categoria.PROFESIONAL, 10, futbol);

                            if (equipo.agregarJugadores(nuevoJugador)) {
                                System.out.println(">> ¡Jugador " + nuevoJugador.getNombre() + " agregado con éxito!");
                            } else {
                                System.out.println(">> Error al agregar al jugador (deporte incompatible o cupo lleno).");
                            }
                            break;
                        case 2:
                            System.out.println("\n--- Plantel de Jugadores ---");
                            StringBuilder lista = equipo.mostrarJugadores();
                            if (lista.length() == 0) {
                                System.out.println("Aún no hay jugadores registrados.");
                            } else {
                                System.out.print(lista.toString());
                            }
                            break;

                        case 3:
                            System.out.println("\n--- Información del Equipo ---");
                            System.out.println("Equipo: " + equipo.getNombreEquipo());
                            System.out.println("Deporte: " + equipo.getDeporte().getNombreDeporte());
                            System.out.println("Entrenador: " + equipo.getEntrenador().getNombre());
                            break;

                        case 4:
                            System.out.println("Saliendo del sistema...");
                            break;

                        default:
                            System.out.println("ERROR defaulting to main MENU\n");
                            incorrect = true;
                            break;
                    }
                } while (incorrect);
                System.out.println("Desea continuar en el MENU? \nSi-No\n");
                seguir = scanner.nextLine();
                scanner.nextLine();

                System.out.println("Programa finalizado.");
                scanner.close();
            }

        }else{
            System.out.println("ERROR: ingreso un ejercicio inexistente. \n Finalizando sesion.");
        }
    }
}


