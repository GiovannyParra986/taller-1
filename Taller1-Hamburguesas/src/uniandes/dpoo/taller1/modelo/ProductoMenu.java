package uniandes.dpoo.taller1.modelo;

import uniandes.dpoo.taller1.procesamiento.Producto;

public class ProductoMenu implements Producto
{
	private String nombre;
	
	private int precioBase;
	
	public ProductoMenu(String pNombre, int pPrecio) 
	{
		nombre=pNombre;
		precioBase=pPrecio;
	}

	public int getPrecio() {
		// TODO Auto-generated method stub
		return precioBase;
	}

	
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}


	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return nombre+""+precioBase;
	}
}
