import java.util.Arrays;
import java.util.Scanner;

public class BattleRoyale{
    static boolean arenaCreada = false;

    //da al usuario a elegir el tamanio de la arena
    public static void eleccionArena(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige las dimensiones de la arena: de 1 a 3.");
        int tamanio = sc.nextInt();
        if (tamanio< 1 || tamanio >3){
            System.out.println("Ingresa una dimension valida.");
        } else {
            Arena.generarArena(tamanio);
            arenaCreada = true;
            Arena.mostrarArena();
        }
    }

    public static void jugar(){
        while (!arenaCreada){
            eleccionArena();
        }


        try {

            Scanner sc = new Scanner(System.in);
            //comandos de movimiento
            System.out.println("Tu turno.");
            System.out.println("usa w a s d para moverte, o f para disparar:");
            String movimiento = sc.nextLine();
            Arena.mostrarArena();

        }
        catch (Exception e){
            System.out.println("ocurrio un error" + e.getMessage());

        }
    }


}
