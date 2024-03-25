package telran.strings;

public class SymbolsRemoveCharArray implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {
		char[]array = str.toCharArray();
		char[]arrayNoSymbol = new char[array.length];
		int index = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] != symbol) {
				arrayNoSymbol[index++] = array[i];
			}
		}
		return index == array.length ? str : new String(arrayNoSymbol, 0, index);
	}

}
