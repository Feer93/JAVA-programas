
public class Colegio extends Edificio {//colegio requiere de un constructor al ser una clase hija d edificio requiere que le declaremos informacion
	
	public Colegio(String direccion, int codigoPostal, float altura,
			boolean calefaccionCentral) {
		super(direccion, codigoPostal, altura, calefaccionCentral);//son los parametros q reenvia a la clase madre
		
	}
	private int numeroAulas;
	private boolean pabellon;
	
	


public int getCapacidadColegio(){
	int capacidadColegio;
	capacidadColegio=numeroAulas*30;
	return(capacidadColegio);
	
	
}
}
