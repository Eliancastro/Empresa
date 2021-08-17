
public class Gerente extends Empleado {
	protected int empleadosACargo;
    protected int antiguedad;
    
	public Gerente(String nombre, String apellido,int hijos, int conyugue, int antiguedad, int empleadosACargo ) throws ValidarDatos {
		super(nombre, apellido, hijos, conyugue);
		
		validar(nombre, apellido, hijos, conyugue);
		  if(empleadosACargo < 0 || antiguedad < 0) {
			  throw new ValidarDatos("la cantidad de personal a cargo y la antiguedad deben ser 0 o mayor");
		  }
		  
			  this.empleadosACargo = empleadosACargo;
		      this.nombre = nombre;
		      this.apellido = apellido;
		      this.hijos = hijos;
		      this.conyugue = conyugue;
		      this.antiguedad = antiguedad;
	}

	@Override
	protected String getTipoDeEmpleado() {
		
		return "Gerente. Planta permanente";
	}

	@Override
	public String toString() {
		return "Gerente [nombre=" + nombre + ", apellido=" + apellido + ", getTipoDeEmpleado()=" + getTipoDeEmpleado()
				+ ", sueldo=" ;
	}

	@Override
	protected double calcularSueldo() {
	
		if(antiguedad * 100 >= 2000) {
			return  (sueldoBasico + hijos * 200 + conyugue * 100 + 
					2000 + empleadosACargo * 2000);
		}
		
		return (sueldoBasico + (hijos *200) + (conyugue * 100) + (antiguedad * 100) + (empleadosACargo * 2000)) ;
	}
	
	

}
