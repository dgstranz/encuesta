import java.util.TreeMap;

public class Prueba {
	public static void main(String[] args) {
		try {
			GrupoEdadEncuesta edades1824=new GrupoEdadEncuesta(18,24);
			GrupoEdadEncuesta edades2534=new GrupoEdadEncuesta(25,34);
			GrupoEdadEncuesta edades3544=new GrupoEdadEncuesta(35,44);
			GrupoEdadEncuesta edades4554=new GrupoEdadEncuesta(45,54);
			GrupoEdadEncuesta edades5564=new GrupoEdadEncuesta(55,64);
			GrupoEdadEncuesta edades6599=new GrupoEdadEncuesta(65,99);
			
			String enunciado1="¿Cómo se define Ud. en materia religiosa: católico/a, creyente de otra religión, no creyente o ateo/a?";
			Respuesta respuesta101=new Respuesta(101,"Católico/a");
			Respuesta respuesta102=new Respuesta(102,"Creyente de otra religión");
			Respuesta respuesta103=new Respuesta(103,"No creyente");
			Respuesta respuesta104=new Respuesta(104,"Ateo/a");
			Respuesta respuesta105=new Respuesta(105,"N.C.");
			PreguntaCinco p1=new PreguntaCinco(1,enunciado1,respuesta101,respuesta102,respuesta103,respuesta104,respuesta105);
			
			String enunciado2="¿Con qué frecuencia asiste Ud. a misa u otros oficios religiosos, sin contar las ocasiones relacionadas con ceremonias de tipo social, por ejemplo, bodas, comuniones o funerales?";
			Respuesta respuesta201=new Respuesta(201,"Casi nunca");
			Respuesta respuesta202=new Respuesta(202,"Varias veces al año");
			Respuesta respuesta203=new Respuesta(203,"Alguna vez al mes");
			Respuesta respuesta204=new Respuesta(204,"Casi todos los domingos y festivos");
			Respuesta respuesta205=new Respuesta(205,"Varias veces a la semana");
			Respuesta respuesta206=new Respuesta(206,"N.C.");
			PreguntaSeis p2=new PreguntaSeis(2,enunciado2,respuesta201,respuesta202,respuesta203,respuesta204,respuesta205,respuesta206);
			
			System.out.println(p1.getCodigo());
			System.out.println(p1.getEnunciadoRespuesta(102));
			System.out.println(p1);
			
			TreeMap<Integer,Pregunta> preguntas=new TreeMap<Integer,Pregunta>();
			preguntas.put(1,p1);
			preguntas.put(2,p2);
			
			p1.setResultados(29.8, 25.0, 20.0, 15.0, 10.0);
			System.out.println(p1.getResultado(respuesta102));
			System.out.println(p1.getResultado(102));
			
			p1.setResultadosPorEdad(edades1824, 32.2, 26.1, 20.0, 13.9, 7.8);
			System.out.println(p1.getResultadoPorEdad(edades1824, respuesta102));
			System.out.println(p1.getResultadoPorEdad(edades1824, 102));
			
			Encuesta e1=new Encuesta(1,2003,preguntas);
			System.out.println(e1);
			p1.setResultados(70.1, 1.9, 15.5, 8.5, 4.0);
			p1.setResultadosPorEdad(edades1824, 55, 2, 23, 18, 2);
			p1.setResultadosPorEdad(edades2534, 63, 2, 19, 14, 2);
			p1.setResultadosPorEdad(edades3544, 71, 1, 15, 11, 2);
			p1.setResultadosPorEdad(edades4554, 79, 1, 11, 7, 2);
			p1.setResultadosPorEdad(edades5564, 87, 0, 7, 4, 2);
			p1.setResultadosPorEdad(edades6599, 95, 0, 3, 0, 2);
			System.out.println(p1.getResultado(103));
			System.out.println(e1.getResultadoPorEdad(1,edades1824,103));
			System.out.println(e1.getResultadoPorEdad(8,edades1824,103));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
