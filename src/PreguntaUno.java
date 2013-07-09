import java.util.TreeMap;

public class PreguntaUno implements Pregunta {
	private String enunciado="�C�mo se define Ud. en materia religiosa: cat�lico/a, creyente de otra religi�n, no creyente o ateo/a?";
	private TreeMap<Integer,String> respuestas;
	
	public PreguntaUno() {
		respuestas=new TreeMap<Integer,String>();
		respuestas.put(1,"Cat�lico/a");
		respuestas.put(2,"Creyente de otra religi�n");
		respuestas.put(3,"No creyente");
		respuestas.put(4,"Ateo/a");
		respuestas.put(99,"N.C.");
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	
	public String toString() {
		String s=""+enunciado+"\n"+respuestas.values();
		return s;
	}
}
