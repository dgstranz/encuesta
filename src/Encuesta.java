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
	
	public Pregunta getPregunta(int numero) {
		switch(numero) {
			case 1:return p1;
			case 2:return p2;
			default:return null;
		}
	}
	
	public String toString() {
		String s=""+fecha+"\n"+p1+"\n"+p2;
		return s;
	}
}
