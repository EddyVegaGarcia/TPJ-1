package fiuba.algo3.tp1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SistemaEstadia
{
	private List<Estadia> listaEstadias = new LinkedList<Estadia>();
	private Map<String, Hotel> listaHoteles = new LinkedHashMap<String, Hotel>();
	
	private double costoTotal = 0;
	private int duracionTotal = 0;
	
	private void recorrerListaEstadias()
	{
		Iterator<Estadia> iter = listaEstadias.iterator();

		costoTotal = 0;
		duracionTotal = 0;
		
		while(iter.hasNext())
		{
			Estadia estadia = iter.next();
			Hotel hotel = listaHoteles.get(estadia.obtenerNombreHotel());
			costoTotal = costoTotal + hotel.costoTotal(estadia.obtenerDuracionEstadia());
			duracionTotal = duracionTotal + estadia.obtenerDuracionEstadia();		
		}
	}
	
	
	public void agregarEstadia(Map<String, Hotel> unaListaHoteles, String unNombreHotel, String unaFechaInicioEstadia, String unaFechaFinEstadia)
	{
		listaHoteles = unaListaHoteles;
		Estadia estadia = new Estadia( unNombreHotel, unaFechaInicioEstadia, unaFechaFinEstadia);
		listaEstadias.add(estadia);
	}
	
	public double costoDeEstadia() 
	{
		this.recorrerListaEstadias();
		return costoTotal;
	}
	
	public int duracionDeEstadia()
	{
		this.recorrerListaEstadias();
		return duracionTotal;
	}
	
}