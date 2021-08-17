import org.junit.Assert;
import org.junit.Test;

public class EmpresaTest {

	
	@Test
	public void testGetNombre() throws ValidarDatos {
		Empresa empresa = new Empresa(5);
		empresa.agregarEmpleadoTemporalTiempoCompleto("Jose","Perez", 0, 0);
		Assert.assertEquals("Jose", empresa.empleados[0].getNombre());	
		Assert.assertEquals(1000, empresa.empleados[0].calcularSueldo(), 0.01);
		
	}
	
	@Test
	public void testGetApellido() throws ValidarDatos {
		Empresa empresa = new Empresa(5);
		empresa.agregarEmpleadoTemporalTiempoCompleto("Jose","Perez", 0, 0);
		empresa.agregarEmpleadoTemporalTiempoParcial("Juan","Perez", 0, 0);
		empresa.agregarGerente("Pedro", "Perez", 0, 0, 0, 0);
		empresa.agregarEmpleadoTiempoCompleto("Walter", "Perez", 0, 0, 0);
		empresa.agregarEmpleadoTiempoParcial("Guido", "Perez", 0, 0, 0);
		for(int i = 0 ; i < 5; i++) {
			Assert.assertEquals("Perez", empresa.empleados[i].getApellido());
		}
		
	}
	
	@Test
	public void testGetNombres() throws ValidarDatos {
		Empresa empresa = new Empresa(5);
		empresa.agregarEmpleadoTemporalTiempoCompleto("Jose","Perez", 0, 0);
		empresa.agregarEmpleadoTemporalTiempoParcial("Juan","Perez", 0, 0);
		empresa.agregarGerente("Pedro", "Perez", 0, 0, 0, 0);
		empresa.agregarEmpleadoTiempoCompleto("Walter", "Perez", 0, 0, 0);
		empresa.agregarEmpleadoTiempoParcial("Guido", "Perez", 0, 0, 0);
		Assert.assertEquals("Jose", empresa.empleados[0].getNombre());
		Assert.assertEquals("Juan", empresa.empleados[1].getNombre());
		Assert.assertEquals("Pedro", empresa.empleados[2].getNombre());
		Assert.assertEquals("Walter", empresa.empleados[3].getNombre());
		Assert.assertEquals("Guido", empresa.empleados[4].getNombre());
	}
	
	@Test
	public void testGetTipoDeEmpleado() throws ValidarDatos {
		Empresa empresa = new Empresa(5);
		empresa.agregarEmpleadoTemporalTiempoCompleto("Jose","Perez", 2, 1);
		empresa.agregarEmpleadoTemporalTiempoParcial("Juan","Perez", 1, 1);
		empresa.agregarGerente("Pedro", "Perez", 0, 0, 0, 1);
		empresa.agregarEmpleadoTiempoCompleto("Walter", "Perez", 3, 1, 5);
		empresa.agregarEmpleadoTiempoParcial("Guido", "Perez", 1, 1, 22);
		Assert.assertEquals("Empleado/a de tiempo completo. Planta transitoria"
				, empresa.empleados[0].getTipoDeEmpleado());
		Assert.assertEquals("Empleado/a de tiempo parcial. Planta transitoria"
				, empresa.empleados[1].getTipoDeEmpleado());
		Assert.assertEquals("Gerente. Planta permanente", empresa.empleados[2].getTipoDeEmpleado());
		Assert.assertEquals("Empleado/a de tiempo completo. Planta permanente"
				, empresa.empleados[3].getTipoDeEmpleado());
		Assert.assertEquals("Empleado/a de tiempo parcial. Planta permanente"
				, empresa.empleados[4].getTipoDeEmpleado());
		

	}
		@Test
		public void testGetSueldo() throws ValidarDatos {
			
			Empresa empresa = new Empresa(5);
			empresa.agregarEmpleadoTemporalTiempoCompleto("Jose","Perez", 2, 1);
			empresa.agregarEmpleadoTemporalTiempoParcial("Juan","Perez", 1, 1);
			empresa.agregarGerente("Pedro", "Perez", 0, 0, 0, 1);
			empresa.agregarEmpleadoTiempoCompleto("Walter", "Perez", 3, 1, 5);
			empresa.agregarEmpleadoTiempoParcial("Guido", "Perez", 1, 1, 22);
			((EmpleadoTemporalTiempoParcial) empresa.empleados[1]).setHorasTrabajadas(10);
			Assert.assertEquals(3000, empresa.empleados[2].calcularSueldo(), 0.01);
			Assert.assertEquals(1500, empresa.empleados[0].calcularSueldo(), 0.01);
			Assert.assertEquals(650, empresa.empleados[1].calcularSueldo(), 0.01);
			Assert.assertEquals(2200, empresa.empleados[3].calcularSueldo(), 0.01);
			Assert.assertEquals(2550, empresa.empleados[4].calcularSueldo(), 0.01);
			
		}


	
}
