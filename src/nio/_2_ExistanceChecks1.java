package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class _2_ExistanceChecks1 {
	public static void main(String args[]) {
		Path path = Paths.get("test.txt");
		
		System.out.println(" path = " + path);
		System.out.println(" exists = " + Files.exists(path));
		System.out.println(" readable = " + Files.isReadable(path));
		System.out.println(" writeable = " + Files.isWritable(path));
		System.out.println(" executable = " + Files.isExecutable(path));

	}
} 
