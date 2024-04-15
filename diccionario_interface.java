package colaPrioridad;

public interface diccionario_interface {
	
	public void inicializar();
	
	public void agregar(int clave, int valor);
	
	public void eliminar(int dato);
	
	public int recuperar(int x);
	
	public int[] claves();
	
	public boolean diccionarioVacio();
}
