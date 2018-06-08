package fiuba.algo3.tp1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SistemaVuelo
{
	private List<Vuelo> listaVuelos = new LinkedList<Vuelo>();
	private Map<String, Ciudad> listaCiudades = new LinkedHashMap<String, Ciudad>();
	
	private double costoTotal = 0;
	private int duracionTotal = 0;
	
	private Cambio cambio = new PaisSinCambiar();
	
	private void recorrerListaVuelos()
	{
		Iterator<Vuelo> iter = listaVuelos.iterator();
		int iterador = 0;
		costoTotal = 0;
		duracionTotal = 0;
		Fecha fechaVueloInicial = new Fecha("0000-00-00");
		
		while(iter.hasNext())
		{
			Vuelo vuelo = iter.next();
			verificarDatos(vuelo);
			costoTotal = costoTotal + vuelo.costoVuelo();
			if(iterador == 0)
			{
				duracionTotal = 1;
				fechaVueloInicial = vuelo.obtenerFecha();
				iterador = 1;
			}
			else duracionTotal = vuelo.duracionConFecha( fechaVueloInicial);
			
		}
	}
	
	private void compararPaises (Ciudad unaCiudadPartida, Ciudad unaCiudadDestino, Vuelo vuelo)
	{
		if (!unaCiudadDestino.mismoPais(unaCiudadPartida.pais())) { cambio.cambiar().emigrar(vuelo);}
	}
	
	private void verificarDatos(Vuelo unVuelo)
	{
		Ciudad ciudadPartida = listaCiudades.get(unVuelo.ciudadPartida());
		Ciudad ciudadDestino = listaCiudades.get(unVuelo.ciudadDestino());
		unVuelo.nuevaDistancia(ciudadDestino.distanciaCon(ciudadPartida.obtenerCoordenada()));
		this.compararPaises(ciudadPartida, ciudadDestino, unVuelo);
	}
	
	
	public void agregarVuelo(Map<String, Ciudad> unaListaCiudades, String unCodigoCiudad, String otroCodigoCiudad, String unaFechaViaje)
	{
		listaCiudades = unaListaCiudades;
		Vuelo vuelo = new Vuelo( unCodigoCiudad, otroCodigoCiudad, unaFechaViaje);
		this.verificarDatos(vuelo);
		listaVuelos.add(vuelo);
	}
	
	public double costoDeViaje() 
	{
		this.recorrerListaVuelos();
		return costoTotal;
	}
	
	public int duracionDeViaje()
	{
		this.recorrerListaVuelos();
		return duracionTotal;
	}
	
	public int costoPorComidaEspecialPorVuelo(int unCostoPorLaComida)
	{
		return listaVuelos.size()*unCostoPorLaComida;
	}
}