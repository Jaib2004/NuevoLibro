package nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _9_2_LeerFicheroTexto2 {
	public static void main(String args[]) {
		String fileName = "fich1.txt";

		FileSystem sistemaFicheros = FileSystems.getDefault();

		Path rutaFichero = sistemaFicheros.getPath(fileName);

		try {
			List<String> texto = Files.readAllLines(rutaFichero);
			for (String cadena : texto) {
				System.out.println(cadena);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
