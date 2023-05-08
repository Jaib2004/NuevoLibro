package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.BufferedReader;

// prints the contents of a file using a BufferedReader
public class _9_1_LeerFicheroTexto {
	private static void uso() {
		System.err.println(" java LeerFichTexto <ruta >");
		System.err.println(" Es obligatorio el parametro ruta");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 1)
			uso();
		String linea;
		Path path = Paths.get(args[0]);
		//https://stackoverflow.com/questions/5729806/encode-string-to-utf-8

		//System.setProperty("file.encoding", "ISO_8859_1"); // "ISO-8859-1"
		try (BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset())){				
			while ((linea = reader.readLine()) != null)
				System.out.println(linea);
		} catch (IOException e) {
			System.err.println(" ERROR: " + e);
			System.exit(1);
		} catch (Exception e) {
			System.err.println(" ERROR: " + e);
			System.exit(1);
		}
	}
}
