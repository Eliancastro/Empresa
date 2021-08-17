import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTemporalTiempoParcialTest {

	@Test
	public void calcularSueldotest() throws ValidarDatos {
		
		EmpleadoTemporalTiempoParcial empleado = new EmpleadoTemporalTiempoParcial("jj","rr",1,1);
		empleado.setHorasTrabajadas(10);
		Assert.assertEquals(650, empleado.calcularSueldo(), 0.01);
		
	}
	
	@Test
	public void testGetTipoDeEmpleado() throws ValidarDatos {
		EmpleadoTemporalTiempoParcial empleado = new EmpleadoTemporalTiempoParcial("jj","rr",1,1);
		Assert.assertEquals("Empleado/a de tiempo parcial. Planta transitoria"
				, empleado.getTipoDeEmpleado());
	}
	
	@Test
	public void testGetNombre() throws ValidarDatos {
		EmpleadoTemporalTiempoParcial empleado = new EmpleadoTemporalTiempoParcial("Jose","rr",1,1);
		Assert.assertEquals("Jose", empleado.getNombre());
	}
	
	@Test
	public void testGetApellido() throws ValidarDatos {
		EmpleadoTemporalTiempoParcial empleado = new EmpleadoTemporalTiempoParcial("Jose","Perez",1,1);
		Assert.assertEquals("Perez", empleado.getApellido());
	}

}
