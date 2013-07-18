public class ExceptionNumeroArgumentos extends Exception {
	private static final long serialVersionUID = 1L;

	public ExceptionNumeroArgumentos() {
		super("Error: N�mero de argumentos incorrecto");
	}
	
	public ExceptionNumeroArgumentos(String mensaje) {
		super(mensaje);
	}
}
