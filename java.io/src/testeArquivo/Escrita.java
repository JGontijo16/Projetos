package testeArquivo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Escrita {
	public static void main(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream("teste3.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("There once was a hero named ragnar the Red");
		bw.newLine();
		bw.write("Who came riding to Whiterun from ole Rorikstead!");
		
		bw.close();
		
	}
}
