package enumeration.sistemacliente;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(1, "Andre", "20/09/1987", EstadoCivil.DIVORCIADO);
		
		System.out.println(c1);
		
		c1.alterarEstadoCivil(EstadoCivil.SOLTEIRO);
		
		System.out.println(c1);

	}
}
