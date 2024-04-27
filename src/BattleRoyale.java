import java.util.Scanner;

public class BattleRoyale {
    static boolean arenaCreada = false;


    //da al usuario a elegir el tamanio de la arena
    public static void eleccionArena() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige las dimensiones de la arena: de 1 a 3.");
        int tamanio = sc.nextInt();
        if (tamanio < 1 || tamanio > 3) {
            System.out.println("Ingresa una dimension valida.");
        } else {
            Arena.generarArena(tamanio);
            arenaCreada = true;
            Jugador.colocarJugadores();
            Arena.mostrarArena();
        }
    }

    public static void movimiento(char direccion) {
        //encuentra al jugador del turno
        int posiconVertical = 0;
        int posiconHorizontal = 0;
        for (int i = 0; i < Arena.posiciones.length; i++) {
            for (int j = 0; j < Arena.posiciones.length; j++) {
                if (Arena.posiciones[i][j] == 'J') {
                    System.out.println("Lo encontre en posicion: " + i + " " + j);
                    ;
                    posiconVertical = i;
                    posiconHorizontal = j;
                }
            }
        }
        //direcciones de movimiento
        //verifica si el movmiento es posible
        if (direccion == 'd' && posiconHorizontal < Arena.posiciones[0].length -1) {
            Arena.posiciones[posiconVertical][posiconHorizontal] = '-';
            Arena.posiciones[posiconVertical][posiconHorizontal + 1] = 'J';
        }
        if (direccion == 'a' && posiconHorizontal != 0) {
            Arena.posiciones[posiconVertical][posiconHorizontal] = '-';
            Arena.posiciones[posiconVertical][posiconHorizontal - 1] = 'J';
        }
        if (direccion == 's' && posiconVertical < Arena.posiciones.length-1) {
            Arena.posiciones[posiconVertical][posiconHorizontal] = '-';
            Arena.posiciones[posiconVertical + 1][posiconHorizontal] = 'J';
        }
        if (direccion == 'w' && posiconVertical != 0) {
            Arena.posiciones[posiconVertical][posiconHorizontal] = '-';
            Arena.posiciones[posiconVertical - 1][posiconHorizontal] = 'J';
        }
        System.out.println("Ingresa un movimiento valido.");

    }

    public static void jugar() {
        while (!arenaCreada) {
            eleccionArena();
        }

        if (Jugador.turno) {
            Scanner sc = new Scanner(System.in);
            while (Jugador.turno) {
                try {
                    System.out.println("Tu turno.");
                    System.out.println("usa w a s d para moverte, o f para disparar:");
                    char movimiento = sc.next().charAt(0);
                    movimiento(movimiento);
                    Arena.mostrarArena();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Parece que estas queriendo acceder a una posicion invalida " + e.getMessage());
                    continue;
                } catch (Exception e) {
                    System.out.println("ocurrio un error" + e.getMessage());

                }

            }
        }

    }


}
