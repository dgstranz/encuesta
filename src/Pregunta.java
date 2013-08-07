import java.util.TreeMap;

public class Pregunta implements Comparable<Pregunta> {
	protected int codigo;
	protected String enunciado;
	protected int numRespuestas;
	protected TreeMap<Integer,Respuesta> respuestas;
	protected TreeMap<Respuesta,Double> resultados;
	protected TreeMap<RespuestaEdad,Double> resultadosPorEdad;
	
	public Pregunta() {
		respuestas=new TreeMap<Integer,Respuesta>();
		resultados=new TreeMap<Respuesta,Double>();
		resultadosPorEdad=new TreeMap<RespuestaEdad,Double>();
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	
	public String getRespuestas() {
		String s="";
		s+=respuestas.values().toString();
		return s;
	}
	
	public Respuesta getRespuesta(int codigo) throws Exception {
		if(respuestas.containsKey(codigo)) return respuestas.get(codigo);
		else throw new Exception("Respuesta inexistente.");
	}
	
	public String getEnunciadoRespuesta(int codigo) throws Exception {
		return this.getRespuesta(codigo).getEnunciado();
	}
	
	//Setters y getters para resultados	
	public void setResultado(Respuesta respuesta,double resultado) throws Exception {
		if(respuestas.containsValue(respuesta)) resultados.put(respuesta,resultado);
		else throw new Exception("Respuesta inexistente.");
	}
	
	public void setResultado(int codigo,double resultado) throws Exception {
		if(respuestas.containsKey(codigo)) resultados.put(respuestas.get(codigo),resultado);
		else throw new Exception("Respuesta inexistente.");
	}
	
	public double getResultado(Respuesta respuesta) throws Exception {
		if(respuestas.containsValue(respuesta)) return resultados.get(respuesta);
		else throw new Exception("Respuesta inexistente.");		
	}
	
	public double getResultado(int codigo) throws Exception {
		if(respuestas.containsKey(codigo)) return this.getResultado(respuestas.get(codigo));
		else throw new Exception("Respuesta inexistente.");
	}
	
	//Setters y getters para resultados por edad
	public void setResultadoPorEdad(GrupoEdadEncuesta edades,Respuesta respuesta,double resultado) throws Exception {
		if(respuestas.containsValue(respuesta)) {
			RespuestaEdad re=new RespuestaEdad(edades,respuesta);
			resultadosPorEdad.put(re,resultado);
		}
		else throw new Exception("Respuesta inexistente.");
	}
	
	public void setResultadoPorEdad(GrupoEdadEncuesta edades,int respuesta,double resultado) throws Exception {
		if(respuestas.containsKey(respuesta)) {
			RespuestaEdad re=new RespuestaEdad(edades,respuestas.get(respuesta));
			resultadosPorEdad.put(re,resultado);
		}
		else throw new Exception("Respuesta inexistente.");
	}
	
	public double getResultadoPorEdad(GrupoEdadEncuesta edades,Respuesta respuesta) throws Exception {
		if(respuestas.containsValue(respuesta)) {
			RespuestaEdad re=new RespuestaEdad(edades,respuesta);
			return resultadosPorEdad.get(re);
		}
		else throw new Exception("Respuesta inexistente.");
	}
	
	public double getResultadoPorEdad(GrupoEdadEncuesta edades,int codigo) throws Exception {
		return this.getResultadoPorEdad(edades,respuestas.get(codigo));
	}
	
	public int compareTo(Pregunta pregunta) {
		if(codigo<pregunta.getCodigo()) return -1;
		else if(codigo>pregunta.getCodigo()) return 1;
		else return 0;
	}
	
	public boolean equals(Pregunta pregunta) {
		return codigo==pregunta.getCodigo();
	}
	
	public String toString() {
		return codigo+" "+enunciado;
	}
}