
package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;

public class _14_CopiarFichero1 {
	private static void uso() {
		System.err.println(" java CopiarFichero <ruta entrada> <ruta salida>");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 2)
			uso();
		// Desierto.jpg C:\Desert.jpg
		Path inputFile = Paths.get(args[0]);
		Path outputFile = Paths.get(args[1]);

		try {
			byte[] contents = Files.readAllBytes(inputFile);
//			Files.write(outputFile, contents, StandardOpenOption.WRITE, StandardOpenOption.CREATE,
//					StandardOpenOption.TRUNCATE_EXISTING);
			Files.write(outputFile, contents, StandardOpenOption.WRITE, StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		} catch (Exception e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		}
	}

}
