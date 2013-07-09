public class Prueba {
	public static void main(String[] args) {
		ListaRespuestas lista=new ListaRespuestas();
		Respuesta r1=new Respuesta(1,"Respuesta 1");
		Respuesta r2=new Respuesta(2,"Respuesta 2");
		Respuesta r3=new Respuesta(3,"Respuesta 3");
		lista.put(r3,24.8);
		lista.put(r1,12.4);
		lista.put(r2,49.6);
		System.out.println(lista);
		try {
			GrupoEdadEncuesta edades1824=new GrupoEdadEncuesta(18,24);
			GrupoEdadEncuesta edades2534=new GrupoEdadEncuesta(25,34);
			GrupoEdadEncuesta edades3544=new GrupoEdadEncuesta(35,44);
			GrupoEdadEncuesta edades4554=new GrupoEdadEncuesta(45,54);
			GrupoEdadEncuesta edades5564=new GrupoEdadEncuesta(55,64);
			GrupoEdadEncuesta edades6599=new GrupoEdadEncuesta(65,99);
			ConjuntoRespuestas respuestas=new ConjuntoRespuestas();
			respuestas.setRespuestaGlobal(lista);
			respuestas.put(edades1824,lista);
			respuestas.put(edades2534,lista);
			respuestas.put(edades3544,lista);
			respuestas.put(edades4554,lista);
			respuestas.put(edades5564,lista);
			respuestas.put(edades6599,lista);
			System.out.println(respuestas);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		}
		Encuesta e1=new Encuesta(1,2003);
		System.out.println(e1);
		System.out.println(e1.getPregunta(1));
	}
}
