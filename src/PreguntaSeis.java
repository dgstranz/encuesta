import java.util.TreeMap;

public class PreguntaSeis extends Pregunta {
	public PreguntaSeis(int codigo,String enunciado,Respuesta r0,Respuesta r1,Respuesta r2,Respuesta r3,Respuesta r4,Respuesta r5) throws Exception {
		super.codigo=codigo;
		super.enunciado=enunciado;
		super.numRespuestas=6;
		super.respuestas.put(r0.getCodigo(),r0);
		super.respuestas.put(r1.getCodigo(),r1);
		super.respuestas.put(r2.getCodigo(),r2);
		super.respuestas.put(r3.getCodigo(),r3);
		super.respuestas.put(r4.getCodigo(),r4);
		super.respuestas.put(r5.getCodigo(),r5);
		if(super.respuestas.size()!=numRespuestas) throw new Exception("Códigos duplicados.");
		super.resultados=new TreeMap<Respuesta,Double>();
		super.resultadosPorEdad=new TreeMap<RespuestaEdad,Double>();
	}
	
	public PreguntaSeis(int codigo,String enunciado,String s0,String s1,String s2,String s3,String s4,String s5) throws Exception {
		this(codigo,enunciado,new Respuesta(0,s0),new Respuesta(1,s1),new Respuesta(2,s2),new Respuesta(3,s3),new Respuesta(4,s4),new Respuesta(5,s5));
	}
	
	//Setters y getters para resultados		
	public void setResultados(double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		if(super.respuestas.size()!=numRespuestas) throw new Exception("Número de respuestas incorrecto.");
		int k=super.respuestas.firstKey();
		super.setResultado(k,r0);
		k=super.respuestas.higherKey(k);
		super.setResultado(k,r1);
		k=super.respuestas.higherKey(k);
		super.setResultado(k,r2);
		k=super.respuestas.higherKey(k);
		super.setResultado(k,r3);
		k=super.respuestas.higherKey(k);
		super.setResultado(k,r4);
		k=super.respuestas.higherKey(k);
		super.setResultado(k,r5);
	}
	
	//Setters y getters para resultados por edad
	public void setResultadosPorEdad(GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4) throws Exception {
		throw new Exception("Número de argumentos no válido.");
	}
	
	public void setResultadosPorEdad(GrupoEdadEncuesta edades,double r0,double r1,double r2,double r3,double r4,double r5) throws Exception {
		if(super.respuestas.size()!=numRespuestas) throw new Exception("Número de respuestas incorrecto.");
		int k=super.respuestas.firstKey();
		super.setResultadoPorEdad(edades,k,r0);
		k=super.respuestas.higherKey(k);
		super.setResultadoPorEdad(edades,k,r1);
		k=super.respuestas.higherKey(k);
		super.setResultadoPorEdad(edades,k,r2);
		k=super.respuestas.higherKey(k);
		super.setResultadoPorEdad(edades,k,r3);
		k=super.respuestas.higherKey(k);
		super.setResultadoPorEdad(edades,k,r4);
		k=super.respuestas.higherKey(k);
		super.setResultadoPorEdad(edades,k,r5);
	}
}