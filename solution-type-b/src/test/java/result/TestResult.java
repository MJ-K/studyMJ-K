package result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import problem03.Money;

public class TestResult {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void testProblem01() {
		problem01.Main.main(null);
		assertEquals("-10-20", systemOutRule.getLog().replaceAll("(\\r|\\n|\\r\\n)+", "").replaceAll("\\[|\\]|,|\\s+", ""));
	}

	@Test
	public void testProblem02_1() {
		problem02.Main.main(null);
		assertEquals("74848", systemOutRule.getLog().replaceAll("(\\r|\\n|\\r\\n)+", "").replaceAll("\\s+", ""));
	}
	
	@Test
	public void testProblem02_2() {
		assertEquals(3+4, problem02.Main.getInstance("+").calculate(3, 4));
		assertEquals(12*4, problem02.Main.getInstance("*").calculate(12, 4));
		assertEquals(8/2, problem02.Main.getInstance("/").calculate(8, 2));
		assertEquals(10-2, problem02.Main.getInstance("-").calculate(10, 2));
	}
	
	@Test
	public void testProblem03_1() {
		problem03.Main.main(null);
		assertEquals("Money Class 구현 완료", systemOutRule.getLog().replaceAll("(\\r|\\n|\\r\\n)+", ""));
		
        Money two = new Money(2);
		Money four = new Money(4);
		Money six = new Money(6);
        Money eight = new Money(8);
        if((six.equals(two.add(four)) && two.equals(four.minus(two)) && eight.equals(four.multiply(two)) && two.equals(four.devide(two))) == false){
        	fail();
        }
	}

	@Test
	public void testProblem03_2() {
        Money t1 = new Money(10);
        
        if(t1.equals(null) != false) {
        	fail();
        }
        
        Money t2 = new Money(10);
        if(t1.hashCode() != t2.hashCode()) {
        	fail();
        }
	}
}