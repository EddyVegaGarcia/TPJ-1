package fiuba.algo3.tp1;

public class VueloDomestico extends EstadoVuelo
{
	private double costoPorKilometro = 1;

	@Override
	public double costoTotalPorKilometro(double unaDistanciaTotal)
	{
		return unaDistanciaTotal*costoPorKilometro;
	}
	
}