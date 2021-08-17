
public class EmpleadoTemporalTiempoCompleto extends Empleado {

	public EmpleadoTemporalTiempoCompleto(String nombre, String apellido, 
			int hijos, int conyugue) throws ValidarDatos {	
		super(nombre, apellido, hijos, conyugue);
		
		validar(nombre, apellido, hijos, conyugue);
		
		  this.nombre = nombre;
		  this.apellido = apellido;
		  this.hijos = hijos;
		  this.conyugue = conyugue;
	}


	@Override
	protected String getTipoDeEmpleado() {
		
		return "Empleado/a de tiempo completo. Planta transitoria";
	}


	@Override
	public String toString() {
		return "EmpleadoTemporalTiempoCompleto [nombre=" + nombre + ", apellido=" + apellido + ", getTipoDeEmpleado()="
				+ getTipoDeEmpleado() + ", sueldo=" ;
	}


	@Override
	protected double calcularSueldo() {
		
		return sueldoBasico + hijos * 200 + conyugue * 100 ;
	}


	
	
	

}
