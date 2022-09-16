package rcb;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class TeamRcb 
       {


	
	  public static void main (String[] args) throws IOException, ParseException {
		
	
//Read JSON FILE & Parse JSON Data
		  
		JSONParser jsonparser=new JSONParser();
		JSONObject jsonobject=(JSONObject) jsonparser.parse(new FileReader(".//jsonfile/jsoncode.json"));

		String name=(String) jsonobject.get("name");

		String location=(String) jsonobject.get("location");

		
//Fetched JSON Array Size
		
		
		JSONArray array=(JSONArray)jsonobject.get("player");
		

		for(int i=0;i<array.size();i++) 
		{
		
		JSONObject player=(JSONObject) array.get(i);
	
		String playername=(String) player.get("name");
		String country=(String) player.get("country");
		String role=(String) player.get("role");
		String price=(String) player.get("price");
		
		//Fetched 4 Foreign Player & one wicket keeper
		
	 if(!country.equals("India") || role.equals("Wicket-keeper") ) {
		 

			
			System.out.println("playername: "+playername);
			//System.out.println("role "+role);
		 
		
			
		}
	
		}

		
	  }
       }
	

         
