package minecraftPoo;

/**
 * Poo - Minecraft
 * 
 * @author Felipe Galv�o
 */

public class EnxadaMadeira {

	public static void main(String[] args) {
		Enxada objetoEnxada = new Enxada();
		objetoEnxada.textura = "Madeira";
		objetoEnxada.resistencia = 3;
		objetoEnxada.dano = 2;
		System.out.println("Objeto: Enxada");
		System.out.println("Textura: " +objetoEnxada.textura);
		System.out.println("Resistencia: " +objetoEnxada.resistencia);
		System.out.println("Dano: " +objetoEnxada.dano);
		objetoEnxada.minerar();
		objetoEnxada.arar();
	}

}
