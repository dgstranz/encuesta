import java.util.TreeMap;

public class Encuesta implements Comparable<Encuesta> {
	private Fecha fecha;
	private TreeMap<Integer,Pregunta> preguntas;
	
	public Encuesta(int mes,int año) {
		fecha=new Fecha(mes,año);
	}
	
	public Encuesta(int mes,int año,TreeMap<Integer,Pregunta> preguntas) {
		fecha=new Fecha(mes,año);
		this.preguntas=preguntas;
	}
	
	public Fecha getFecha() {
		return fecha;
	}
	
	public Pregunta getPregunta(int codigo) throws Exception {
		if(preguntas.containsKey(codigo)) return preguntas.get(codigo);
		else throw new Exception("No existe esa pregunta.");
	}
	
	public Pregunta getPregunta(Pregunta pregunta) throws Exception {
		int codigo=pregunta.getCodigo();
		if(preguntas.containsKey(codigo)) {
			Pregunta pres=preguntas.get(codigo);
			if(pregunta.getEnunciado().equals(pres.getEnunciado())) return pres;
			else throw new Exception("El enunciado no se corresponde.");
		}
		else throw new Exception("No existe esa pregunta.");
	}
	
	public TreeMap<Integer,Pregunta> getPreguntas() {
		return preguntas;
	}
	
	//Acceso a las preguntas	
	public void setResultados(Pregunta pregunta,Respuesta respuesta,double resultado) throws Exception {
		this.getPregunta(pregunta).setResultado(respuesta,resultado);
	}
	
	public void setResultados(int pregunta,int respuesta,double resultado) throws Exception {
		this.getPregunta(pregunta).setResultado(respuesta,resultado);
	}
	
	public void setResultados(PreguntaCinco pregunta,double r0,double r1,double r2,double r3,double r4) throws Exception {
		((PreguntaCinco)this.getPregunta(pregunta)).setResultados(r0,r1,r2,r3,r4);
	}
	
	public void setResultados(int pregunta,double r0,double r1,double r2,double r3,double r4) throws Exception {
		((PreguntaCinco)this.getPregunta(pregunta)).setResultados(r0,r1,r2,r3,r4);
	}
	
	public void setResultados(Pregunta pregunta,double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		((PreguntaSeis)this.getPregunta(pregunta)).setResultados(r0,r1,r2,r3,r4,r5);
	}
	
	public void setResultados(int pregunta,double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		((PreguntaSeis)this.getPregunta(pregunta)).setResultados(r0,r1,r2,r3,r4,r5);
	}

	public double getResultados(Pregunta pregunta,Respuesta respuesta) throws Exception {
		return this.getPregunta(pregunta).getResultado(respuesta);
	}
	
	public double getResultado(int pregunta,int respuesta) throws Exception {
		return this.getPregunta(pregunta).getResultado(respuesta);
	}
	
	public void setResultadoPorEdad(Pregunta pregunta,GrupoEdadEncuesta edades,Respuesta respuesta,double resultado) throws Exception {
		this.getPregunta(pregunta).setResultadoPorEdad(edades,respuesta,resultado);
	}
	public void setResultadoPorEdad(int pregunta,GrupoEdadEncuesta edades,int respuesta,double resultado) throws Exception {
		this.getPregunta(pregunta).setResultadoPorEdad(edades,respuesta,resultado);
	}

	public void setResultadosPorEdad(Pregunta pregunta,GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4) throws Exception {
		((PreguntaCinco)this.getPregunta(pregunta)).setResultadosPorEdad(edades,r0,r1,r2,r3,r4);
	}
	
	public void setResultadosPorEdad(int pregunta,GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4) throws Exception {
		((PreguntaCinco)this.getPregunta(pregunta)).setResultadosPorEdad(edades,r0,r1,r2,r3,r4);
	}
	
	public void setResultadosPorEdad(Pregunta pregunta,GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		((PreguntaSeis)this.getPregunta(pregunta)).setResultadosPorEdad(edades,r0,r1,r2,r3,r4,r5);
	}
	
	public void setResultadosPorEdad(int pregunta,GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		((PreguntaSeis)this.getPregunta(pregunta)).setResultadosPorEdad(edades,r0,r1,r2,r3,r4,r5);
	}

	public double getResultadoPorEdad(Pregunta pregunta,GrupoEdadEncuesta edades,Respuesta respuesta) throws Exception {
		return this.getPregunta(pregunta).getResultadoPorEdad(edades,respuesta);
	}
	
	public double getResultadoPorEdad(int pregunta,GrupoEdadEncuesta edades,int respuesta) throws Exception {
		return this.getPregunta(pregunta).getResultadoPorEdad(edades,respuesta);
	}
	
	public int compareTo(Encuesta encuesta) {
		return fecha.compareTo(encuesta.getFecha());
	}
	
	public boolean equals(Encuesta encuesta) {
		return (fecha==encuesta.getFecha() && preguntas.entrySet()==encuesta.getPreguntas().entrySet());
	}
	
	public String toString() {
		String s=""+fecha+"\n"+preguntas;
		return s;
	}
}
