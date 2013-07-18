public interface Pregunta {
	public int getCodigo();
	public String getEnunciado();
	public String getRespuesta(int i);
	
	public void setResultados(Respuesta respuesta,double resultado);
	public void setResultados(int respuesta,double resultado) throws Exception;
	public void setResultados(double r0,double r1,double r2,double r3,double r4) throws Exception;
	public void setResultados(double r0,double r1,double r2,double r3,double r4,double r5) throws Exception;
	public double getResultados(Respuesta respuesta);
	public double getResultados(int num);
	
	public void setResultadosPorEdad(GrupoEdadEncuesta edades,Respuesta respuesta,double resultado);
	public void setResultadosPorEdad(GrupoEdadEncuesta edades,int respuesta,double resultado) throws Exception;
	public void setResultadosPorEdad(GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4) throws Exception;
	public void setResultadosPorEdad(GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4,double r5) throws Exception;
	public double getResultadosPorEdad(GrupoEdadEncuesta edades,Respuesta respuesta);
	public double getResultadosPorEdad(GrupoEdadEncuesta edades,int respuesta);
	
	public String toString();
}
