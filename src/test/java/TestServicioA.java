import org.junit.Assert;
import org.junit.Test;

import services.ServicioA;
import services.impl.ServicioAImpl;

public class TestServicioA {

	@Test
	public void TestSumar() {
		int a = 2;
		int b = 2;
		
		ServicioA servicioa = new ServicioAImpl();
		Assert.assertEquals(servicioa.sumar(a, b), 4);
				
	}
}
