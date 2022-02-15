package uniandes.dpoo.taller1.procesamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import uniandes.dpoo.taller1.modelo.ProductoMenu;

public class LoadMenu
{

	public Map cargarProductos()
	{ 
		Map <String,ProductoMenu> menu = new HashMap<>();

		
		BufferedReader br = new BufferedReader(new FileReader("menu.txt"));
		String linea = br.readLine(); 
		linea = br.readLine();
		while (linea != null) 
		{
			// Separar los valores que estaban en una linea
			String[] partes = linea.split(";");
			String nombreProducto = partes[0];
			int precioBase = Integer.parseInt(partes[1]);
		    
			if ( menu.get(nombreProducto)== null )
		    	{
				 ProductoMenu producto = new ProductoMenu(nombreProducto,precioBase);
				 menu.put(nombreProducto,producto);
		    	}
					
		 linea = br.readLine(); // Leer la siguiente linea
	    }
		
		br.close();    
        return menu;
	}  
}

