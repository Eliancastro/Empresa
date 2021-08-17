
public abstract class Empleado {
	
	protected String nombre;
	protected String apellido;
	protected double sueldoBasico = 1000;
	protected int hijos = 0;
	protected int conyugue;
	
	public Empleado(String nombre, String apellido, int hijos,
			int conyugue) throws ValidarDatos {
		
		validar(nombre, apellido, hijos, conyugue);
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.hijos = hijos;
		this.conyugue = conyugue;
		
	}
	
   protected abstract String getTipoDeEmpleado();
   
   public String getNombre() {
	   return this.nombre;
   }
   
   public String getApellido() {
	   return this.apellido;
   }
   
   protected abstract double calcularSueldo();
   
   protected void setSueldoBasico(double sueldoBasico) {
	    this.sueldoBasico = sueldoBasico;
   }
	   
   
   
   protected void validar(String nombre, String apellido, int hijos, int conyugue) throws ValidarDatos {
	   if (nombre == null || apellido == null) {
		   throw new ValidarDatos("ingresar correctamente nombre y apellido");
	   }if(conyugue < 0 || 1 < conyugue) {
		   throw new ValidarDatos("conyugue solo puede tener 1 o 0");
	   }if(hijos < 0 ) {
		   throw new ValidarDatos("hijos debe ser mayores o iguales a 0");
	   }
	   
   }
	   
   
   

}
