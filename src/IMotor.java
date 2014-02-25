
public interface IMotor {
	//Una Interface solo define el comportamiento
	//es decir, solo declara los métodos públicos
	//no los implementa.
	//La implementación de los miembros de la interface
	//se realiza en la clase que la herede.
	
	//declaración del comportamiento
	public void Encender();
	public void Apagar();
	public void IniciarCombustion();
	public void DetenerCombustion();
	public void AumentarRevoluciones();
	public void DisminuirRevoluciones();
	public String getNoSerie();
	public void setNoSerie(String NumSerie);
	public int getNoCilindros();
	public void setNoCilindros(int NumCilindros);
}
