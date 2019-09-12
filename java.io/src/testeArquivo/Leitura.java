package testeArquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Leitura {
	public static void main(String[] args) throws IOException {
		try {
		InputStream fis = new FileInputStream("C:\\Users\\jvgon\\Desktop\\teste2.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null){
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
		}catch(FileNotFoundException a) {
			System.out.println("Arquivo não encontrado\n");
		}
	}
}