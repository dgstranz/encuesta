import java.util.TreeMap;

public class PreguntaUno implements Pregunta {
	private String enunciado="¿Cómo se define Ud. en materia religiosa: católico/a, creyente de otra religión, no creyente o ateo/a?";
	private TreeMap<Integer,String> respuestas;
	
	public PreguntaUno() {
		respuestas=new TreeMap<Integer,String>();
		respuestas.put(1,"Católico/a");
		respuestas.put(2,"Creyente de otra religión");
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
