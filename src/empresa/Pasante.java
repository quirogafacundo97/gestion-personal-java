package empresa;
import java.time.LocalDate;
public class Pasante extends Personal {
	private LocalDate fechaInicioContrato;
	
	public Pasante(String nombre, int dni, String direccion, float salarioAnual, float salarioMensual, LocalDate fechaInicioContrato) {
		super(nombre, dni, direccion, salarioAnual, salarioMensual);
		this.fechaInicioContrato = fechaInicioContrato;
	}
	
	@Override
	
	public void incrementarSalarioMensual() {
		float nvoSalario = (float) 0.0005f * getSalarioAnual();
		setSalarioMensual(nvoSalario);
	}
	
	public LocalDate getFechaInicioContrato() {
		return fechaInicioContrato;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nFecha inicio contrato: " + fechaInicioContrato;
	}
}
