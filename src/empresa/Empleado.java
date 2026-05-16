package empresa;

public abstract class Empleado extends Personal{
	private int aniosAntiguedad;
	private String telefono;
	private Empleado supervisor;
	
	
	public Empleado(String nombre, int dni, String direccion, float salarioAnual, float salarioMensual, int antiguedad,  String telefono, Empleado supervisor) {
		super(nombre, dni, direccion, salarioAnual, salarioMensual);
		this.aniosAntiguedad = antiguedad;
		this.telefono = telefono;
		this.supervisor = supervisor;
	}
	

	public int getAntiguedad() {
		return aniosAntiguedad;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public Empleado getSupervisor() {
		return supervisor;
	}
	
	public void setSupervisor(Empleado nvoSupervisor) {
		supervisor = nvoSupervisor;
	}
	
	@Override 
	public String toString() {
		return super.toString() + "\nAntiguedad: " + aniosAntiguedad + "\nTelefono: " + telefono + "\nSupervisor" + (supervisor != null ? supervisor.getNombre() : "Sin supervisor");
	}
}
