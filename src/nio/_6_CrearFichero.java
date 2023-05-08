package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _6_CrearFichero {
	public static void main(String args[]) {
		//Path emptyFile = Paths.get("/examples/emptyFile.txt"); // tiene que existir la ruta que lo contiene
		Path emptyFile = Paths.get("emptyFile.txt");
		if (Files.notExists(emptyFile)) {
		    try {
				emptyFile = Files.createFile(Paths.get("emptyFile.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
