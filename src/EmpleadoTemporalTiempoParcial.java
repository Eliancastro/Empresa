
public class EmpleadoTemporalTiempoParcial extends Empleado {

	private int horasTrabajadas = 0;
	private double valorDeLaHora = 10;



	public EmpleadoTemporalTiempoParcial(String nombre, String apellido,int hijos, int conyugue ) throws ValidarDatos {
		super(nombre, apellido, hijos, conyugue);
		
		validar(nombre, apellido, hijos, conyugue);
		
		  this.nombre = nombre;
		  this.apellido = apellido;
		  this.hijos = hijos;
		  this.conyugue = conyugue;
	}

	

	@Override
	protected String getTipoDeEmpleado() {
		
		return "Empleado/a de tiempo parcial. Planta transitoria";
	}



	@Override
	public String toString() {
		return "EmpleadoTemporalTiempoParcial [nombre=" + nombre + ", apellido=" + apellido + ", getTipoDeEmpleado()="
				+ getTipoDeEmpleado() + ", sueldo=" ;
	}
	
	protected void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	protected double calcularSueldo() {
		
		if ((sueldoBasico * 0.25) + (horasTrabajadas * valorDeLaHora) > 1000 ) {
			
			return 1000 + hijos * 200 + conyugue * 100 ;
		}
		return (sueldoBasico * 0.25) + (horasTrabajadas * valorDeLaHora)
				+ hijos * 200 + conyugue * 100 ;
	}
	
	
	

}
