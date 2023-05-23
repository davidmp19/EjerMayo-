package bingo;

public class Start {

	public static void main(String[] args) {
		Partida juego=new Partida(5);
		System.out.println(juego.toString());
		juego.quienGana();
		/*
		Bombo bombo=new Bombo();
		Carton carton=new Carton();
		
		
		System.out.println(carton.estaElNumero(5));
		System.out.println(carton.estaVacio());

		System.out.println(carton);
		carton.marcarNumero(5);
		System.out.println(carton);
		*/

		
		}

}
