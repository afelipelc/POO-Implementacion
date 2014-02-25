
public class Auto {
	private IMotor motor;
	private Propietario propietario;
	private String marca, modelo;
	private int anio;
	
	public IMotor getMotor() {
		return motor;
	}
	
	public void setMotor(IMotor motor) {
		this.motor = motor;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public void EncenderAuto(){
		System.out.println("Iniciando secuencia de arraque");
		motor.Encender();
		System.out.println("El auto está encendido y listo");
	}
	
	public void ApagarAuto(){
		System.out.println("Iniciando secuencia de apagado del sistema");
		motor.Apagar();
		System.out.println("El auto se ha apagado");
	}
	
	public void Acelerar(){
		motor.AumentarRevoluciones();
		System.out.println("Acelerando a fondo... precaución");
	}
	
	public void Frenar(){
		motor.DisminuirRevoluciones();
		System.out.println("Deteniendo velocidad del auto...");
	}
	
}
