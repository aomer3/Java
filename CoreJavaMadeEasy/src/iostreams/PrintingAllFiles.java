package s.iostreams;

import java.io.File;

public class PrintingAllFiles {
	
	public static void main(String[] args) {
				
		File file = new File("."); //Or enter specific file path here 
		for(String fileNames : file.list()) 
			System.out.println(fileNames);

	}

}
