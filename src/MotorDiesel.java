
public class MotorDiesel implements IMotor {

	private String noSerie;
	private int noCilindros;
	
	@Override
	public void Encender() {
		System.out.println("Encendiendo motor diesel");
		IniciarCombustion();
		System.out.println("Motor encendido");
	}

	@Override
	public void Apagar() {
		System.out.println("Apagando motor diesel");
		DetenerCombustion();
		System.out.println("Motor apagado");
	}

	@Override
	public void IniciarCombustion() {
		System.out.println("Iniciando combustión a diesel");
	}

	@Override
	public void DetenerCombustion() {
		System.out.println("Deteniendo combustión a diesel");
	}

	@Override
	public void AumentarRevoluciones() {
		System.out.println("Aumentando revoluciones");
	}

	@Override
	public void DisminuirRevoluciones() {
		System.out.println("Dismonuyendo revoluciones");	
	}

	@Override
	public String getNoSerie() {
		return this.noSerie;
	}

	@Override
	public void setNoSerie(String NumSerie) {
		this.noSerie =NumSerie;
	}

	@Override
	public int getNoCilindros() {
		return this.noCilindros;
	}

	@Override
	public void setNoCilindros(int NumCilindros) {
		this.noCilindros = NumCilindros;
	}
	
}
