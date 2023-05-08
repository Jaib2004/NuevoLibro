package nio;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;
import java.io.IOException;

// Por defecto, Files.readAllLines() usa codificacion UTF-8.
// Pero se puede usar otra codificacion:
// List<String> lines = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_16);

public class _13_Cat2 {
	private static void uso() {
		System.err.println(" java Cat2 <ruta >");
		System.err.println(" Un parametro <ruta> es obligatorio");
		System.exit(1);
	}

	public static void main(String args[]) {
		if (args.length != 1)
			uso();

		Path path = Paths.get(args[0]);
		try {
			// lee todas las lineas en una lista de cadenas
		    List<String> lines = Files.readAllLines(path);
		    
		    // print all lines
		    for (String line : lines) {
		        System.out.println(line);
		    }
		} catch (IOException e) {
			System.err.println(" ERROR: " + e);
			System.exit(1);
		}
		
	}
}
