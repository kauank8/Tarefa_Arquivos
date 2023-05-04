package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivos;

public class main {
	public static void main(String[] args) {
		IArquivos a = new ArquivosController();
		String path = "C:\\TEMP";
        String nome = "generic_food.csv";

        try {
            a.readFile(path, nome);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
