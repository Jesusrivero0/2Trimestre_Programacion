package ejercicio24;

public class Curso {
	private Long identificador;
	private String descripcion;
	
	public Long getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	public String toString() {
		return "Curso [identificador=" + identificador + ", descripcion=" + descripcion + "]";
	}		
	
}
