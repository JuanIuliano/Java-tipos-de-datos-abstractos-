package colaPrioridad;

public interface conjuntoInterface {
	
	public void inicializar();
	
	public void agregar(int x);
	
	public int elegir();
	
	public boolean conjuntoVacio();
	
	public void sacar(int x);
	
	public boolean pertenece(int x);
	
	public void printArray();
}
