package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
// Si existe lo borro, si no existe lo creo

public class _5_CreateOrDelete {
	private static void uso() {
		System.err.println(" java CreateOrDelete <ruta >");
		System.err.println(" EL parametro ruta es obligatorio .");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 1)
			uso();

		Path path = Paths.get(args[0]);
		try {
			if (Files.exists(path)) {
				Files.delete(path);
				System.out.println(" Borrado.");
			}
			else {
				Files.createFile(path); // Esto crea un fichero
				System.out.println(" Creado.");
			}

		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
 
}
