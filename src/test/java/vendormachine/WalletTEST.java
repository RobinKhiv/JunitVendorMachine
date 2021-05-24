package vendormachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import vendormachine.users.util.Wallet;

public class WalletTEST {
	
	/** 
	 * Task 1:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.users.util.Wallet'
	 * 
	 * 		Goal: 80% code/line coverage
	 * */
	@Test
	public void test1() {
		Wallet w = new Wallet(299f);
		Wallet w1 = new Wallet("Gucci", 299f);
		Wallet w3 = new Wallet();
		float expected = 399f;
		String expectedBrand = "Gucci";
		float overDraft = 1000f;
		float underDraft = 100f;
		float retrieve = 0f;
		
		w.addCredit(100f);
		w1.setCredit(expected);
		
		assertEquals(expected, w.getAllCredit());
		assertEquals(expected, w1.getAllCredit());
		assertEquals(expectedBrand, w1.getBrand(expectedBrand));
		
		w.setBrand(expectedBrand);
		assertEquals(expectedBrand, w.getBrand(expectedBrand));
		retrieve = w.getCredit(overDraft);
		
		assertEquals(0, retrieve);
		
		retrieve = w.getCredit(underDraft);
		assertEquals(retrieve, retrieve);
		
	}
	
	// Hint: 
	// Others Tests for other classes that use Wallet may impact code coverage
	// Avoid relying on these tests, one test for one class; keep "Single Responsibility" in mind.
	
}
