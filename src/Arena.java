import java.util.Arrays;

public class Arena {
    public static char [][] posiciones;



    public static void mostrarArena(){

        String tableroString = "";
        for (int i = 0; i < posiciones.length; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < posiciones[0].length; j++){
                sb.append(posiciones[i][j]).append(" ");
            }
            System.out.println(sb);
        }
    }
    public static void generarArena(int medida){
        if (medida == 1 ){
            posiciones = new char[10][10];
            vaciarArena();
            colocarObstaculos(medida*3);
        }
        if (medida == 2){
            posiciones = new char[15][10];
            vaciarArena();
            colocarObstaculos(medida*3);
        }
        if (medida == 3){
            posiciones = new char[30][15];
            vaciarArena();
            colocarObstaculos(medida*3);
        }
    }

    public static void vaciarArena(){
        for (char[] posicion : posiciones) {
            Arrays.fill(posicion, '-');
        }

    }

    public static void colocarObstaculos(int cantidadDeObs){
        int contador = 0;
        while (contador <cantidadDeObs){
            //elige con Math.Random, posiciones aleatorias para plantar 3 obstaculos
            int filaAletoria = (int) (Math.random() * posiciones.length );
            int columnaAleatoria = (int) (Math.random() * posiciones[0].length);
            posiciones[filaAletoria][columnaAleatoria] = '0';

            System.out.println("las posiciones fueron: posiciones" + filaAletoria + " " + columnaAleatoria);
            System.out.println(posiciones[filaAletoria][columnaAleatoria]);

            contador++;
        }
    }


}
