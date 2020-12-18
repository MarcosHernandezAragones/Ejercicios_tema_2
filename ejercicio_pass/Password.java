package ejercicio_pass;

public class Password {
	
	private int longitud;
	private String contraseña;
	
	
	public Password(int longitud, String contraseña) {
		this.longitud = longitud;
		this.contraseña = contraseña;
	}


	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}
	
	
	
	
}
