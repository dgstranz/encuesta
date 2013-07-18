public class Encuesta {
	private Fecha fecha;
	private PreguntaUno p1;
	private PreguntaDos p2;
	
	public Encuesta(int mes,int año) {
		fecha=new Fecha(mes,año);
		p1=new PreguntaUno();
		p2=new PreguntaDos();
	}
	
	public Fecha getFecha() {
		return fecha;
	}
	
	public Pregunta getPregunta(int codigo) throws Exception {
		if(p1.getCodigo()==codigo) return p1;
		else if(p2.getCodigo()==codigo) return p2;
		else throw new ExceptionPreguntaOOR();
	}
	
	public Pregunta getPregunta(Pregunta pregunta) throws Exception {
		return this.getPregunta(pregunta.getCodigo());
	}
	
	//Acceso a las preguntas	
	public void setResultados(Pregunta pregunta,Respuesta respuesta,double resultado) throws Exception {
		this.getPregunta(pregunta).setResultados(respuesta,resultado);
	}
	
	public void setResultados(int pregunta,int respuesta,double resultado) throws Exception {
		this.getPregunta(pregunta).setResultados(respuesta,resultado);
	}
	
	public void setResultados(Pregunta pregunta,double r0,double r1,double r2,double r3,double r4) throws Exception {
		this.getPregunta(pregunta).setResultados(r0,r1,r2,r3,r4);
	}
	
	public void setResultados(int pregunta,double r0,double r1,double r2,double r3,double r4) throws Exception {
		this.getPregunta(pregunta).setResultados(r0,r1,r2,r3,r4);
	}
	
	public void setResultados(Pregunta pregunta,double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		this.getPregunta(pregunta).setResultados(r0,r1,r2,r3,r4,r5);
	}
	
	public void setResultados(int pregunta,double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		this.getPregunta(pregunta).setResultados(r0,r1,r2,r3,r4,r5);
	}

	public double getResultados(Pregunta pregunta,Respuesta respuesta) throws Exception {
		return this.getPregunta(pregunta).getResultados(respuesta);
	}
	
	public double getResultados(int pregunta,int respuesta) throws Exception {
		return this.getPregunta(pregunta).getResultados(respuesta);
	}
	
	public void setResultadosPorEdad(Pregunta pregunta,GrupoEdadEncuesta edades,Respuesta respuesta,double resultado) throws Exception {
		this.getPregunta(pregunta).setResultadosPorEdad(edades,respuesta,resultado);
	}
	public void setResultadosPorEdad(int pregunta,GrupoEdadEncuesta edades,int respuesta,double resultado) throws Exception {
		this.getPregunta(pregunta).setResultadosPorEdad(edades,respuesta,resultado);
	}

	public void setResultadosPorEdad(Pregunta pregunta,GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4) throws Exception {
		this.getPregunta(pregunta).setResultadosPorEdad(edades,r0,r1,r2,r3,r4);
	}
	
	public void setResultadosPorEdad(int pregunta,GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4) throws Exception {
		this.getPregunta(pregunta).setResultadosPorEdad(edades,r0,r1,r2,r3,r4);
	}
	
	public void setResultadosPorEdad(Pregunta pregunta,GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		this.getPregunta(pregunta).setResultadosPorEdad(edades,r0,r1,r2,r3,r4,r5);
	}
	
	public void setResultadosPorEdad(int pregunta,GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		this.getPregunta(pregunta).setResultadosPorEdad(edades,r0,r1,r2,r3,r4,r5);
	}

	public double getResultadosPorEdad(Pregunta pregunta,GrupoEdadEncuesta edades,Respuesta respuesta) throws Exception {
		return this.getPregunta(pregunta).getResultadosPorEdad(edades,respuesta);
	}
	
	public double getResultadosPorEdad(int pregunta,GrupoEdadEncuesta edades,int respuesta) throws Exception {
		return this.getPregunta(pregunta).getResultadosPorEdad(edades,respuesta);
	}
	
	public String toString() {
		String s=""+fecha+"\n"+p1+"\n"+p2;
		return s;
	}
}
