package ITAcademy.S1T7_N201;

import java.io.IOException;
import java.lang.annotation.Annotation;

public class App {
	
	public static void main(String[] args) throws IOException {
		// objeto persona
		Persona persona1 = new Persona("Maria", "Diaz", 30, "Avenida de los cipreses");
		// objeto clase serializarobjeto
		Class<SerializarObjeto> obj = SerializarObjeto.class;
		// comprobar si el objeto tiene anotacion
		if (obj.isAnnotationPresent(Anotacion.class)) {
			// resolver anotacion
			Annotation anotation = obj.getAnnotation(Anotacion.class);
			Anotacion anotacion = (Anotacion) anotation;
			String path = anotacion.filePath();
			//guardar en archivo JSON objeto serializable)
			SerializarObjeto.JSONConverter(persona1, path);
		} else {
			System.out.println("No se puede realizar la conversion a JSON sin la anotacion de ruta de archivo");
		}
	}
}
