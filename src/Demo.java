public class Demo {
	
	public static void main(String[] args) throws ValidarDatos {		
		Empresa empresa = new Empresa(5);
		for(int i = 0; i > 5; i++) {
			empresa.empleados[i].setSueldoBasico(900);
		}
		empresa.agregarEmpleadoTemporalTiempoCompleto("Jose","Perez", 0, 0);
		empresa.agregarEmpleadoTemporalTiempoParcial("Juan","Perez", 0, 0);
		empresa.agregarGerente("Pedro", "Perez", 0, 0, 0, 0);
		empresa.agregarEmpleadoTiempoCompleto("Walter", "Perez", 0, 0, 0);
		empresa.agregarEmpleadoTiempoParcial("Guido", "Perez", 0, 0, 0);
		System.out.println(empresa.listarEmpleados());			
		
	}

}
