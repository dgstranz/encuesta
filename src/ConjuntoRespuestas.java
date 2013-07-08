import java.util.Map;
import java.util.TreeMap;

public class ConjuntoRespuestas {
	private TreeMap<GrupoEdadEncuesta,ListaRespuestas> respuestasPorEdad;
	private ListaRespuestas respuestaGlobal;
	
	public ConjuntoRespuestas() {
		respuestasPorEdad=new TreeMap<GrupoEdadEncuesta,ListaRespuestas>();
	}

	public void setRespuestaGlobal(ListaRespuestas lista) {
		respuestaGlobal=lista;
	}
	
	public void put(GrupoEdadEncuesta edades,ListaRespuestas lista) {
		respuestasPorEdad.put(edades,lista);
	}

	public String toString() {
		String s="";
		s+="Población total: "+respuestaGlobal+"\n";
		for(Map.Entry<GrupoEdadEncuesta,ListaRespuestas> entry : respuestasPorEdad.entrySet()) {
			s+=entry.getKey()+" años: "+entry.getValue()+"\n";
		}
		return s;
	}
}