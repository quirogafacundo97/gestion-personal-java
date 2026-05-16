package empresa;

public abstract class Personal {
	private String nombre;
	private int dni;
	private String direccion;
	private float salarioAnual;
	private float salarioMensual;
	
	public Personal(String nombre, int dni, String direccion, float salarioAnual, float salarioMensual) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.salarioAnual = salarioAnual;
		this.salarioMensual = salarioMensual;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public float getSalarioAnual() {
		return salarioAnual;
	}
	
	public float getSalarioMensual() {
		return salarioMensual;
	}
	
	public int getDni() {
		return dni;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setSalarioMensual(float salario) {
		salarioMensual = salario;
	}
	
	public String toString() {
		return "Nombre: " + nombre + "\nDNI: " + dni + "\nDireccion: " + direccion + "\nSalario anual: " + salarioAnual + "\nSalario mensual: " + salarioMensual;
	}
	
	public abstract void incrementarSalarioMensual();
	
}
