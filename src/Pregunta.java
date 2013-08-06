import java.util.TreeMap;

public class Pregunta {
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
	
	public Respuesta getRespuesta(int i) {
		return respuestas.get(i);
	}
	
	public String getEnunciadoRespuesta(int i) {
		return respuestas.get(i).toString();
	}
	
	//Setters y getters para resultados	
	public void setResultado(Respuesta respuesta,double resultado) throws Exception {
		if(respuestas.containsValue(respuesta)) {
			resultados.put(respuesta,resultado);
		}
		else throw new Exception("Respuesta no válida.");
	}
	
	public void setResultado(int num,double resultado) throws Exception {
		if(respuestas.containsKey(num)) {
			resultados.put(respuestas.get(num),resultado);
		}
		else throw new Exception("Respuesta no válida.");
	}
	
	public double getResultado(Respuesta respuesta) {
		return resultados.get(respuesta);
	}
	
	public double getResultado(int codigo) {
		return this.getResultado(respuestas.get(codigo));
	}
	
	//Setters y getters para resultados por edad
	public void setResultadoPorEdad(GrupoEdadEncuesta edades,Respuesta respuesta,double resultado) {
		RespuestaEdad re=new RespuestaEdad(edades,respuesta);
		resultadosPorEdad.put(re,resultado);
	}
	
	public void setResultadoPorEdad(GrupoEdadEncuesta edades,int respuesta,double resultado) throws Exception {
		if(respuestas.containsKey(respuesta)) {
			RespuestaEdad re=new RespuestaEdad(edades,respuestas.get(respuesta));
			resultadosPorEdad.put(re,resultado);
		}
		else throw new Exception("Código de respuesta no encontrado.");
	}
	
	public double getResultadoPorEdad(GrupoEdadEncuesta edades,Respuesta respuesta) {
		RespuestaEdad re=new RespuestaEdad(edades,respuesta);
		return resultadosPorEdad.get(re);
	}
	
	public double getResultadoPorEdad(GrupoEdadEncuesta edades,int codigo) {
		return this.getResultadoPorEdad(edades,respuestas.get(codigo));
	}
	
	public String toString() {
		return enunciado;
	}
}
