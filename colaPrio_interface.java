package colaPrioridad;

public interface colaPrio_interface {
	
	public void inicializar();
	
	public void acolarPrioridad(int x, int y);
	
	public void desacolar();
	
	public int primero();
	
	public int prioridad();
	
	public boolean colaVacia();
	
	public String getArray();
	
	public String getPrio();
	
	
}
