package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Dados;
import entities.Imprimir;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\vinic\\eclipse-workspace\\ImcTeste\\src\\resources\\dataset.CSV";

		List<Dados> lista = new ArrayList<Dados>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while ((line = br.readLine()) != null) {
				if (line.split(";").length == 4) {

					String[] vetor = line.split(";");

					Dados dados = new Dados();

					dados.setNome(vetor[0], vetor[1]);
					dados.setImc(vetor[2], vetor[3]);

					lista.add(dados);
				}else if(line.split(";").length == 2) {
					String[] vetor = line.split(";");
					
					Dados dados = new Dados();
					
					dados.setNome(vetor[0], vetor[1]);
					dados.setImc("0", "0");
					
					lista.add(dados);
				}

			}

			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}

			Imprimir.imprimir(lista);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
