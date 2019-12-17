import java.util.ArrayList;

public class Libro {
	protected double precio;
	protected String nombre;
	protected String autor;
	protected String resumen;
	protected ArrayList<String> generos;
	
	public Libro(double precio, String nombre, String autor, String resumen){
		this.precio = precio;
		this.nombre = nombre;
		this.autor = autor;
		this.resumen = resumen;
		this.generos = new ArrayList<String>();
	}

	public boolean esGenero(String genero) {
		for(String g: generos){
			if(g.equals(genero)){
				return true;
			}
		}
		return false;
	}
}