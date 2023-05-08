package nio;

import java.nio.file.Path;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class _3_ExistanceChecks2 {
	public static void main(String args[]) {		
		FileSystem sistemaFicheros = FileSystems.getDefault();
		Path rutaFichero = sistemaFicheros.getPath("test.txt");
		
		System.out.println(" path = " + rutaFichero);
		System.out.println(" exists = " + Files.exists(rutaFichero));
		System.out.println(" readable = " + Files.isReadable(rutaFichero));
		System.out.println(" writeable = " + Files.isWritable(rutaFichero));
		System.out.println(" executable = " + Files.isExecutable(rutaFichero));

	}
} 
