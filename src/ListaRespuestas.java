import java.util.*;

public class ListaRespuestas {
	private TreeMap<Respuesta,Double> respuestas;
	
	public ListaRespuestas() {
		respuestas=new TreeMap<Respuesta,Double>();
	}
	
	public void put(Respuesta respuesta,double porcentaje) {
		respuestas.put(respuesta,(Double)porcentaje);
	}
	
	public String toString() {
		String s=""+respuestas.values();
		return s;
	}
}
