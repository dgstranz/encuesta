public class ExceptionPreguntaOOR extends Exception {
	private static final long serialVersionUID = 1L;

	public ExceptionPreguntaOOR() {
		super("Error: Número de pregunta fuera de rango");
	}
	
	public ExceptionPreguntaOOR(String mensaje) {
		super(mensaje);
	}
}
