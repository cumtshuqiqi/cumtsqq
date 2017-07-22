package sqq;

import org.fkit.domain.Good;
import org.junit.Test;

public class good_test {

	@Test
	public void test0() {
		Good good=new Good();
		 good.setGood_price(10);
	}

	@Test
	public void test1(){
		Good good=new Good();
		good.setGood_id(10);
		good.getGood_count();
	}
}
