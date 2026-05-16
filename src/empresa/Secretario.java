package empresa;

public class Secretario extends Empleado{
	private String despacho;
	private String nroFax;
	
	public Secretario(String nombre, int dni, String direccion, int antiguedad, String telefono, float salarioAnual,  Empleado supervisor, float salarioMensual, String despacho, String nroFax) {
		super(nombre, dni, direccion, salarioAnual, salarioMensual, antiguedad, telefono, supervisor);
		this.despacho = despacho;
		this.nroFax = nroFax;
	}
	
	public String getDespacho() {
		return despacho;
	}
	
	public String getNroFax() {
		return nroFax;
	}
	
	@Override
	public void incrementarSalarioMensual() {
		float nuevoSalario =  getSalarioMensual() + (float) 0.001f * getSalarioAnual() + 10000 * getAntiguedad();
		setSalarioMensual(nuevoSalario);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nDespacho: " + despacho + "\nNumero fax: " + nroFax;
	}
}
