package herenciaPersonas;

public class Furgonetas extends Vehiculo {
	private double altura;
	private double tara;
	private static double carga=500;


	public Furgonetas() {
		super();
		this.altura=0;
		this.tara=0;
	}


	public Furgonetas(String matricula, String marca, String modelo, int aniosAntiguedad, double precio,
			double altura, double tara, double carga) {
		super();
		this.altura=altura;
		this.tara=tara;
	}


	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getTara() {
		return tara;
	}


	public void setTara(double tara) {
		this.tara = tara;
	}


	public static double getCarga() {
		return carga;
	}


	public void setCarga(double carga) {
		Furgonetas.carga = carga;
	}


	@Override
	public String toString() {
		return super.toString()+"Furgonetas [altura=" + altura + ", tara=" + tara + "]";
	}		
}
