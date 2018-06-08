package fiuba.algo3.tp1;

public class PaisCambiado extends Cambio
{
	@Override
	public PaisSinCambiar cambiar()
	{
		return new PaisSinCambiar();
	}
	
	@Override
	public PaisSinCambiar inmigrar(Vuelo vuelo)
	{
		vuelo.conEstado(new VueloDomestico());
		return new PaisSinCambiar();
	}
	
	@Override
	public void emigrar(Vuelo vuelo)
	{
		vuelo.conEstado(new VueloInternacional());
	}
}