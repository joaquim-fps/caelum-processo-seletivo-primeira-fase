package exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EncontreOTelefone {
	public static void main (String[] args) {
		BufferedReader bufferedReader = null;
		
		try {			
			//INFORMAR CAMINHO DO ARQUIVO COMO ARGUMENTO DA MAIN
			bufferedReader = new BufferedReader(new FileReader(args[0]));
			
			String linha = "";
			while ((linha = bufferedReader.readLine()) != null) {
				System.out.println(
					linha.replaceAll("[ABC]", "2")
						 .replaceAll("[DEF]", "3")
						 .replaceAll("[GHI]", "4")
						 .replaceAll("[JKL]", "5")
						 .replaceAll("[MNO]", "6")
						 .replaceAll("[PQRS]", "7")
						 .replaceAll("[TUV]", "8")
						 .replaceAll("[WXYZ]", "9")
				);
			} //FIM while
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {				
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} //FIM finally
	} //FIM main
} //FIM EncontreOTelefone