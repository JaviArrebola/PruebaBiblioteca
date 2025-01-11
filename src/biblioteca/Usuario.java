package biblioteca;

public class Usuario {
	private String nombre;
	private String IdUsuario;
	private String rol;
	private Libro[] librosPrestados;
	
	public Usuario(String nombre, String IdUsuario, String rol)
	{
		this.nombre = nombre;
		this.IdUsuario = IdUsuario;
		switch(rol.toLowerCase())
		{
		case "estudiante":
			this.rol = "estudiante";
			librosPrestados = new Libro[3];
			break;
		
		case "profesor":
			this.rol = "profesor";
			librosPrestados = new Libro[5];
			break;
		
		case "invitado":
			librosPrestados = new Libro[1];
			break;
		
		default:
			this.rol = null;
			librosPrestados = new Libro[0];
			break;
		}
		
	}
	
	 public void registrarUsuario(String nombre, String IdUsuario, String rol)
	 {
		 rol = rol.toLowerCase();
		 switch (rol)
		 {
		 case "estudiante":
			 break;
			
		 case "profesor":
			 break;
			 
		 case "invitado":
			 break;
			 
		default:
			System.out.println("Error: Rol Incorrecto.No se puede realizar el registro");
			return;
			 
		 }
	 }
	 
	 public void listarUsuarios(Usuario[] usuario)
	 {
		 for (int i = 0; i < usuario.length; i++)
		 {
			if (usuario[i] != null)
			{
				System.out.println(usuario[i].nombre);
			}
		} 
	 }
	 
	 public verificarPrestamo()
	 {
		 
	 }
	 

}
