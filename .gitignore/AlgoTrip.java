package fiuba.algo3.tp1;

import java.lang.String;

public class AlgoTrip 
{
	
	private SistemaAlgoTrip sistema = new SistemaAlgoTrip();
		
	public void crearViaje (String unNombre) 
	{
		sistema.crearViaje(unNombre);
	}
	
	public void agregarCiudad(String codigoCiudad,String nombreCiudad,String nombrePais,double latitud,double longitud)
	{		
		sistema.agregarCiudad(codigoCiudad,nombreCiudad,nombrePais,latitud,longitud);
	}
	
	public void agregarVueloEnViaje(String unNombreViaje , String unCodigoCiudad, String otroCodigoCiudad, String unaFechaViaje)
	{		
		sistema.agregarVueloEnViaje(unNombreViaje , unCodigoCiudad, otroCodigoCiudad, unaFechaViaje);
	}
	
	public double obtenerCostoDelViaje(String unNombreViaje) 
	{		
		return sistema.costoDelViaje(unNombreViaje);
	}
	
	public int obtenerDuracionEnDiasDelViaje(String unNombreViaje)
	{		
		return sistema.duracionDelViaje(unNombreViaje);
	}
	
	public void agregarHotel(String unNombreHotel, String unCodigoCiudad, double costoHotel)
	{
		sistema.agregarHotel( unNombreHotel, unCodigoCiudad, costoHotel);
	}
	
	public void agregarEstadiaEnViaje(String unNombreViaje, String unNombreHotel , String unaFechaInicioEstadia, String unaFechaFinEstadia)
	{
		sistema.agregarEstadiaEnViaje(unNombreViaje, unNombreHotel, unaFechaInicioEstadia, unaFechaFinEstadia);
	}
	
	public void agregarAsistenciaAlViajeroAlViaje(String unNombreViaje)
	{
		sistema.agregarAsistenciaAlViajeroAlViaje(unNombreViaje);
	}
	
	public void solicitarComidaEspecialAbordoPara(String unNombreViaje)
	{
		sistema.solicitarComidaEspecialAbordoPara(unNombreViaje);
	}
	
	public void agregarPaquete(String unNombrePaquete)
	{
		sistema.agregarPaquete(unNombrePaquete);
	}
	
	public void agregarVueloEnPaquete(String unNombrePquete , String unCodigoCiudad, String otroCodigoCiudad, String unaFechaViaje)
	{
		sistema.agregarVueloEnPaquete(unNombrePquete , unCodigoCiudad, otroCodigoCiudad, unaFechaViaje);
	}
	
	public void agregarEstadiaEnPaquete(String unNombrePaquete, String unNombreHotel ,String unaFechaInicioEstadia, String unaFechaFinEstadia)
	{
		sistema.agregarEstadiaEnPaquete(unNombrePaquete, unNombreHotel, unaFechaInicioEstadia, unaFechaFinEstadia);
	}
	
	public void agregarPaqueteEnViaje(String unNombreViaje, String unNombrePaquete)
	{
		sistema.agregarPaqueteEnViaje(unNombreViaje, unNombrePaquete);
	}
}
