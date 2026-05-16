package empresa;

public class Vendedor extends Empleado{
	private CocheEmpresa coche;
	private String telefonoMovil;
	
	public Vendedor(String nombre, int dni, String direccion, int antiguedad, String telefono, float salarioAnual,  Empleado supervisor, float salarioMensual, CocheEmpresa coche, String movil) {
		super(nombre, dni, direccion, salarioAnual, salarioMensual, antiguedad, telefono, supervisor);
		
		this.coche = coche;
		this.telefonoMovil = movil;
	}
	
	public CocheEmpresa getCoche() {
		return coche;
	}
	
	public String getTelefonoMovil() {
		return telefonoMovil;
	}
	
	public void setCoche(CocheEmpresa cocheNvo) {
		coche = cocheNvo;
	}
	
	@Override
	public void incrementarSalarioMensual() {
		float nuevoSalario = getSalarioMensual() + (float) 0.002f * getSalarioAnual() + 12000 * getAntiguedad();
		setSalarioMensual(nuevoSalario);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nVehiculo: " + coche + "\nMovil: " + telefonoMovil;
	}
}
