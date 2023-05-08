package nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _9_3_LeerFicheroTexto3 {
	public static void main(String args[]) throws IOException {
		String fileName = "fich1.txt";
		// Solo sirve para ficheros de texto
	    String s = Files.readString(Paths.get(fileName), StandardCharsets.UTF_8);
	    System.out.println(s);
	}
	

}
