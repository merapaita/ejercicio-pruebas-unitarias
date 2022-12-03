import static org.junit.Assert.assertEquals;

import org.junit.Test;

import services.ServicioA;
import services.ServicioB;
import services.impl.ServicioAImpl;
import services.impl.ServicioBImpl;

public class TestServicioB {

	@Test
	public void TestMultiplicar() {
		ServicioB serviciob = new ServicioBImpl();
		assertEquals(serviciob.multiplicar(2, 3), 6);
	}
	
	@Test
	public void TestMultiplicarSumar() {
		ServicioA servicioa = new ServicioAImpl();
		ServicioB serviciob = new ServicioBImpl();
		
		serviciob.setServicioA(servicioa);
		assertEquals(serviciob.multiplicarSumar(2, 3, 2), 10);
	}
}
