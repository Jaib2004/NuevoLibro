package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _1_TipoFichero {
	public static void main(String args[]) {
		//Path path = Paths.get("Fich1.txt");
		Path path = Paths.get("fich1.txt");
		String tipo=null;
		
		try {
			tipo = Files.probeContentType(path);
			if (tipo == null) {
				System.err.format("'%s' tipo desconocido.%n", path);
			} else if (!tipo.equals("text/plain")) {
				System.err.format("'%s' No es un fichero de texto plano .%n", path);
			}
		} catch (IOException x) {
			System.err.println(x);
		}
		
		System.out.println("Tipo " + tipo);
	}
}
