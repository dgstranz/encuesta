public class ExceptionRespuestaOOR extends Exception {
	private static final long serialVersionUID = 1L;

	public ExceptionRespuestaOOR() {
		super("Error: N�mero de respuesta fuera de rango");
	}
	
	public ExceptionRespuestaOOR(String mensaje) {
		super(mensaje);
	}
}