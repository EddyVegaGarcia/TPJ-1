package fiuba.algo3.tp1;

public class Estadia
{
	private int duracionEstadia =0;
	private String nombreHotel;
	private Fecha fechaInicialEstadia;
	private Fecha fechaFinalEstadia;
	
	public Estadia(String unNombreHotel, String unaFechaInicialEstadia, String unaFechaFinalEstadia)
	{
		nombreHotel = unNombreHotel;
		fechaInicialEstadia = new Fecha(unaFechaInicialEstadia);
		fechaFinalEstadia = new Fecha(unaFechaFinalEstadia);
	}
	
	private void duracionEstadiaTotal()
	{
		duracionEstadia = this.fechaFinalEstadia.duracionEnNochesCOnFecha(fechaInicialEstadia.obtenerFecha());
	}
	
	public int obtenerDuracionEstadia()
	{
		this.duracionEstadiaTotal();
		return duracionEstadia;
	}
	
	public String obtenerNombreHotel()
	{
		return nombreHotel;
	}
}