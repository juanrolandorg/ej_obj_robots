import clases.Robot;

public class Main {
    public static void main(String[] args) {

        Robot robot1 = new Robot("001", "Limpiador1");
        Robot robot2 = new Robot("002", "Limpiador2");
        // Ya muestra el menú, ahora tengo que hacer el switch que lo maneje
        boolean menu = true;
        int opcion = 0;
        while (menu) {

            switch (opcion) {
                case 0:
                    System.out.println("----------------");
                    System.out.println("Bienvenido a la estación Oirón, por favor introduza la opción que desee: ");
                    System.out.println("Pulse 1 para mostar la información del robot");
                    System.out.println("Pulse 2 para que el robot limpie");
                    System.out.println("Pulse 3 para recargar el robot");
                    System.out.println("Pulse 4 para mostar el estado de la batería");
                    System.out.println("Pulse 5 para cambiar el ID del robot");
                    System.out.println("Pulse 6 para salir");
                    System.out.print("Va a elegir la opción: ");
                    opcion = Integer.parseInt(System.console().readLine());
                    System.out.println();
                    break;
                case 1:
                    // primero solicito para que robot será
                    opcion = 0; // esto es para que luego vuelva al menu inicial
                    System.out.println("Por favor, introduzca el número del robot del que desea ver la información");
                    System.out.println("Pulse 0 si desea ver la de ambos");
                    System.out.print("Su elección es: ");
                    int robotico = Integer.parseInt(System.console().readLine());
                    switch (robotico) {
                        case 0:
                            robot1.mostrarIfo();
                            System.out.println();
                            System.out.println("------------------");
                            robot2.mostrarIfo();
                            System.out.println();
                            break;

                        case 1:
                            robot1.mostrarIfo();
                            System.out.println();
                            break;
                        case 2:
                            robot2.mostrarIfo();
                            System.out.println();
                            ;
                        default:
                            System.out.println("No se ha encontrado dicho robot, saliendo del menú");
                            break;
                    }
                    break;
                case 2:
                    // aqui necesito meter para que el robot limpie
                    opcion = 0; // pa que vuelva
                    System.out.println("Por favor, introduzca el número del robot que desea que limpie");
                    System.out.print("Su elección es: ");
                    robotico = Integer.parseInt(System.console().readLine());
                    switch (robotico) {
                        case 1:
                            robot1.limpiar();
                            break;
                        case 2:
                            robot2.limpiar();
                            break;
                        default:
                            System.out.println("No se ha encontrado dicho robot, saliendo del menú");
                            break;
                    }
                    break;
                case 3:
                    // aqui necesito recargar el robot
                    opcion = 0; // pa que vuelva
                    System.out.println("Por favor, introduzca el número del robot que desea recargar");
                    System.out.println("Pulse 0 si desea que sean ambos");
                    System.out.print("Su elección es: ");
                    robotico = Integer.parseInt(System.console().readLine());
                    switch (robotico) {
                        case 0:
                            robot1.recargar();
                            robot2.recargar();
                            break;
                        case 1:
                            robot1.recargar();
                            break;
                        case 2:
                            robot2.recargar();
                            break;
                        default:
                            System.out.println("No se ha encontrado dicho robot, saliendo del menú");
                            break;
                    }
                    break;
                case 4:
                    // aqui necesito mostrar la info de la batería
                    opcion = 0; // pa que vuelva
                    System.out.println(
                            "Por favor, introduzca el número del robot del que desea ver el estado de batería");
                    System.out.println("Pulse 0 para que sean ambos");
                    System.out.print("Su elección es: ");
                    robotico = Integer.parseInt(System.console().readLine());
                    switch (robotico) {
                        case 0:
                            System.out.println("Robot 1");
                            robot1.estadoBateria();
                            System.out.println();
                            System.out.println("Robot 2");
                            robot2.estadoBateria();
                            System.out.println();
                            break;
                        case 1:
                            robot1.estadoBateria();
                            System.out.println();
                            break;
                        case 2:
                            robot2.estadoBateria();
                            System.out.println();
                            break;
                        default:
                            System.out.println("No se ha encontrado dicho robot, saliendo del menú");
                            break;
                    }
                    break;
                case 5:
                    // aqui cambiar el ID
                    opcion = 0; // pa que vuelva
                    System.out.println("Por favor, introduzca el número del robot que desea que limpie");
                    System.out.print("Su elección es: ");
                    robotico = Integer.parseInt(System.console().readLine());
                    switch (robotico) {
                        case 1:
                            robot1.cambiarId();
                            break;
                        case 2:
                            robot2.cambiarId();
                            break;
                        default:
                            System.out.println("No se ha encontrado dicho robot, saliendo del menú");
                            break;
                    }
                    break;
                case 6:
                    opcion = 0;
                    System.out.println("Saliendo del menú...");
                    menu = false;

                default:
                    if(opcion!=0){System.out.println("Por favor, introduzca un numero válido");}
                    ;
            }

        }

    }// cierro la class

} // cierro el main