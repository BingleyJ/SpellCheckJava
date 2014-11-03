import java.io.File;
import java.io.IOException;
//import java.io.ObjectInputStream.GetField;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.util.Arrays;
import java.util.List;

public class HashFun {
	String[] arr;
	int arrSize;

	public static void main(String[] args) throws IOException {

		HashFun fun1 = new HashFun(1);

		Path filePath = new File("dictionary.txt").toPath();
		Charset charset = Charset.defaultCharset();
		List<String> stringList = Files.readAllLines(filePath, charset);
		String[] elements = stringList.toArray(new String[] {});

		// fun1.getbiggesthash(elements);
		HashFun function = new HashFun(fun1.getbiggesthash(elements) * 2);

		for (int i = 0; i < function.arrSize; i++) {
			function.arr[i] = null;
			// System.out.println(i + " - " + function.arr[i]);
		}
		function.arr = function.hashfunction(elements, function.arr);

	}

	HashFun(int inSize) {
		arrSize = inSize;
		arr = new String[arrSize];
	}

	public int getbiggesthash(String[] inStrings) {
		int bighash = 0;
		for (int i = 0; i < inStrings.length; i++) {
			String currentelement = inStrings[i];
			int hash = 0;
			for (int j = 0; j < currentelement.length(); j++) {
				hash = hash + currentelement.charAt(j);
				hash = Math.abs(hash);
			}
			if (hash > bighash)
				bighash = hash;
		}
		System.out.println("biggest hash = " + bighash);
		return bighash;
	}

	
	public boolean exists(String[] inSring, int inKey){
		ifExists = false;
		
		
		
		
		return ifExists;
		
	}
	
	
	
	public String[] hashfunction(String[] inStrings, String[] inArr) {

		for (int i = 0; i < inStrings.length; i++) {
			String currentelement = inStrings[i];
			System.out.println("Array[" + i + "]=[" + inStrings[i] + "]");
			
			int hash = 0;
			for (int j = 0; j < currentelement.length(); j++) {
				hash = hash + currentelement.charAt(j);
			}
			arr[hash] = currentelement;
		}
		return arr;
	}

}