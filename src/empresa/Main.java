package empresa;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		//Crear coche
		CocheEmpresa coche1 = new CocheEmpresa("AB123CD", "Toyota", "Corolla");

		//Crear secretario supervisor
		Secretario secretario = new Secretario("Laura Gomez", 30111222, "Av. Belgrano 123", 5, "387456789", 1200000, null, 100000, "Despacho 2", "4312456");
		
		//Crear vendedor
		Vendedor vendedor = new Vendedor("Juan Perez", 35666777, "Mitre 456", 3, "387512345", 1500000, secretario, 130000, coche1, "387600000");
		
		//Crear pasante
		Pasante pasante = new Pasante("Sofia Ruiz", 44222333, "San Martin 890", 800000, 70000, LocalDate.now());
		
		//Muestro datos originales
		System.out.println("=== INFORMACION DE PERSONAL ===");
		System.out.println(secretario);
		System.out.println("--------------");
		System.out.println(vendedor);
		System.out.println("--------------");
		System.out.println(pasante);
		
		System.out.println("=== TESTEO EMPRESA ===");
		
		//Polimorfismo
		Personal[] personalEmpresa = new Personal[3];
		
		personalEmpresa[0] = secretario;
		personalEmpresa[1] = vendedor;
		personalEmpresa[2] = pasante;
		
		System.out.println("\n=== POLIMORFISMO ===");
		
		for (Personal p: personalEmpresa) {
			p.incrementarSalarioMensual();
			System.out.println("-----------------");
			System.out.println(p);
			if(p instanceof Vendedor) {
				System.out.println("Tipo: Vendedor");
			}
			else if(p instanceof Secretario) {
				System.out.println("Tipo: Secretario");
			}
			else if(p instanceof Pasante) {
				System.out.println("Tipo: Pasante");
			}
		}
		
		int contadorVendedores = 0;
		int contadorSecretarios = 0;
		int contadorPasantes = 0;
		
		for(Personal p : personalEmpresa) {
	
			if(p instanceof Vendedor) {
				contadorVendedores++;
		
			}
			
			else if(p instanceof Secretario) {
				contadorSecretarios++;
				
			}
			
			else if(p instanceof Pasante) {
				contadorPasantes++;
			
			}
		}
		
		System.out.println("=== CANTIDAD DE EMPLEADOS Y PASANTES ===");
		
		System.out.println("Cantidad de vendedores: " + contadorVendedores);
		System.out.println("Cantidad de secretarios: " + contadorSecretarios);
		System.out.println("Cantidad de pasantes: " + contadorPasantes);
	}
	
	
	

}
