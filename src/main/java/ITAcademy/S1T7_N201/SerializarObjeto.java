package ITAcademy.S1T7_N201;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

/**
 * Crea una anotació personalitzada que ha de permetre serialitzar un objecte
 * Java en un fitxer JSON. L’anotació ha de rebre el directori on es col·locarà
 * el fitxer resultant.
 *
 */

@Anotacion
public class SerializarObjeto {

	public static void JSONConverter(Object object, String filePath) throws IOException {

		// convertir objeto a GSON
		Gson gson = new Gson();
		String JSON = gson.toJson(object);

		try {
			File file = new File(filePath);
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter bufferW = new BufferedWriter(writer);
			try {
				bufferW.write(JSON);
				bufferW.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(JSON);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
