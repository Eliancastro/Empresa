
public class EmpleadoSinCategoriaDeTiempoParcial extends Empleado {

	private int horasTrabajadas;
    private double valorDeLaHora = 10;
    protected int antiguedad;

	public EmpleadoSinCategoriaDeTiempoParcial(String nombre, String apellido,int hijos, int conyugue, int antiguedad ) throws ValidarDatos {
		super(nombre, apellido, hijos, conyugue);
		
		validar(nombre, apellido, hijos, conyugue);
		if(antiguedad < 0) {
			throw new ValidarDatos("La antiguedad debe ser 0 o mayor");
		}
		  this.nombre = nombre;
		  this.apellido = apellido;
		  this.hijos = hijos;
		  this.conyugue = conyugue;
		  this.antiguedad = antiguedad;
	}

	

	@Override
	protected String getTipoDeEmpleado() {
		
		return "Empleado/a de tiempo parcial. Planta permanente";
	}



	@Override
	public String toString() {
		return "EmpleadoSinCategoriaDeTiempoParcial [nombre=" + nombre + ", apellido=" + apellido
				+ ", getTipoDeEmpleado()=" + getTipoDeEmpleado() + ", sueldo=" ;
	}
	
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}



	@Override
	protected double calcularSueldo() {
		if ((sueldoBasico * 0.25) + (horasTrabajadas * valorDeLaHora) > 1000 ) {
			if(antiguedad * 100 >= 2000) {
				return 1000 + hijos * 200 + conyugue * 100 + 2000;
			}
			return 1000 + hijos * 200 + conyugue * 100 + antiguedad * 100;
			
		}if(antiguedad * 100 >= 2000) {
			return (sueldoBasico * 0.25) + (horasTrabajadas * valorDeLaHora)
			+ hijos * 200 + conyugue * 100 + 2000;
		}
		return (sueldoBasico * 0.25) + (horasTrabajadas * valorDeLaHora)
				+ hijos * 200 + conyugue * 100 + antiguedad * 100;
	}
	
	

}
