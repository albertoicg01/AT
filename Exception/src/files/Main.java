package files;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;
/*
 * Author: Alberto Cruz
 * Description: It copies from a source file to a new file
 * Date: 20220315 
 *  
 * */



public class Main {
	
	public static void main(String[] args) {
		System.out.println("------------------------------------");
		System.out.println("0..(Extra) In case you need, here is some special ASCII");
		System.out.println("values");
		specialCharacters();		
		System.out.println("------------------------------------");
		
		
		//Replace file_src with the source file you have in your local path
		File file_src = new 
				File("C:\\Users\\Alberto_intern32\\"
						+ "eclipse-workspace\\AT\\pruebas"
						+ "\\Estados.txt");
		
		File file_target = new 
				File("C:\\Users\\Alberto_intern32"
						+ "\\eclipse-workspace\\AT\\pruebas"
						+ "\\EstadosMay.txt");
		
		String line = null;
		
		//We get info from source
		try {
			
			BufferedReader buffer  = new BufferedReader(
					new InputStreamReader(new FileInputStream(file_src),"utf-8"));
						
			line =  buffer.lines().collect(Collectors.joining(System.lineSeparator()));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			System.out.println("1..We get info from source");
		}
		//We write on the target file
		System.out.println("2..Data converted below");
		try {
			
		    BufferedWriter writer = new BufferedWriter(new FileWriter(file_target, true));
		    writer.append(' ');
		    writer.append(line.toLowerCase());
		    System.out.println(line.toLowerCase());
		    
		    writer.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("3.. The process has finished");
		}
		
	}
	
	//If necessary, checkout special characters ASCII values
	 public static void specialCharacters() {

			Map<Integer,String> specialCharacters=new HashMap<Integer,String>();
			
			
			specialCharacters.put(160, "á");
			specialCharacters.put(130, "é");
			specialCharacters.put(161, "í");
			specialCharacters.put(162, "ó");
			specialCharacters.put(163, "ú");
			
			specialCharacters.put(181, "Á");
			specialCharacters.put(144, "É");
			specialCharacters.put(214, "Í");
			specialCharacters.put(224, "Ó");
			specialCharacters.put(233, "Ú");			
			
			//We'll print the map's content in a classic and imperative way ;)
			Iterator<Integer> itr=specialCharacters.keySet().iterator();
			
			System.out.println("key----value");			
			int aux=0;
			while (itr.hasNext()) {
				aux=itr.next();
				System.out.println(aux+"----"+specialCharacters.get(aux));
				
			}
			

					
				
		 }

}
