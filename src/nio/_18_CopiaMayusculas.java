package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

// Copia linea a linea solo las lineas que estan totalmente en mayusculas de un fichero en otro
public class _18_CopiaMayusculas {
	private static void usage() {
		System.err.println(" java CopiaMayusculas <input file > <output file >");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 2)
			usage();
		// Recibe dos rutas a copiar el primer fichero con el nombre del segundo
		Path entrada = Paths.get(args[0]);
		Path salida = Paths.get(args[1]);

		try (BufferedReader inputReader = Files.newBufferedReader(entrada, Charset.defaultCharset());
				BufferedWriter outputWriter = Files.newBufferedWriter(salida, Charset.defaultCharset(),
						StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
			String linea;
			while ((linea = inputReader.readLine()) != null) {
				if (linea.equals(linea.toUpperCase())) {
					outputWriter.write(linea, 0, linea.length());
					outputWriter.newLine();
				}
			}
		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		}
	}
}
