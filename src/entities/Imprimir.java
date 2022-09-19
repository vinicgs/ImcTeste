package entities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Imprimir {

    public static String imprimir(List<Dados> lista) {
        Path path = Paths
                .get("C:\\Users\\vinic\\eclipse-workspace\\ImcTeste\\src\\resources\\viniciusCastroGomesdeSouza.txt");
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            lines.add(lista.get(i).toString());
        }
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Arquivo gerado com sucesso!";
    }

}
