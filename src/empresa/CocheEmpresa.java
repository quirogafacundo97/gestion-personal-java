package empresa;

public class CocheEmpresa {
	private String matricula;
	private String marca;
	private String modelo;
	
	public CocheEmpresa(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	@Override
	public String toString() {
		return marca + " " + modelo + " - Matricula: " + matricula;
	}
}
