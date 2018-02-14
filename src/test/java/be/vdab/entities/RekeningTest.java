package be.vdab.entities;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
public class RekeningTest {
	// Declareert een private variabele per test fixture
	private Rekening rekening;
	/*
	 * Initialiseert de variabele in een @Before method.
	 * JUnit voert voor elke @Test method de @Before method uit.
	 * Je kan nu in @Test methods deze private variabele rekening gebruiken. 
	 * JUnit initialiseert deze variabele bij elke oproep vd @Before method met een Rekening object.
	 */
	@Before
	public void before() {
		rekening = new Rekening();
	}
	@Test
	public void hetSaldoVanEenNieuweRekeningIsNul() {
		assertEquals(0, BigDecimal.ZERO.compareTo(rekening.getSaldo()));
	}
	@Test
	public void hetSaldoNaEenSortingIsHetBedragVanDieStorting() {
		BigDecimal bedrag = BigDecimal.valueOf(2.5);
		rekening.storten(bedrag);
		assertEquals(0, bedrag.compareTo(rekening.getSaldo()));
	}
	@Test
	public void hetSaldoNaTweeStortingenIsDeSomVanDeBedragenVanDieStortingen() {
		rekening.storten(BigDecimal.valueOf(2.5));
		rekening.storten(BigDecimal.valueOf(1.2));
		assertEquals(0,BigDecimal.valueOf(3.7).compareTo(rekening.getSaldo()));
	}
}
