package colaPrioridad;

import java.util.Arrays;

public class colaTDA implements colaPrio_interface {
	
	//Variables
	public int[] array;
	public int[] prioridades;
	public int index;
	
	@Override
	public void inicializar() {
		//crear el vector
		array = new int[10];
		prioridades = new int[10];
		index = 0;
		
	}

	@Override
	public void acolarPrioridad(int prio, int num) {
		//x es la prioridad, y es el numero a acolar
		
		//recorremos el array de prioridades hasta encontrar un numero mayor que x
		int indexPrio = index;
		
		for (int i=0; i<index-1; i++) {
			
			if (prioridades[i] > prio) {
				 indexPrio = i;
				 break;
			}
		}
		// Si no hay un numero de mayor prioridad que x, simplemente acolamos al final
		if (index == indexPrio) {
			prioridades[index] = prio;
			array[index] = num;
			index++;
		}
		
		//si hay un numero con mayor prioridad que x:
		else {
			//movemos a la derecha todos los numeros con prioridad mayor a x
			for (int k = index; k>indexPrio; k--) {
				prioridades[k] = prioridades[k-1];
				array[k] = array[k-1];
			}
			//acolamos en la posicion correspondiente
			array[indexPrio] = num;
			prioridades[indexPrio] = prio;
			index++;
		}
	}

	@Override
	public void desacolar() {
		index--;
		
	}

	@Override
	public int primero() {
		
		return array[index-1];
	}

	@Override
	public int prioridad() {
		
		return prioridades[index-1];
	}

	@Override
	public boolean colaVacia() {
		
		return (index == 0);
	}

	@Override
	public String getArray() {
		String newArray = Arrays.toString(array);
		return newArray;
	}
	
	@Override
	public String getPrio() {
		String newPrio = Arrays.toString(prioridades);
		return newPrio;
	}

}
