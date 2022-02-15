package uniandes.dpoo.taller1.consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import uniandes.dpoo.taller1.procesamiento.LoadMenu;
import uniandes.dpoo.taller1.modelo.Restaurante;
import uniandes.dpoo.taller1.modelo.*; 
import uniandes.dpoo.taller1.procesamiento.*;

public class Aplicacion 
{
	public void ejecutarAplicacion()
	{
		System.out.println("Aplicación Hamburguesas\n");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenuApp();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					cargarMenu();
				else if (opcion_seleccionada == 2)
					verMenu();
				else if (opcion_seleccionada == 3)
					CargarCombo();
				else if (opcion_seleccionada == 4)
				{
					System.out.println("Saliendo de la aplicaciónn ...");
					continuar = false;
				}
				else
				{
					System.out.println("Por favor seleccione una opción valida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
		
	}
	public void mostrarMenuApp()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Cargar Menu");
		System.out.println("2. Ver Menu");
		System.out.println("3. Cargar Combos");
		System.out.println("4. Salir de la aplicación \n");
	}

	public void cargarMenu()
	{
		System.out.println("\n" + "Se cargara el Menu" + "\n");
		Map menu= Restaurante.Menu();	
		int tamaño= menu.size();
			
		if  ( tamaño != 0 )
			{
				System.out.println("\n" + "El menu es el siguiente: " + "\n");
				Iterator it = menu.keySet().iterator();
				while(it.hasNext())
				     {
				      Integer key = it.next();
				      System.out.println("Producto: " + key + " -> PrecioBase: " + menu.get(key));
				     }
			
			}
			
	}	

	
	
	public void verMenu()
	{
			   
	}
	public void CargarCombo()
	{
	}
	
	
	/**
	 * Este método sirve para imprimir un mensaje en la consola pidiéndole
	 * información al usuario y luego leer lo que escriba el usuario.
	 * 
	 * @param mensaje El mensaje que se le mostrará al usuario
	 * @return La cadena de caracteres que el usuario escriba como respuesta.
	 */
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Este es el método principal de la aplicación, con el que inicia la ejecución
	 * de la aplicación
	 * 
	 * @param args Parámetros introducidos en la línea de comandos al invocar la
	 *             aplicación
	 */

	public static void main(String[] args)		
	{
		Aplicacion consola = new Aplicacion();
		consola.ejecutarAplicacion();

	}

}
