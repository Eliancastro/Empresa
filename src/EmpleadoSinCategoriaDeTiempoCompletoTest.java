import org.junit.Assert;
import org.junit.Test;

public class EmpleadoSinCategoriaDeTiempoCompletoTest {

	@Test
	public void calcularSueldotest() throws ValidarDatos {
		EmpleadoSinCategoriaDeTiempoCompleto empleado = new EmpleadoSinCategoriaDeTiempoCompleto("Walter", "Perez", 3, 1, 5);
		Assert.assertEquals(2200, empleado.calcularSueldo(), 0.01);
		
	}
	
	@Test
	public void testGetTipoDeEmpleado() throws ValidarDatos {
		EmpleadoSinCategoriaDeTiempoCompleto empleado = new EmpleadoSinCategoriaDeTiempoCompleto("jj","rr",1,1,22);
		Assert.assertEquals("Empleado/a de tiempo completo. Planta permanente"
				, empleado.getTipoDeEmpleado());
	}
	
	@Test
	public void testGetNombre() throws ValidarDatos {
		EmpleadoSinCategoriaDeTiempoCompleto empleado = new EmpleadoSinCategoriaDeTiempoCompleto("Jose","rr",1,1,22);
		Assert.assertEquals("Jose", empleado.getNombre());
	}
	
	@Test
	public void testGetApellido() throws ValidarDatos {
		EmpleadoSinCategoriaDeTiempoCompleto empleado = new EmpleadoSinCategoriaDeTiempoCompleto("Jose","Perez",1,1,22);
		Assert.assertEquals("Perez", empleado.getApellido());
	}

}
