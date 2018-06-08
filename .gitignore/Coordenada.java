package fiuba.algo3.tp1;

public class Coordenada
{
	private double latitud;
	private double longitud;
	private static final int RADIO_TERRESTRE = 6371;
	
	public Coordenada(double unaLatitud, double unaLongitud)
	{
		latitud =  unaLatitud;
		longitud = unaLongitud;
	}
	
	public double distanciaTotal(Coordenada unaCoordenada)
	{
		double latitud1 = Math.toRadians(this.latitud);
		double longitud1 = Math.toRadians(this.longitud);
		
		double latitud2 = Math.toRadians(unaCoordenada.latitud);
		double longitud2 = Math.toRadians(unaCoordenada.longitud);
		
		return 2 * RADIO_TERRESTRE * 
		        Math.asin(Math.sqrt(
		        Math.pow(Math.sin((latitud2 - latitud1) / 2), 2)
		        + (Math.cos(latitud1) * Math.cos(latitud2) *
		        Math.pow(Math.sin((longitud2 - longitud1) / 2), 2))));
		
	}
	
	public double latitud()
	{
		return latitud;
	}
	
	public double longitud()
	{
		return longitud;
	}
}