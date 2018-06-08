package fiuba.algo3.tp1;

public class Vuelo
{
	private EstadoVuelo estadoVuelo = new VueloDomestico();
	private Fecha fechaVuelo;
	private double distanciaTotalVuelo = 0;
	private String ciudadPartida;
	private String ciudadDestino;
	
	public void conEstado(EstadoVuelo nuevoEstado)
	{
		estadoVuelo = nuevoEstado;
	}
	
	public Vuelo( String unaCiudadPartida, String unaCiudadDestino, String unaFechaViaje) 
	{
		ciudadPartida = unaCiudadPartida;
		ciudadDestino = unaCiudadDestino;
		fechaVuelo = new Fecha(unaFechaViaje);
	}
	
	public void nuevaDistancia(double unaDistancia)
	{
		distanciaTotalVuelo = unaDistancia;
	}
	
	public double costoVuelo()
	{
		return estadoVuelo.costoTotalPorKilometro(distanciaTotalVuelo);
	}
	
	public String ciudadPartida()
	{
		return ciudadPartida;
	}
	
	public String ciudadDestino()
	{
		return ciudadDestino;
	}
	
	public Fecha obtenerFecha()
	{
		return this.fechaVuelo;
	}
	
	public int duracionConFecha(Fecha unaFechaVuelo)
	{
		return this.fechaVuelo.duracionEndiasConFecha(unaFechaVuelo.obtenerFecha());
	}
	
}