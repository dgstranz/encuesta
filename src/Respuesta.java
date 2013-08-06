public class Respuesta implements Comparable<Respuesta> {
	private int codigo;
	private String enunciado;
	
	public Respuesta(int codigo,String enunciado) {
		this.codigo=codigo;
		this.enunciado=enunciado;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public int compareTo(Respuesta r) {
		if(codigo<r.getCodigo()) return -1;
		else if(codigo>r.getCodigo()) return 1;
		else return 0;
	}
	
	public String toString() {
		return enunciado;
	}
}