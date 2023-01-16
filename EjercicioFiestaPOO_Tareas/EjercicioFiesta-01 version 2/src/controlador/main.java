package controlador;
import java.util.Scanner;

import modelo.Fiesta;

public class main {
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bocadillos;
		int bebidas;
		double precioFiesta2;
		double precioFiesta3;
		String tipo;
		String fechaHora;
		String direccion;
		String descripcionFiesta1;
		String descripcionFiesta2;
		String descripcionFiesta3;
		int invitaciones;
		
		//Creamos un primer objeto de la clase Fiesta usando el constructor por defecto:
		
		Fiesta f1=new Fiesta();
		descripcionFiesta1=f1.consultar();
		//Comprobamos el metodo consultar con los datos de la fiesta f1:
		System.out.println(descripcionFiesta1);
		
		//Ahora vamos a crear una segunda fiesta con el otro constructor pasandole valores como argumento:
		
		Fiesta f2=new Fiesta("infantil","07/08/2024, 20.00h","C/José Pérez,9",7,8);
		descripcionFiesta2=f2.consultar();
		System.out.println(descripcionFiesta2);//Conmprobamos que efectivamente hay 0 invitados
		//Por defecto, en este constructor tenemos 0 invitados, por lo que debemos hacer uso del metodo invitar tantas veces como invitados queramos en la fiesta
		f2.invitar();
		f2.invitar();
		f2.invitar();
		f2.invitar();
		f2.invitar();
		f2.invitar();
		//Comprobamos que hay 6 invitados:
		descripcionFiesta2=f2.consultar();
		System.out.println(descripcionFiesta2);
		//Pero ahora nos damos cuenta de que una invitacion no la queriamos mandar
		//Pues usaremos el metodo cancelarInvitacion para eliminarla:
		f2.cancelarInvitacion();
		descripcionFiesta2=f2.consultar();
		System.out.println(descripcionFiesta2);
		
		//Por ultimo ya solo nos quedaria calcular el precio total de la fiesta
		
		precioFiesta2=f2.precioFiesta(f2.getInvitados(), f2.getBebidas(), f2.getBocadillos());
		System.out.println("El coste total de la fiesta será de: "+precioFiesta2+"€");
		
		//Tambien podemos crear una fiesta de una tercera manera: mediante metodos setters y getters:
		
		System.out.println("Hola usuario, ¿de qué tipo será la fiesta 3?:");
		tipo=sc.nextLine();
		System.out.println("¿Cuándo tendrá lugar?");
		fechaHora=sc.nextLine();
		System.out.println("¿Dónde se celebrará?");
		direccion=sc.nextLine();
		System.out.println("¿Cuántos bocadillos habrá?");
		bocadillos=sc.nextInt();
		System.out.println("¿Cuántas bebidas habrá?");
		bebidas=sc.nextInt();
		
		Fiesta f3=new Fiesta();
		
		f3.setTipo(tipo);
		f3.setFechaHora(fechaHora);
		f3.setDireccion(direccion);
		f3.setBocadillos(bocadillos);
		f3.setBebidas(bebidas);
		
		//Y ahora con el metodo invitar sobrecargado mandamos varias invitaciones a la vez:
		
		System.out.println("¿Cuántas invitaciones quieres enviar?");
		invitaciones=sc.nextInt();
		f3.invitar(invitaciones);
		
		//Consultamos los detalles de la fiesta 3
		descripcionFiesta3=f3.consultar();
		System.out.println(descripcionFiesta3);
		
		//Calculamos el coste total de f3
		precioFiesta3=f3.precioFiesta(f3.getInvitados(), f3.getBebidas(), f3.getBocadillos());
		System.out.println("El coste total de la fiesta será de: "+precioFiesta3+"€");
		
		//Consultamos cuantas fiestas hay previstas con el atributo contadorFiestas
		System.out.println("Nº de fiestas organizadas hasta ahora: "+Fiesta.getContadorFiestas());
		
	}

}
