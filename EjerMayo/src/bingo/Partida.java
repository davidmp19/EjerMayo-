package bingo;

import java.util.ArrayList;

public class Partida {
	private ArrayList<Jugador> jugadores;

	public Partida(int numeroJugadores) {
		jugadores = new ArrayList<Jugador>();

		for (int i = 1; i <= numeroJugadores; i++) {

			jugadores.add(new Jugador("Jugador" + i));

		}
	}

	public void quienGana() {
		boolean ganador = false;
		Bombo bombo = new Bombo();
		Carton cartonganador=new Carton();
		
			while (ganador == false) {
				for (Jugador jugador : jugadores) {
					int num = bombo.sacarNumero();
					if (jugador.getCarton().estaElNumero(num)) {
						jugador.marcarNumero(num);
						if (!jugador.getCarton().estaVacio() == true) {
							ganador = true;
							cartonganador=jugador.getCarton();
						}
					}
				}
			}
				if (ganador = true) {
			System.out.println("El ganador es :" + cartonganador);
		}
		
	}

	@Override
	public String toString() {

		return "jugadores=" + jugadores;
	}
}
