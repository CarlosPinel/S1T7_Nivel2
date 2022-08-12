package ITAcademy.S1T7_N201;

/**
 * Crea una anotació personalitzada que ha de permetre serialitzar un objecte
 * Java en un fitxer JSON. L’anotació ha de rebre el directori on es col·locarà
 * el fitxer resultant.
 *
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

	//Indica que nuestra anotación puede ser utilizada en tiempo de ejecucion
	@Retention(RetentionPolicy.RUNTIME)
	//Indica que el objetivo de nuestra anotación es cualquiera (clase, campo, metodo...) es una restriccion de uso de la anotacion
	@Target(ElementType.TYPE)
	//descripcion de la anotacion
	public @interface Anotacion 
	{
		//ruta donde colocar el fichero JSON
		//String filePath() default ".\\";
		String filePath() default "..\\S1T7_N201\\src\\file.JSON";
		
	}
