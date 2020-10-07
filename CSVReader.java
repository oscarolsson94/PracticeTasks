import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		
		String path = ""; //insert path to your .txt document
		String line = "";
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) !=null) {
				
				String[] values = line.split(",");
				System.out.println(values[0] + values[5]); //printing first and fourth column in each row
				
			}			
						
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
