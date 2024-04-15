package colaPrioridad;

public class main {

	public static void main(String[] args) {
		
		//Creamos objeto de la clase colaTDA
		colaTDA cola1 = new colaTDA();
		//inicializamos la cola en el objeto que creamos
		cola1.inicializar();
		//mostramos por pantalla
		System.out.println("La cola esta vacía?:"+cola1.colaVacia());
		System.out.println(cola1.getArray());
		System.out.println(cola1.getPrio());
		System.out.println("-------------------------");
		
		//acolamos
		cola1.acolarPrioridad(4, 15);
		cola1.acolarPrioridad(8, 7);
		cola1.acolarPrioridad(7, 8);
		cola1.acolarPrioridad(1, 8);
		cola1.acolarPrioridad(8, 3);
		cola1.acolarPrioridad(3, 7);
		cola1.acolarPrioridad(3, 95);
		cola1.acolarPrioridad(5, 21);
		//mostramos por pantalla
		System.out.println("La cola esta vacía?:"+cola1.colaVacia());
		System.out.println(cola1.getArray());
		System.out.println(cola1.getPrio());
		System.out.println("-------------------------");
		
		//Mostramos los ultimos numeros de cada array
		System.out.println(cola1.primero());
		System.out.println(cola1.prioridad());
		System.out.println("-------------------------");
		
		//Desacolamos de ambas colas
		cola1.desacolar();
		System.out.println(cola1.getArray());
		System.out.println(cola1.getPrio());
		System.out.println("-------------------------");
		System.out.println(cola1.primero());
		System.out.println(cola1.prioridad());
		System.out.println("-------------------------");
		
		//acolamos un numero de prioridad alta para ver si reemplaza los que desacolamos
		cola1.acolarPrioridad(10, 400);
		System.out.println(cola1.getArray());
		System.out.println(cola1.getPrio());
		System.out.println("-------------------------");
		System.out.println(cola1.primero());
		System.out.println(cola1.prioridad());
		System.out.println("-------------------------");
		
		//acolamos un numero de prioridad 0
		cola1.acolarPrioridad(0, 2);
		
		System.out.println();
		System.out.println();

		
		// USANDO ESTRATEGIA 2
		
		//creamos un objeto de la clase cola2TDA
		
		cola2TDA cola2 = new cola2TDA();
		//inicializamos la cola 2
		cola2.inicializar();
		//mostramos por pantalla
		cola2.printArray();
		//ver si esta vacía
		System.out.println("La cola esta vacía?:"+cola2.colaVacia());
		
		
		//acolamos algunos objetos a la cola
		cola2.acolarPrioridad(5, 2);
		cola2.acolarPrioridad(2, 1);
		cola2.acolarPrioridad(7, 9);
		cola2.acolarPrioridad(5, 2);
		cola2.acolarPrioridad(8, 10);
		cola2.acolarPrioridad(6, 3);
		
		//mostramos por pantalla
		cola2.printArray();

		//mostramos primer objeto
		System.out.println(cola2.primero());
		System.out.println(cola2.prioridad());
		
		//desacolamos algunos objetos
		cola2.desacolar();
		cola2.desacolar();
		cola2.printArray();
		System.out.println(cola2.primero());
		System.out.println(cola2.prioridad());
		
		//acolamos otro objeto
		cola2.acolarPrioridad(7, 11);
		cola2.printArray();
		System.out.println(cola2.primero());
		System.out.println(cola2.prioridad());
		System.out.println("la cola esta vacia?:"+cola2.colaVacia());
		
		
		
		System.out.println();
		System.out.println();
		//USANDO CONJUNTOS---------------------------------
		
		//creamos objeto de la clase conjuntoTDA
		conjuntoTDA conjunto = new conjuntoTDA();
		//inicializamos el conjunto
		conjunto.inicializar();
		conjunto.printArray();
		System.out.println("conjunto vacio?:"+conjunto.conjuntoVacio());
		
		//metemos algunos numeros en el conjunto
		conjunto.agregar(1);
		conjunto.agregar(5);
		conjunto.agregar(6);
		conjunto.agregar(2);
		
		conjunto.printArray();
		System.out.println("conjunto vacio?:"+conjunto.conjuntoVacio());
		System.out.println(conjunto.elegir());
		
		//sacamos un numero del conjunto
		conjunto.sacar(5);
		conjunto.printArray();
		System.out.println(conjunto.elegir());
		
		//probamos el metodo pertenece
		System.out.println("pertenece el numero 2 al conjunto?:"+conjunto.pertenece(2));
		System.out.println("pertenece el numero 0 al conjunto?:"+conjunto.pertenece(0));
		
		
		
		
		

	}

}
