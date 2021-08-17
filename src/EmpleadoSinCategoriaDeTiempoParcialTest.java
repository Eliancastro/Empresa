import org.junit.Assert;
import org.junit.Test;

public class EmpleadoSinCategoriaDeTiempoParcialTest {

	@Test
	public void calcularSueldotest() throws ValidarDatos {
		EmpleadoSinCategoriaDeTiempoParcial empleado = new EmpleadoSinCategoriaDeTiempoParcial("jj","rr",1,1,22);
		empleado.setHorasTrabajadas(10);
		Assert.assertEquals(2650, empleado.calcularSueldo(), 0.01);
	}
	
	@Test
	public void testGetTipoDeEmpleado() throws ValidarDatos {
		EmpleadoSinCategoriaDeTiempoParcial empleado = new EmpleadoSinCategoriaDeTiempoParcial("jj","rr",1,1,22);
		Assert.assertEquals("Empleado/a de tiempo parcial. Planta permanente"
				, empleado.getTipoDeEmpleado());
	}
	
	@Test
	public void testGetNombre() throws ValidarDatos {
		EmpleadoSinCategoriaDeTiempoParcial empleado = new EmpleadoSinCategoriaDeTiempoParcial("Jose","rr",1,1,22);
		Assert.assertEquals("Jose", empleado.getNombre());
	}
	
	@Test
	public void testGetApellido() throws ValidarDatos {
		EmpleadoSinCategoriaDeTiempoParcial empleado = new EmpleadoSinCategoriaDeTiempoParcial("Jose","Perez",1,1,22);
		Assert.assertEquals("Perez", empleado.getApellido());
	}

}
