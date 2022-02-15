package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;

import uniandes.dpoo.taller1.procesamiento.Producto;

public class Combo implements Producto
{
	private String nombreCombo;
	private double descuento;
	private ArrayList<ProductoMenu> itemsCombo;
	private ProductoMenu precioBase;
	
	public Combo(String pNombre, double descuento)
	{
		nombreCombo=pNombre;
		this.descuento=descuento;
		itemsCombo= new ArrayList<ProductoMenu>();
	}
	
	public void agregarItemACombo(Producto itemCombo)
	{
		itemsCombo.add((ProductoMenu) itemCombo);
	}
	
	public int getPrecio() 
	{
		return precioBase.getPrecio();
	}
	
	public String getNombre() 
	{
		return nombreCombo;
	}

	public String generarTextoFactura() 
	{
		return itemsCombo+" : "+precioBase.getPrecio()+descuento;
	}
}
