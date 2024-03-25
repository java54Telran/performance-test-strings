package telran.strings;

public class SymbolsRemoveStandard implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {
		
		return str.replace(Character.toString(symbol), "");
		
		
	}

}
