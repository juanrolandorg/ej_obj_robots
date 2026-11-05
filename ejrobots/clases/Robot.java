package clases;

public class Robot {
    // creo las variables
    private String identificador;
    private String nombre;
    private int bateria;

    // Connstructor de la clase
    public Robot(String identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.bateria = 100;
    }// cierra el constructor

    // creo los métodos
    public void mostrarIfo() {
    System.out.printf("%s\n %s\n %d\n", this.identificador, this.nombre, this.bateria);
    }// cierro mostrar info

    //necesito añadir una clase que me permita cambiar el id;
    public void cambiarId(){
        System.out.print("Por favor introduzca la nueva ID del robot: ");
        String id = System.console().readLine();
        this.identificador = id;
    }//cierro cambiar ide

    public void recargar() {
        // la bateria no puede pasar de 100
        this.bateria = bateria + 20;
        if (this.bateria > 100) {
            this.bateria = 100;
        } // cierro el if
    }// recargar en un 20$%

    // este es lo de la mierda de enseñar los hastags por cada 10%
    public void estadoBateria() {
        System.out.print("[");
        for (int i = 10; i < 100; i = i + 10) {
            if (i <= bateria) {
                System.out.print("#");
            } // cierro if
            else {
                System.out.print("-");
            } // cierro else
        } // cierro for
        System.out.print("]");
        System.out.print(bateria + "%");
    }// cierro estado bateria

    // limpiar debe indicar el numero de zonas que tiene que limpiar un robot :D
    // por cada zona que limpia debe perder 15 de batería y mostrar un mensaje
    // el proceso debe terminar cuando se hayan limpiado todas las zonas
    // o al robot no le quede batería pa limpiar otra
    // al acabar mostrará cuantas zonas se han limpiado
    // si el numero de zonas solicitadas en negativo, msj de error :D
    public void limpiar() {
        boolean limpiar;
        int limpiada = 0;
        // pido el num de zonas que se van a limpiar
        System.out.print("Por favor introduzca las zonas que desea limpiar: ");
        int zona = Integer.parseInt(System.console().readLine());
        System.out.println();

        // compruebo si es negativo
        if (zona < 0) {
            System.out.println("Por favor recuerde que el numero de zonas a limmpiar debe ser mayor que 0");
        } // cierro if; este else es como decir si positivo, es decir, el código debe ir
          // dentro
        else {
            System.out.println("Entendido, se limpiará/n " + zona + " zona/s");

            // ahora toca establecer el do while para el bucle
            do {
                // primero compruebo si el robot puede limpiar las zonas
                if (bateria >= 15 && zona >= 1) {
                    limpiar = true;
                } // cierro if
                else {
                    limpiar = false;
                    break; // para que se salga del bucle si no puede seguir limpiando
                } // cierro else
                  // ahora tengo que hacer que limpie una zona
                  // lo que hace que zona disminuya 1 y bateria 15
                zona = zona - 1;// se limpia una zona
                limpiada = limpiada + 1;
                // quito 15 de bateria
                bateria = bateria - 15;

            } while (limpiar == true);
            System.out.print("Se han limpiado " + limpiada + " zonas");
        } // cierro el mega else
    }// cierro limpiar

}// cierra la clase
