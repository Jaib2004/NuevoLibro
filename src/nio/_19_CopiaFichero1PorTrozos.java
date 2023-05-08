package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.nio.file.StandardOpenOption;

// Copiamos un fichero usando buffer binario
public class _19_CopiaFichero1PorTrozos {
	private static void usage() {
		System.err.println(" java CopiaBinario <input file> <output file> <buffer size>");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 3)
			usage();

		Path inputPath = Paths.get(args[0]);
		Path outputPath = Paths.get(args[1]);

		try (BufferedInputStream input = new BufferedInputStream(
				Files.newInputStream(inputPath, StandardOpenOption.READ));
				BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(outputPath,
				StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING))) {
			int bufferSize = Integer.parseInt(args[2]); //tamanio de los bloques
			if (bufferSize <= 0)
				throw new NumberFormatException(args[2] + " no es positivo ");
			else {
				byte[] buffer = new byte[bufferSize];

				int bytesRead = input.read(buffer, 0, bufferSize);
				while (bytesRead >= 0) {
					output.write(buffer, 0, bytesRead);
					bytesRead = input.read(buffer, 0, bufferSize);
				}	
			}			

		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		} catch (NumberFormatException e) {
			System.err.println(" ERROR : en formato numerico : " + e);
			System.exit(1);
		}
	}
}
