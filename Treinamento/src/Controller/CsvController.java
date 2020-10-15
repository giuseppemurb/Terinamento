package Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class CsvController {
	
	
	
	/*Retorna um objeto classe List do tipo Strig[] das informações contidas
	 * no arquivo csv alvo. Método possui parâmetro de String com o caminho
	 * do arquivo Ex.: "C:/csv/nome.csv"
	 */
	public List<String[]> retornarCsv(String caminhoArquivo){
		List<String[]> retornoCsv = new ArrayList<String[]>();
		
		CSVReader reader;
		try {
			FileInputStream fis = new FileInputStream(caminhoArquivo);
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
			reader = new CSVReader(isr, ';');
			retornoCsv = reader.readAll();
			retornoCsv.remove(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return retornoCsv;
		
	}
	
}
