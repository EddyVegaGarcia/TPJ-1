package fiuba.algo3.tp1;

import java.lang.String;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
import java.util.Map;

public class Viaje 
{	
	private SistemaVuelo sistemaVuelo= new SistemaVuelo();
	private SistemaEstadia sistemaEstadia = new SistemaEstadia();
	private Asistencia asistencia = new Asistencia();
	private int comidaEspecialABordo;
	
	private SistemaPaquete sistemaPaquete = new SistemaPaquete();
//	private List<Paquete> listaPaquetes = new LinkedList<Paquete>();
//	private double costoTotal = 0;
//	private int duracionTotal = 0;
	
	private String inicioDeViaje = "9999-99-99", finalDeViaje = "0000-00-00";
	Fecha fechaInicioDeViaje, fechaFinalDeViaje;
	
	public void guardarFechas(String unaFecha, String otraFecha)
	{
		this.crearFechas();
		inicioDeViaje = fechaInicioDeViaje.menorFechaConFecha(unaFecha);
		finalDeViaje = fechaFinalDeViaje.mayorFechaConFecha(otraFecha);
	}

	public void crearFechas()
	{
		fechaInicioDeViaje = new Fecha(inicioDeViaje);
		fechaFinalDeViaje = new Fecha(finalDeViaje);
	}
	
	public void agregarVuelo(Map<String, Ciudad> unaListaCiudades, String unCodigoCiudad, String otroCodigoCiudad, String unaFechaViaje)
	{
		this.guardarFechas(unaFechaViaje, unaFechaViaje);
		sistemaVuelo.agregarVuelo( unaListaCiudades, unCodigoCiudad, otroCodigoCiudad, unaFechaViaje);
	}
	
	public double costoViajeSencillo()
	{
		return sistemaVuelo.costoDeViaje();
	}
	
	public double costoDeEstadia()
	{
		return sistemaEstadia.costoDeEstadia();
	}
	
	public double costoPorVuelo()
	{
		return asistencia.costoPorASistencia(this.costoViajeSencillo(), this.costoDeEstadia(), sistemaEstadia.duracionDeEstadia());
	}
	
	public double costoPorComidaEspecialPorVuelo()
	{
		return sistemaVuelo.costoPorComidaEspecialPorVuelo(comidaEspecialABordo);
	}
	
//	public void obtenerCostoyDuracionSiHayPaquete()
//	{
//		if(listaPaquetes.size() > 0)
//		{
//			Iterator<Paquete> iter = listaPaquetes.iterator();
//			costoTotal = 0;
//			duracionTotal = 0;
//			
//			while(iter.hasNext())
//			{
//				Paquete unPaquete = iter.next();
//				costoTotal = costoTotal + unPaquete.costoDePaquete();
//				duracionTotal = duracionTotal + unPaquete.duracionDeViajeSencillo();
//			}
//		}
//		
//		else 
//		{
//			costoTotal = this.costoPorVuelo() + this.costoPorComidaEspecialPorVuelo();
//			duracionTotal = this.duracionDeViajeSencillo();
//		}
//	}
//	
//	public int duracionDeViajeSencillo()
//	{
//		this.crearFechas();
//		return fechaFinalDeViaje.duracionEndiasConFecha(fechaInicioDeViaje.obtenerFecha());
//	}
	
	public double costoDeViaje() 
	{	
		return this.costoPorVuelo() + this.costoPorComidaEspecialPorVuelo() + this.sistemaPaquete.costoDeViaje();
//		this.obtenerCostoyDuracionSiHayPaquete();
//		return costoTotal;
	}
	
	public int duracionDeViaje()
	{
		int duracionTotal;
		if (sistemaPaquete.sizeLista() > 0) duracionTotal = sistemaPaquete.duracionDeViajeJuntoAPaquete(inicioDeViaje, finalDeViaje);
		else {
			this.crearFechas();
			duracionTotal = fechaFinalDeViaje.duracionEndiasConFecha(fechaInicioDeViaje.obtenerFecha());
		}
		return duracionTotal;
		//		this.obtenerCostoyDuracionSiHayPaquete();
//		return duracionTotal;
	}
	
	public void agregarEstadia(Map<String, Hotel> unaListaHoteles, String unNombreHotel, String unaFechaInicioEstadia, String unaFechaFinEstadia)
	{
		this.guardarFechas(unaFechaInicioEstadia, unaFechaFinEstadia);
		sistemaEstadia.agregarEstadia(unaListaHoteles, unNombreHotel, unaFechaInicioEstadia, unaFechaFinEstadia);
	}
	
	public void agregarAsistenciaAlViajero()
	{
		this.asistencia.asistenciaActivada();
	}
	
	public void solicitarComidaEspecialAbordo()
	{
		comidaEspecialABordo = 100;
	}
	
	public void agregarPaquete(Paquete unPaquete)
	{
		sistemaPaquete.agregarPaquete(unPaquete);
//		listaPaquetes.add(unPaquete);
	}
}