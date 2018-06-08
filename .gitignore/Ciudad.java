package fiuba.algo3.tp1;

public class Ciudad
{
	private String nombreCiudad;
	private String nombrePais;
	private Coordenada coordenada;
	
	Ciudad(String unNombreCiudad,String unNombrePais,double unaLatitud,double unaLongitud)
	{
		nombreCiudad = unNombreCiudad;
		nombrePais = unNombrePais;
		coordenada = new Coordenada(unaLatitud, unaLongitud);
	}
	
	public boolean mismoPais(String unPais)
	{
		return (this.nombrePais == unPais);
	}
	
	public String pais()
	{
		return this.nombrePais;
	}
	
	public double distanciaCon(Coordenada unaCoordenada)
	{
		return coordenada.distanciaTotal(unaCoordenada);
	}
	
	public Coordenada obtenerCoordenada()
	{
		return coordenada;
	}
}