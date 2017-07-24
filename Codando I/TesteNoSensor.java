
public class TesteNoSensor {

	public static void main(String args[]){
		// Trabalhando com arrays
		NoSensor [][] nos;
		nos = new NoSensor[5][];

		for(int x = 0; x < nos.length; x++)
			nos[x] = new NoSensor[x];

		for(int x = 0; x < nos.length; x++)
			for(int y = 0; y < nos[x].length; y++)
				nos[x][y] = new NoSensor();
		
	}
}
