package fiuba.algo3.tp1;

public abstract class Cambio
{
	public abstract Cambio cambiar();
	public abstract PaisSinCambiar inmigrar(Vuelo vuelo);
	public abstract void emigrar(Vuelo vuelo);
}