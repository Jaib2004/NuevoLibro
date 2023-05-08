package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class _7_CopiaMueve {
	public static void main(String args[]) {
		// File operations
		Path fichero = Paths.get("original.txt");
		Path copia = Paths.get("originalCopia.txt");
		Path renombrado = Paths.get("originalRenombrado");
		
		try {
			Files.copy(fichero, copia, StandardCopyOption.REPLACE_EXISTING);//si ya existe lo reemplaza
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Files.move(copia, renombrado, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Files.delete(renombrado);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
