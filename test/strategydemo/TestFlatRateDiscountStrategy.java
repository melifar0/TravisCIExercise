package strategydemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFlatRateDiscountStrategy {

	@Test
	public void testFlatRateDiscount() {
		Order order = new Order("John", 200.24f);
		float discount = 10;
		FlatRateDiscountStrategy strategy = new FlatRateDiscountStrategy(discount);
		order.setStrategy(strategy);
		assertEquals(190.24, order.getDiscountedPrice(), 0.00001);
	}

}
