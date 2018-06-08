package fiuba.algo3.tp1;

public class VueloInternacional extends EstadoVuelo
{
	private double costoPorKilometro = 1.5;
	private double impuesto = 0.05;
	
	@Override
	public double costoTotalPorKilometro(double unaDistanciaTotal)
	{
		return unaDistanciaTotal*costoPorKilometro*(1 + impuesto);
	}
	
}