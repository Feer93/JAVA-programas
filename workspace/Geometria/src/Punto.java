
public class Punto {
	public Punto(int x, int y, char letra) {
		super();
		this.x = x;
		this.y = y;
		this.letra = letra;
	}
	private int x;
	private int y;
	private char letra;//para garantizar que nuestro programa cumpla la condicin de encapsulacion
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
}
