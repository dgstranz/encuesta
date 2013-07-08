public class Pregunta implements Comparable<Pregunta> {
	private int codigo;
	private String enunciado;
	
	public Pregunta(int codigo,String enunciado) {
		this.codigo=codigo;
		this.enunciado=enunciado;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	
	public int compareTo(Pregunta p) {
		if(codigo<p.getCodigo()) return -1;
		else if(codigo>p.getCodigo()) return 1;
		else return 0;
	}
}