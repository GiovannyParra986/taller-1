package uniandes.dpoo.taller1.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import uniandes.dpoo.taller1.procesamiento.LoadMenu;
import uniandes.dpoo.taller1.modelo.*; 
import uniandes.dpoo.taller1.procesamiento.*;


public class Restaurante 

{
	public Restaurante()
	{		
	}
	
	public void IniciarPedido()
	{
		String nombreCliente = input("Digitar nombre del cliente");
		String dirreccionCliente = input("Digitar dirrecion de Cliente");		
	}
	
	public void cerrarYGuardarPedido() 
	{
		pedido = new ArrayList<Pedido>(this.IniciarPedido(null, null));
	}
	
		
	
	public void Menu()
	{
	   Map menu=LoadMenu.cargarProductos();
	   return menu ;   
			   

	}
}
	



