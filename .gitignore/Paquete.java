package fiuba.algo3.tp1;

public class Paquete extends Viaje
{
	private double descuentoVuelo, descuentoEstadia;
	
	public Paquete()
	{
		super();
		descuentoVuelo = 0.1;
		descuentoEstadia = 0.2;
	}
	
	public double costoDePaquete()
	{
		return ((1 - descuentoVuelo) * this.costoViajeSencillo()) + ((1 - descuentoEstadia) * this.costoDeEstadia());
	}
	
	public int duracionDePaquete()
	{
		this.crearFechas();
		return fechaFinalDeViaje.duracionEndiasConFecha(fechaInicioDeViaje.obtenerFecha());
	}
}