package ITAcademy.S1T7_N201;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;

import com.google.gson.Gson;

public class App {

	public static void main(String[] args) throws IOException {

		Persona persona1 = new Persona("Maria", "Diaz", 30, "Avenida de los cipreses");
		String filePath = JSONConverter(persona1);
		System.out.println("El objeto " + persona1.toString() + " se ha guardado en el fichero " + filePath);

	}

	public static String JSONConverter(Persona persona) throws IOException {

		// Resolver anotacion de objeto

		Class<?> clasePersona = persona.getClass();
		Annotation anotacionObtenida = clasePersona.getAnnotation(RutaAnotacion.class);
		if (anotacionObtenida != null && anotacionObtenida instanceof RutaAnotacion) {
			RutaAnotacion anotacionRuta = (RutaAnotacion) anotacionObtenida;
			String filePath = anotacionRuta.filePath();

			// convertir objeto a GSON
			Gson gson = new Gson();
			String JSON = gson.toJson(persona);

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
			return filePath;
		} else {
			return "no se ha podido guardar el objeto al no tener anotacion de ruta de guardado";
		}
	}
}
