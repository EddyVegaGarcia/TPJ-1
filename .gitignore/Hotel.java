package fiuba.algo3.tp1;

public class Hotel
{
	private double costo = 0;
	
	public Hotel(double unCoste) 
	{
		costo = unCoste;
	}
	
	public double costoTotal(int unaDuracionEstadia)
	{
		return costo*unaDuracionEstadia;
	}
}