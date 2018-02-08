package be.vdab.valueobjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class VeilingTest {

	@Test
	public void hetHoogsteBodVanEenNieuweVeilingIsNul() {
		Veiling veiling = new Veiling();
		assertEquals(0, veiling.getHoogsteBod());
	}
	@Test
	public void naEersteBodIsHetHoogsteBodGelijkAanHetBedragVanDitBod() {
		Veiling veiling = new Veiling();
		veiling.doeBod(100);
		assertEquals(100, veiling.getHoogsteBod());
	}
	@Test
	public void hetHoogsteBodNaEerst100Dan200Dan150Is200() {
		Veiling veiling = new Veiling();
		veiling.doeBod(100);
		veiling.doeBod(200);
		veiling.doeBod(150);
		assertEquals(200, veiling.getHoogsteBod());
	}

}
