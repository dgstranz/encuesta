public class GrupoEdadEncuesta implements GrupoEdad, Comparable<Object> {
	private int codigo;
	private int edadMin;
	private int edadMax;
	
	public GrupoEdadEncuesta(int edadMin,int edadMax) throws Exception {
		if(edadMin>edadMax || edadMin<0 || edadMax>99) {
			throw new Exception("Error: rango no válido");
		}
		codigo=100*edadMin+edadMax;
		switch(codigo) {
			case 1824:case 2534:case 3544:case 4554:case 5564:case 6599:
				this.edadMin=edadMin;
				this.edadMax=edadMax;
				break;
			default:
				throw new Exception("Error: grupo de edad no definido.");
		}
	}	

	public int getEdadMin() {
		return edadMin;
	}
	
	public int getEdadMax() {
		return edadMax;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String toString() {
		return ""+edadMin+"-"+edadMax;
	}
	
	public int compareTo(Object o) {
		GrupoEdadEncuesta ge=(GrupoEdadEncuesta)o;
		if(this.codigo<ge.getCodigo()) return -1;
		else if(this.codigo>ge.getCodigo()) return 1;
		else return 0;
	}
}