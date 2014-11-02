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
	long arrSize;
	//int itemsinarr = 0;

	public static void main(String[] args) throws IOException {
		
		HashFun fun1 = new HashFun(1);

		//load dict
		Path filePath = new File("dictionary.txt").toPath();
		Charset charset = Charset.defaultCharset();        
		List<String> stringList = Files.readAllLines(filePath, charset);
		String[] elements = stringList.toArray(new String[]{});
			
		
		fun1.getbiggesthash(elements);
		HashFun function = new HashFun(fun1.getbiggesthash(elements));

		
		//for (int i = 0; i < elements.length; i++){
		//	System.out.println(elements[i]);
	//	}
		
		
		//function.hashfunction(elements, function.arr);
		
	}

	HashFun(int inSize) {
		arrSize = inSize;
		arr = new String[(int) arrSize];
		//Arrays.fill(arr, "");

	}

	public int getbiggesthash(String[] inStrings){
		int bighash = 0;
		for (int i = 0; i < inStrings.length; i++){
			String currentelement = inStrings[i];
			int hash = 3;
			for (int j = 0; j < currentelement.length(); j++){
				hash = hash * 31 + currentelement.charAt(j);
				hash = Math.abs(hash);	
			}
			if (hash > bighash)
				bighash = hash;
		}
		System.out.println("biggest hash = " + bighash);
		return bighash;
	}
	
	public void hashfunction(String[] inStrings, String[] inArr) {
		int bighash = 0;
		for (int i = 0; i < inStrings.length; i++){
			String currentelement = inStrings[i];
			int hash = 3;
			for (int j = 0; j < currentelement.length(); j++){
				hash = hash * 31 + currentelement.charAt(j);
				hash = Math.abs(hash);	
			}
			if (hash > bighash)
				bighash = hash;
			System.out.println(hash);
		}
		System.out.println("biggest hash = " + bighash);

	}
	
	
	
	
	
}