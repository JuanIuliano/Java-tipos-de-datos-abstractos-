package colaPrioridad;
import java.util.Arrays;

public class conjuntoTDA implements conjuntoInterface {
	
	//inicializar conjunto
	int[] conjunto;
	int index;

	@Override
	public void inicializar() {
		
		conjunto = new int[10];
		index = 0;
		
	}

	@Override
	public void agregar(int x) {
		
		//primero recorremos el conjunto para verificar que no este repetido
		
		for (int i=0; i<index; i++) {
			if(conjunto[i] == x) {
				System.out.println("el numero ya se encuentra en el conjunto");
				break;
			}
		}
		conjunto[index] = x;
		index++;
		
	}

	@Override
	public int elegir() {
		
		return conjunto[index-1];
	}

	@Override
	public boolean conjuntoVacio() {
		
		return (index == 0);
	}

	@Override
	public void sacar(int x) {
		
		for (int i=0; i<index; i++) {
			
			if (conjunto[i] == x) {
				conjunto[i] = conjunto[index-1];
				index--;
			}
		}
		
	}

	@Override
	public boolean pertenece(int x) {
		
		for (int z=0; z<index; z++) {
			
			if (conjunto[z] == x) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void printArray() {
		
		String conjunto_s = Arrays.toString(conjunto);
		
		System.out.println(conjunto_s);
	}
	
	

}
