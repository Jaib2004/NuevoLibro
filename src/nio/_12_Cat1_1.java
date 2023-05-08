package nio;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.io.IOException;

//imprime el contenido de un fichero usando un array de bytes
public class _12_Cat1_1 {
	private static void uso() {
		System.err.println(" java Cat1_1 <ruta >");
		System.err.println(" Un parametro <ruta> es obligatorio");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 1)
			uso();

		Path path = Paths.get(args[0]); // Devuelve un objeto Path
		System.out.println(" Default Charset = " + Charset.defaultCharset());
		try {
			byte[] content = Files.readAllBytes(path); // No es conveniente para ficheros muy grandes
						
			for (int i = 0; i < content.length; i++)
				System.out.print((char) content[i]);//caracteres especiales no se van a interpretar bien
			//System.out.print(new String(content, StandardCharsets.ISO_8859_1));
			// Depende de la codificacion del fichero me va a poner todos los caracteres correctos o no
			//System.out.print(new String(content, StandardCharsets.UTF_8));

		} catch (IOException e) {
			System.err.println(" ERROR: " + e);
			System.exit(1);
		}
	}
}
