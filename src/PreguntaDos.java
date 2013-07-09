import java.util.TreeMap;

public class PreguntaDos implements Pregunta {
	private String enunciado="¿Con qué frecuencia asiste Ud. a misa u otros oficios religiosos, sin contar las ocasiones relacionadas con ceremonias de tipo social, por ejemplo, bodas, comuniones o funerales?";
	private TreeMap<Integer,String> respuestas;
	
	public PreguntaDos() {
		respuestas=new TreeMap<Integer,String>();
		respuestas.put(1,"Casi nunca");
		respuestas.put(2,"Varias veces al año");
		respuestas.put(3,"Alguna vez al mes");
		respuestas.put(4,"Casi todos los domingos y festivos");
		respuestas.put(5,"Varias veces a la semana");
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
