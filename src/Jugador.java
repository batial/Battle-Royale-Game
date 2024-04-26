public class Jugador {

    public static boolean turno = true;

    public static void colocarJugadores(){
        Arena.posiciones[0][0] = 'J';
        Arena.posiciones[Arena.posiciones.length -1][Arena.posiciones[0].length-1] = 'M';
    }



}
