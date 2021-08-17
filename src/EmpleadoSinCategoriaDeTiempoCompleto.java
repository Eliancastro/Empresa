
public class EmpleadoSinCategoriaDeTiempoCompleto extends Empleado {
	
	protected int antiguedad;
     
	public EmpleadoSinCategoriaDeTiempoCompleto(String nombre, String apellido,int hijos, int conyugue, int antiguedad ) throws ValidarDatos {
		super(nombre, apellido, hijos, conyugue);
		
		validar(nombre, apellido, hijos, conyugue);
		if(antiguedad < 0) {
			throw new ValidarDatos("La antiguedad debe ser 0 o mayor");
		}
		  this.nombre = nombre;
		  this.apellido = apellido;
		  this.hijos = hijos;
		  this.conyugue = conyugue;
		  this.antiguedad = antiguedad;	}



	@Override
	protected String getTipoDeEmpleado() {
		
		return "Empleado/a de tiempo completo. Planta permanente";
	}



	@Override
	public String toString() {
		return "EmpleadoSinCategoriaDeTiempoCompleto [nombre=" + nombre + ", apellido=" + apellido
				+ ", getTipoDeEmpleado()=" + getTipoDeEmpleado() + ", sueldo=" ;
	}



	@Override
	protected double calcularSueldo() {
		if(antiguedad * 100 >= 2000) {
			return sueldoBasico + hijos * 200 + conyugue * 100 + 
					2000;
		}
		return sueldoBasico + hijos * 200 + conyugue * 100 + 
				antiguedad * 100 ;
	}
	
	

}
