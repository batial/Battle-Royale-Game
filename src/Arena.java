import java.util.Arrays;

public class Arena {
    public static char [][] posiciones;

    public static void mostrarArena(){
        System.out.println(Arrays.deepToString(posiciones));
    }
    public static void generarArena(int medida){
        System.out.println("Ingrese una medida de arena entre 1 y 3");
        if (medida ==1 ){
            posiciones = new char[10][10];
        } else if (medida == 2){
            posiciones = new char[15][10];
        }else if (medida == 3){
            posiciones = new char[30][15];
        } else {
            System.out.println("Ingrese una medida válida.");
        }
    }


}
