package colaPrioridad;

public class diccionarioSimple implements diccionario_interface{
	
	//clase que contiene los atributos del diccionario
	public class diccionario_atributos{
		int clave;
		int valor;
	}
	
	//declaramos el array que contiene los objetos del diccionario
	
	diccionario_atributos[] diccionario;
	int cant;

	
	private int clave2Indice(int indice) {
		
		for (int i=0; i<cant; i++) {
			
			if (diccionario[i].clave == indice) {
				return diccionario[i].valor;
			}
		}
		
		return 0;
	}
	
	
	
	@Override
	public void inicializar() {
		
		diccionario = new diccionario_atributos[20];
		cant = 0;
		
	}

	@Override
	public void agregar(int clave, int valor) {
		int pos = cant;
		
		//creamos objeto para introducir en el diccionario
		diccionario_atributos par = new diccionario_atributos();
		par.clave = clave;
		par.valor = valor;
		
		//recorremos el diccionario para ver si la clave ya esta
		for (int i=0; i<cant; i++) {
			if (diccionario[i].clave == clave) {
				pos = i;
			}
		}
		
		//si la clave no existe, agregamos el objeto al final
		if (pos == cant) {
			diccionario[cant] = par;
			cant++;
		}
		
		//si la clave ya existe en el diccionario le cambiamos el valor
		else {
			diccionario[pos].valor = par.valor;
			cant++;
		}
	}

	@Override
	public void eliminar(int dato) {
		
		int pos = cant;
		
		//recorremos el diccionario para ver si la clave o valor que queremos eliminar existe en el diccionario
		
		for (int i=0; i<cant; i++) {

			//si existe guardamos su posicicon
			if (diccionario[i].clave == dato || diccionario[i].valor == dato) {
			    pos = i;
				break;
			}
		}
		
		//si pos == cant se recorrio todo el array y no se encontro el elemento a eliminar
		if (pos == cant) {
			System.out.println("El elemento no existe.");
		}
		
		else {;
			diccionario[pos] = diccionario[cant-1];
			cant--;
		}
			                                                
			                                              
		}
		

	@Override
	public int recuperar(int x) {
		
		int valor = clave2Indice(x);
		return valor;
	}

	@Override
	public int[] claves() {
		
		int[] conjunto;
		conjunto = new int[cant-1];
		
		for (int i=0; i<cant-1; i++) {
			conjunto[i] = diccionario[i].valor;
		}
		
		
		return conjunto;
	}
	
	
	public void printDiccionario() {
		
		System.out.print("[");
		for (int i=0; i<cant; i++) {
			
			if (diccionario[i] != null) {
				System.out.print(diccionario[i].clave+","+diccionario[i].valor+" + ");
			}
		}
		
		System.out.print("]");
		System.out.println();
	}



	@Override
	public boolean diccionarioVacio() {
		
		return (cant==0);
	}

}
