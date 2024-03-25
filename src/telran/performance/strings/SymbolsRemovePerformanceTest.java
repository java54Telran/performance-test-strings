package telran.performance.strings;

import telran.performance.PerformanceTest;
import telran.strings.SymbolsRemove;

public class SymbolsRemovePerformanceTest extends PerformanceTest {
	String str;
	SymbolsRemove symbolsRemove;
	char symbol;
	public SymbolsRemovePerformanceTest(String displayName, int nRuns,
			String str, SymbolsRemove symbolsRemove, char symbol) {
		super(displayName, nRuns);
		this.str = str;
		this.symbolsRemove = symbolsRemove;
		this.symbol = symbol;
	}

	@Override
	protected void runTest() {
		symbolsRemove.removeSymbol(str, symbol);

	}

}
