import java.util.TreeMap;

public class PreguntaUno implements Pregunta {
	private int codigo=1;
	private String enunciado="¿Cómo se define Ud. en materia religiosa: católico/a, creyente de otra religión, no creyente o ateo/a?";
	private int numRespuestas=5;
	private Respuesta[] respuestas;
	private TreeMap<Respuesta,Double> resultados;
	private TreeMap<RespuestaEdad,Double> resultadosPorEdad;
	
	public PreguntaUno() {
		respuestas=new Respuesta[numRespuestas];
		respuestas[0]=new Respuesta(0,"Católico/a");
		respuestas[1]=new Respuesta(1,"Creyente de otra religión");
		respuestas[2]=new Respuesta(2,"No creyente");
		respuestas[3]=new Respuesta(3,"Ateo/a");
		respuestas[4]=new Respuesta(4,"N.C.");
		resultados=new TreeMap<Respuesta,Double>();
		resultadosPorEdad=new TreeMap<RespuestaEdad,Double>();
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	
	public String getRespuesta(int i) {
		return respuestas[i].getEnunciado();
	}
	
	//Setters y getters para resultados	
	public void setResultados(Respuesta respuesta,double resultado) {
		resultados.put(respuesta,resultado);
	}
	
	public void setResultados(int num,double resultado) throws Exception {
		if(num>=0 && num<numRespuestas) {
			resultados.put(respuestas[num],resultado);
		}
		else throw new ExceptionRespuestaOOR();
	}
	
	public void setResultados(double r0,double r1,double r2,double r3,double r4) throws Exception {
		resultados.put(respuestas[0],r0);
		resultados.put(respuestas[1],r1);
		resultados.put(respuestas[2],r2);
		resultados.put(respuestas[3],r3);
		resultados.put(respuestas[4],r4);
	}
	
	public void setResultados(double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		throw new ExceptionNumeroArgumentos();
	}
	
	public double getResultados(Respuesta respuesta) {
		return resultados.get(respuesta);
	}
	
	public double getResultados(int respuesta) {
		return resultados.get(respuestas[respuesta]);
	}
	
	//Setters y getters para resultados por edad
	public void setResultadosPorEdad(GrupoEdadEncuesta edades,Respuesta respuesta,double resultado) {
		RespuestaEdad re=new RespuestaEdad(edades,respuesta);
		resultadosPorEdad.put(re,resultado);
	}
	
	public void setResultadosPorEdad(GrupoEdadEncuesta edades,int num,double resultado) throws Exception {
		if(num>=0 && num<numRespuestas) {
			RespuestaEdad re=new RespuestaEdad(edades,respuestas[num]);
			resultadosPorEdad.put(re,resultado);
		}
		else throw new ExceptionRespuestaOOR();
	}
	
	public void setResultadosPorEdad(GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4) throws Exception {
		RespuestaEdad re0=new RespuestaEdad(edades,respuestas[0]);
		RespuestaEdad re1=new RespuestaEdad(edades,respuestas[1]);
		RespuestaEdad re2=new RespuestaEdad(edades,respuestas[2]);
		RespuestaEdad re3=new RespuestaEdad(edades,respuestas[3]);
		RespuestaEdad re4=new RespuestaEdad(edades,respuestas[4]);
		resultadosPorEdad.put(re0,r0);
		resultadosPorEdad.put(re1,r1);
		resultadosPorEdad.put(re2,r2);
		resultadosPorEdad.put(re3,r3);
		resultadosPorEdad.put(re4,r4);
	}
	
	public void setResultadosPorEdad(GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		throw new ExceptionNumeroArgumentos();
	}
	
	public double getResultadosPorEdad(GrupoEdadEncuesta edades,Respuesta respuesta) {
		RespuestaEdad re=new RespuestaEdad(edades,respuesta);
		return resultadosPorEdad.get(re);
	}
	
	public double getResultadosPorEdad(GrupoEdadEncuesta edades,int respuesta) {
		RespuestaEdad re=new RespuestaEdad(edades,respuestas[respuesta]);
		return resultadosPorEdad.get(re);
	}
	
	public String toString() {
		String s=""+enunciado;
		for(int i=0;i<numRespuestas;i++) {
			s+="\n- "+respuestas[i].getEnunciado()+" ";
		}
		return s;
	}
}
