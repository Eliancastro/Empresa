import org.junit.Assert;
import org.junit.Test;

public class GerenteTest {

	@Test
	public void calcularSueldotest() throws ValidarDatos {
		Gerente empleado = new Gerente("Pedro", "Perez", 0, 0, 0, 1);
		Assert.assertEquals(3000, empleado.calcularSueldo(), 0.01);
	}
	
	@Test
	public void testGetTipoDeEmpleado() throws ValidarDatos {
		Gerente empleado = new Gerente("jj","rr",1,1,2,2);
		Assert.assertEquals("Gerente. Planta permanente"
				, empleado.getTipoDeEmpleado());
	}
	
	@Test
	public void testGetNombre() throws ValidarDatos {
		Gerente empleado = new Gerente("Jose","rr",1,1,2,2);
		Assert.assertEquals("Jose", empleado.getNombre());
	}
	
	@Test
	public void testGetApellido() throws ValidarDatos {
		Gerente empleado = new Gerente("Jose","Perez",1,1,2,2);
		Assert.assertEquals("Perez", empleado.getApellido());
	}

}

