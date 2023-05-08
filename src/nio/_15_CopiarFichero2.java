package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

//Este ejemplo es valido para ficheros de texto

public class _15_CopiarFichero2 {
	private static void usage() {
		System.err.println(" java CopiarFichero2 <input file > <output file >");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 2)
			usage();

		Path input = Paths.get(args[0]);
		Path output = Paths.get(args[1]);

		try (
			BufferedReader inputReader = Files.newBufferedReader(input,
					Charset.defaultCharset());
			BufferedWriter outputWriter = Files.newBufferedWriter(output,
					Charset.defaultCharset(), StandardOpenOption.WRITE,
					StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING)) {

			String linea; 
			while ((linea = inputReader.readLine()) != null) {
				outputWriter.write(linea, 0, linea.length()); // toda la linea
				outputWriter.newLine();
			}
		} catch (IOException e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		} catch (Exception e) {
			System.err.println(" ERROR : " + e);
			System.exit(1);
		}
	}
}
