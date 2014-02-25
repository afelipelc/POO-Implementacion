
//Esta clase debe implementar a la interface IMotor
public class MotorGasolina implements IMotor{
	private String noSerie;
	private int noCilindros;
	private String marca;
	
	//Implementar todos los miembros de la interface
	public void Encender(){
		System.out.println("Encendiendo motor");
		IniciarCombustion(); //Llamar al método
		System.out.println("Motor encendido, está listo");
	}
	public void Apagar(){
		System.out.println("Apagando motor...");
		DetenerCombustion();
		System.out.println("Motor apagado");
	}
	public void IniciarCombustion(){
		System.out.println("Encediendo mezcla de gasolina-oxigeno");
	}
	public void DetenerCombustion(){
		System.out.println("Deteniendo mezcla de gasolina-oxigeno");
	}
	public void AumentarRevoluciones(){
		System.out.println("Aumentando revoluciones: RPM");
	}
	public void DisminuirRevoluciones(){
		System.out.println("Disminuyendo revoluciones");
	}
	public String getNoSerie(){
		return this.noSerie;
	}
	public void setNoSerie(String NoSerie){
		this.noSerie = NoSerie;
	}
	public int getNoCilindros(){
		return this.noCilindros;
	}
	public void setNoCilindros(int NumCilindros){
		this.noCilindros = NumCilindros;
	}
	public String getMarca(){
		return this.marca;
	}
}
