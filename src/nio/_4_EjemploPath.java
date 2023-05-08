package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class _4_EjemploPath {
	public static void main(String args[]) {
		Path path = Paths.get("c:\\NUEVODIREC");//El directorio no tiene por que existir
		
		System.out.println(" path = " + path);
		System.out.println(" is absolute ? = " + path.isAbsolute());
		System.out.println(" file short name = " + path.getFileName());
		System.out.println(" parent = " + path.getParent());
		System.out.println(" uri = " + path.toUri());
		System.out.println(" ruta = " + path);
	}

}
