
public class MainClasss {

	public static void main(String[] args) {
		//crear los objetos
		//Propietario
		Propietario propietario1 = new Propietario();
		propietario1.setNombre("Panchito");
		propietario1.setDomicilio("Cerca del llano");
		propietario1.setEdad(52);
		propietario1.setNoLicencia(1001);
		
		MotorGasolina motorgas1 = new MotorGasolina();
		motorgas1.setNoCilindros(6);
		motorgas1.setNoSerie("ATB542S");
		
		MotorDiesel motordiesel1 = new MotorDiesel();
		motordiesel1.setNoCilindros(4);
		motordiesel1.setNoSerie("ASDFG87542");
		
		Auto miAuto = new Auto();
		miAuto.setAnio(2014);
		miAuto.setMarca("Ford");
		miAuto.setModelo("Fiesta");
		miAuto.setMotor(motorgas1);
		miAuto.setPropietario(propietario1);
		
		//mostrar datos del AUTO
		System.out.println("Tenemos un auto que es propiedad de " + miAuto.getPropietario().getNombre() + "\n");
		//llamar a las acciones del auto
		miAuto.EncenderAuto();
		System.out.println("");
		
		miAuto.Acelerar();
		System.out.println("");
		
		miAuto.Frenar();
		System.out.println("");
		
		miAuto.ApagarAuto();
		
	}

}

