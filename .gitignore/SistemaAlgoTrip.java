package fiuba.algo3.tp1;

import java.util.LinkedHashMap;
import java.util.Map;

public class SistemaAlgoTrip
{
	private Map<String, Viaje> listaViajes = new LinkedHashMap<String, Viaje>();
	private Map<String, Ciudad> listaCiudades = new LinkedHashMap<String, Ciudad>();
	private Map<String, Hotel> listaHoteles = new LinkedHashMap<String, Hotel>();
	private Map<String, Paquete> listaPaquetes = new LinkedHashMap<String, Paquete>();
	
	private Viaje encontrarViaje(String unCodigo)
	{
		return listaViajes.get(unCodigo);
	}
	
	private Paquete encontrarPaquete(String unCodigo)
	{
		return listaPaquetes.get(unCodigo);
	}
	
	public void crearViaje (String unNombre) 
	{
		Viaje viaje = new Viaje();
		listaViajes.put(unNombre, viaje);
	}
	
	public double costoDelViaje(String unNombreViaje) 
	{
		Viaje unViaje = this.encontrarViaje(unNombreViaje);
		return unViaje.costoDeViaje();
	}
	
	public int duracionDelViaje(String unNombreViaje)
	{
		Viaje unViaje = this.encontrarViaje(unNombreViaje);
		return unViaje.duracionDeViaje();
	}
	
	public void agregarCiudad(String codigoCiudad,String nombreCiudad,String nombrePais,double latitud,double longitud)
	{
		Ciudad ciudad = new Ciudad( nombreCiudad, nombrePais, latitud, longitud);
		if (listaCiudades.containsKey(codigoCiudad)) listaCiudades.remove(codigoCiudad);
		listaCiudades.put(codigoCiudad, ciudad);
	}
	
	public void agregarVueloEnViaje(String unNombreViaje , String unCodigoCiudad, String otroCodigoCiudad, String unaFechaViaje)
	{
		Viaje unViaje = this.encontrarViaje(unNombreViaje);
		unViaje.agregarVuelo(listaCiudades, unCodigoCiudad, otroCodigoCiudad, unaFechaViaje);
	}
	
	public void agregarHotel(String unNombreHotel, String unCodigoCiudad, double costoHotel)
	{
		Hotel hotel = new Hotel(costoHotel);
		listaHoteles.put(unNombreHotel, hotel);
	}
	
	public void agregarEstadiaEnViaje(String unNombreViaje, String unNombreHotel , String unaFechaInicioEstadia, String unaFechaFinEstadia)
	{
		Viaje unViaje = this.encontrarViaje(unNombreViaje);
		unViaje.agregarEstadia(listaHoteles, unNombreHotel, unaFechaInicioEstadia, unaFechaFinEstadia);
	}
	
	public void agregarAsistenciaAlViajeroAlViaje( String unNombreViaje)
	{
		Viaje unViaje = this.encontrarViaje(unNombreViaje);
		unViaje.agregarAsistenciaAlViajero();
	}
	
	public void solicitarComidaEspecialAbordoPara(String unNombreViaje)
	{
		Viaje unViaje = this.encontrarViaje(unNombreViaje);
		unViaje.solicitarComidaEspecialAbordo();
	}
	
	public void agregarPaquete(String unNombrePaquete)
	{
		Paquete paquete = new Paquete();
		listaPaquetes.put(unNombrePaquete,paquete);
	}
	
	public void agregarVueloEnPaquete(String unNombrePaquete , String unCodigoCiudad, String otroCodigoCiudad, String unaFechaViaje)
	{
		Paquete unPaquete = this.encontrarPaquete(unNombrePaquete);
		unPaquete.agregarVuelo(listaCiudades, unCodigoCiudad, otroCodigoCiudad, unaFechaViaje);
	}
	
	public void agregarEstadiaEnPaquete(String unNombrePaquete, String unNombreHotel ,String unaFechaInicioEstadia, String unaFechaFinEstadia)
	{
		Paquete unPaquete = this.encontrarPaquete(unNombrePaquete);
		unPaquete.agregarEstadia(listaHoteles, unNombreHotel, unaFechaInicioEstadia, unaFechaFinEstadia);
	}
	
	public void agregarPaqueteEnViaje(String unNombreViaje, String unNombrePaquete)
	{
		Viaje unViaje = this.encontrarViaje(unNombreViaje);
		Paquete unPaquete = this.encontrarPaquete(unNombrePaquete);
		unViaje.agregarPaquete(unPaquete);
	}
}