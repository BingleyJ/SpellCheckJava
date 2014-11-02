import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class HashFun {
	String[] arr;
	int arrSize;

	public static void main(String[] args) throws IOException {
		
		HashFun fun1 = new HashFun(1);

		//load dict
		Path filePath = new File("dictionary.txt").toPath();
		Charset charset = Charset.defaultCharset();        
		List<String> stringList = Files.readAllLines(filePath, charset);
		String[] elements = stringList.toArray(new String[]{});
			
		
		//fun1.getbiggesthash(elements);
		HashFun function = new HashFun(fun1.getbiggesthash(elements) * 2);

		
		for (int i = 0; i < function.arrSize; i++){
			function.arr[i] = "000";
			//System.out.println(i + " - " + function.arr[i]);
		}
		
		
		function.hashfunction(elements, function.arr);
		
	}

	HashFun(int inSize) {
		arrSize = inSize;
		arr = new String[arrSize];
	}

	public int getbiggesthash(String[] inStrings){
		int bighash = 0;
		for (int i = 0; i < inStrings.length; i++){
			String currentelement = inStrings[i];
			int hash = 0;
			for (int j = 0; j < currentelement.length(); j++){
				hash = hash + currentelement.charAt(j);
				hash = Math.abs(hash);	
			}
			if (hash > bighash)
				bighash = hash;
		}
		System.out.println("biggest hash = " + bighash);
		return bighash;
	}
	
	public void hashfunction(String[] inStrings, String[] inArr) {

		for (int i = 0; i < inStrings.length; i++){
			String currentelement = inStrings[i];
			int hash = 0;
			for (int j = 0; j < currentelement.length(); j++){
				hash = hash + currentelement.charAt(j);
				//hash = Math.abs(hash);	
			}
			//if (inArr[hash] == "poopooooooo")
			//	System.out.println("EQUAL");
			//else 
			//	System.out.println("NOTEQUAL");

			for (int k = 0; k < inArr.length; k++){
				System.out.println(inArr[k]);
				if (inArr[hash].equals("000"))
					System.out.println("We Got ZEROS");

			}
			
	/*		while (!inArr[hash].equals("000")){
				hash++;
				System.out.println("inloop");
				if (hash >= inArr.length)
					hash = 0;
		
			}*/
			arr[hash] = currentelement;
		}
	}
	
	
	
	
	
}