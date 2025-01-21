package ejercicio29;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {
	private String dni;
	private Double nota;
	private Curso curso;
	

	public Alumno(String dni) {
		
		super();
		if (dni != null) {
			dni = dni.toUpperCase();
		}
		this.dni = dni;
		
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if (dni != null) {
			dni = dni.toUpperCase();
		}
		this.dni = dni;
	}
	
	
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public void aprobar() {
		nota = 5.0;
	}
	
	
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", nombre=" + getNombre()
				+ ", edad=" + getEdad() + ", curso=" + curso + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

	public Boolean validarDNI() {
	String ejemploDni = "000000000T";
	Pattern patron = Pattern.compile("[0-9][{7,8}[A-Z][a-z]");
	Matcher match = patron.matcher(ejemploDni);
	if (match.matches()) {
		return true;
	}else {
		return false;
	}
	}
	
	public Boolean validar() {
		String ejemploDni = "000000000T";
		Pattern patron = Pattern.compile("[0-9][{7,8}[A-Z][a-z]");
		Matcher match = patron.matcher(ejemploDni);
		if (match.matches()) {
			return true;
		}
		if (curso.equals(null)) {
			return false;
		}
		if (nombre.equals(null) && nombre.equals(nombre.equals(10))) {
			return false;
		}
		if (edad.equals(null)) {
			return false;
		}
		else {
			return false;
		}
		
	}
}