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
	
	public String getEnunciado() {
		return enunciado;
	}
	
	public int compareTo(Respuesta respuesta) {
		if(codigo<respuesta.getCodigo()) return -1;
		else if(codigo>respuesta.getCodigo()) return 1;
		else return 0;
	}
	
	public boolean equals(Respuesta respuesta) {
		return codigo==respuesta.getCodigo();
	}
	
	public String toString() {
		return codigo+" "+enunciado;
	}
}