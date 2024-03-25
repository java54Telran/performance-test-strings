package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.strings.*;

class SymbolRemoveTests {

	@Test
	void removeSymbolStandardTest() {
		removeSymbolTest(new SymbolsRemoveStandard());
	}
	@Test
	void removeSymbolCharArrayTest() {
		removeSymbolTest(new SymbolsRemoveCharArray());
	}

	private void removeSymbolTest(SymbolsRemove symbolsRemove) {
		String str = "Hello* World*";
		String expectedNoL = "Heo* Word*";
		String expectedNoT = str;
		String expectedNoH = "ello* World*";
		String expectedNoAstr = "Hello World";
		assertEquals(expectedNoL, symbolsRemove.removeSymbol(str, 'l'));
		assertEquals(expectedNoT, symbolsRemove.removeSymbol(str, 't'));
		assertEquals(expectedNoH, symbolsRemove.removeSymbol(str, 'H'));
		assertEquals(expectedNoAstr, symbolsRemove.removeSymbol(str, '*'));
		assertEquals("", symbolsRemove.removeSymbol("[[[[[[[[[[[[[[[[",'['));
		
		
	}

}
