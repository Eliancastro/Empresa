
public class Empresa {
	
	private int cantidadDeEmpleados;
	
	protected Empleado[] empleados ;
	
	/*Se debe ingresar la cantidad de empleados que tendra la empresa*/
	
	public Empresa (int cantidadDeEmpleados) {
		if(cantidadDeEmpleados <= 0 ) {
			throw new Error("No se puede crear una Empresa sin empleados");
		}
		empleados = new Empleado[cantidadDeEmpleados];
	}
	
	public void agregarEmpleadoTemporalTiempoCompleto(String nombre, String apellido,int hijos, int conyugue ) throws ValidarDatos {
		Empleado empleadoTemporario = new EmpleadoTemporalTiempoCompleto(nombre, apellido, hijos, conyugue);
		empleados[cantidadDeEmpleados] = empleadoTemporario;
		cantidadDeEmpleados++;
	}
	public void agregarEmpleadoTemporalTiempoParcial(String nombre, String apellido,int hijos, int conyugue ) throws ValidarDatos {
		Empleado empleadoTemporario = new EmpleadoTemporalTiempoParcial(nombre, apellido, hijos, conyugue);
		empleados[cantidadDeEmpleados] = empleadoTemporario;
		cantidadDeEmpleados++;
	}
	
    public void agregarGerente(String nombre, String apellido,int hijos, int conyugue, int antiguedad, int empleadosACargo) throws ValidarDatos {
    	Empleado Gerente = new Gerente(nombre, apellido, hijos, conyugue, antiguedad, empleadosACargo);
		empleados[cantidadDeEmpleados] = Gerente;
		cantidadDeEmpleados++;
	}
    
    public void agregarEmpleadoTiempoCompleto(String nombre, String apellido,int hijos, int conyugue, int antiguedad ) throws ValidarDatos {
		Empleado empleadoTiempoCompleto = new EmpleadoSinCategoriaDeTiempoCompleto(nombre, apellido, hijos, conyugue, antiguedad);
		empleados[cantidadDeEmpleados] = empleadoTiempoCompleto;
		cantidadDeEmpleados++;
	}
    
    public void agregarEmpleadoTiempoParcial(String nombre, String apellido,int hijos, int conyugue, int antiguedad ) throws ValidarDatos {
		Empleado empleadoTiempoParcial = new EmpleadoSinCategoriaDeTiempoParcial(nombre, apellido, hijos, conyugue, antiguedad);
		empleados[cantidadDeEmpleados] = empleadoTiempoParcial;
		cantidadDeEmpleados++;
	}
    
   public String listarEmpleados() {
	   String liistaEmpleados="";
	   for(int i = 0; i < cantidadDeEmpleados; i++) {
		   liistaEmpleados+= empleados[i].toString() + liquidarSueldoEmpleado(empleados[i]) +"\n" ;
	   }
	   return liistaEmpleados;
	
   }
   
   private double liquidarSueldoEmpleado(Empleado empleado) {
	return empleado.calcularSueldo();
	   
   }

}
