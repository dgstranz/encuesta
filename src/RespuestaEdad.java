public class RespuestaEdad implements Comparable<RespuestaEdad>{
	private Respuesta respuesta;
	private GrupoEdadEncuesta edades;
	
	public RespuestaEdad(GrupoEdadEncuesta edades,Respuesta respuesta) {
		this.edades=edades;
		this.respuesta=respuesta;
	}
	
	public RespuestaEdad(Respuesta respuesta,GrupoEdadEncuesta edades) {
		this.edades=edades;
		this.respuesta=respuesta;
	}
	
	public GrupoEdadEncuesta getEdades() {
		return edades;
	}
	
	public Respuesta getRespuesta() {
		return respuesta;
	}
	
	public int compareTo(RespuestaEdad re) {
		if(edades.getCodigo()<re.getEdades().getCodigo()) return -1;
		else if(edades.getCodigo()>re.getEdades().getCodigo()) return 1;
		else return respuesta.compareTo(re.getRespuesta());
	}
}
