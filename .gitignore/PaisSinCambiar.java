package fiuba.algo3.tp1;

public class PaisSinCambiar extends Cambio
{
	@Override
	public PaisCambiado cambiar()
	{
		return new PaisCambiado();
	}
	
	@Override
	public PaisSinCambiar inmigrar(Vuelo vuelo)
	{
		vuelo.conEstado(new VueloDomestico());
		return this;
	}
	
	@Override
	public void emigrar(Vuelo vuelo)
	{
		vuelo.conEstado(new VueloDomestico());
	}
}