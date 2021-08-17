import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTemporalTiempoCompletoTest {

	@Test
	public void calcularSueldotest() throws ValidarDatos{
		EmpleadoTemporalTiempoCompleto empleado = new EmpleadoTemporalTiempoCompleto("Jose","Perez", 2, 1);
		Assert.assertEquals(1500, empleado.calcularSueldo(), 0.01);
	}
	
	@Test
	public void testGetTipoDeEmpleado() throws ValidarDatos {
		EmpleadoTemporalTiempoCompleto empleado = new EmpleadoTemporalTiempoCompleto("jj","rr",1,1);
		Assert.assertEquals("Empleado/a de tiempo completo. Planta transitoria"
				, empleado.getTipoDeEmpleado());
	}
	
	@Test
	public void testGetNombre() throws ValidarDatos {
		EmpleadoTemporalTiempoCompleto empleado = new EmpleadoTemporalTiempoCompleto("Jose","rr",1,1);
		Assert.assertEquals("Jose", empleado.getNombre());
	}
	
	@Test
	public void testGetApellido() throws ValidarDatos {
		EmpleadoTemporalTiempoCompleto empleado = new EmpleadoTemporalTiempoCompleto("Jose","Perez",1,1);
		Assert.assertEquals("Perez", empleado.getApellido());
	}

}
