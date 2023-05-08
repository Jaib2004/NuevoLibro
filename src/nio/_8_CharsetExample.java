package nio;

import java.nio.charset.Charset;

public class _8_CharsetExample {
	public static void main(String args[]) {

		System.out.println(" Conjunto de caracteres por defecto = " + Charset.defaultCharset());

		// lo cambiamos
		//System.setProperty(" file.encoding" , "ISO -8859 -1");
		System.setProperty("file.encoding" , "UTF-8");
		System.out.println(" file.encoding = " + System.getProperty("file.encoding"));

		// Example of directly using charset objects
		Charset ascii = Charset.forName("US-ASCII");
		System.out.println(" En sistemas antiguos este es el conjunto de caracteres = " + ascii);
		System.out.println(" file.encoding = " + System.getProperty("file.encoding"));
	}
}
