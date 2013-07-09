public class Fecha {
	private int mes;
	private int año;
	
	public Fecha(int mes,int año) {
		this.mes=mes;
		this.año=año;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAño() {
		return año;
	}
	
	public int compareTo(Fecha f) {
		if(this.año<f.getAño()) return -1;
		else if(this.año>f.getAño()) return 1;
		else if(this.mes<f.getMes()) return -1;
		else if(this.mes>f.getMes()) return 1;
		else return 0;
	}
	
	public String toString() {
		String s="";
		switch(mes) {
			case 1:s+="Enero ";break;
			case 2:s+="Febrero ";break;
			case 3:s+="Marzo ";break;
			case 4:s+="Abril ";break;
			case 5:s+="Mayo ";break;
			case 6:s+="Junio ";break;
			case 7:s+="Julio ";break;
			case 8:s+="Agosto ";break;
			case 9:s+="Septiembre ";break;
			case 10:s+="Octubre ";break;
			case 11:s+="Noviembre ";break;
			case 12:s+="Diciembre ";break;
			default:s+="(Mes no definido) ";break;
		}
		s+=año;
		return s;
	}
}
