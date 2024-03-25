package telran.performance.strings;

import java.util.Random;

import telran.performance.PerformanceTest;
import telran.strings.*;

public class SymbolsRemovePerformanceAppl {

	private static final int N_RUNS = 100000;
	private static final int N_SYMBOLS = 10000;

	public static void main(String[] args) {
		String str = getRandomPrintableAsciiString();
		char symbol = getRandomPrintableAsciiSymbol();
		PerformanceTest removeCharArrayTest = 
				getTest("test of removing by SymbolsRemoveCharArray",
						new SymbolsRemoveCharArray(), str, symbol);
		PerformanceTest removeStandard = 
				getTest("test of removing by SymbolsRemoveStandard",
						new SymbolsRemoveStandard(),str, symbol);
		removeCharArrayTest.run();
		removeStandard.run();

	}

	private static PerformanceTest getTest(String displayName, SymbolsRemove symbolsRemove, String str,
			char symbol) {
		
		return new SymbolsRemovePerformanceTest(displayName, N_RUNS, str, symbolsRemove, symbol);
	}

	private static char getRandomPrintableAsciiSymbol() {
		// Define the range of printable ASCII characters
        int min = 32; // ASCII code for space character
        int max = 126; // ASCII code for '~' character
        // Generate a random number within the range
        Random random = new Random();
        int randomNum = random.nextInt(max - min + 1) + min;
        // Convert the random number to its corresponding character
        char randomChar = (char) randomNum;
        return randomChar;
        
	}

	private static String getRandomPrintableAsciiString() {
		char[] arrStr = new char[N_SYMBOLS];
		for(int i = 0; i < arrStr.length; i++) {
			arrStr[i] = getRandomPrintableAsciiSymbol();
		}
		return new String(arrStr);
	}

}
