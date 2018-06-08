package fiuba.algo3.tp1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SistemaPaquete
{
	private List<Paquete> listaPaquetes = new LinkedList<Paquete>();
	
	private double costoTotal = 0;
	private int duracionTotal = 0;
	private String inicioDeViajeAComparar = "9999-99-99";
	private String finalDeViajeAComparar = "0000-00-00";
	
	private void recorrerListaPaquete()
	{
		Iterator<Paquete> iter = listaPaquetes.iterator();
		costoTotal = 0;
		duracionTotal = 0;
		
		while(iter.hasNext())
		{
			Paquete unPaquete = iter.next();
			costoTotal = costoTotal + unPaquete.costoDePaquete();
			unPaquete.crearFechas();
			unPaquete.guardarFechas(inicioDeViajeAComparar, finalDeViajeAComparar);
			duracionTotal = unPaquete.duracionDePaquete();
		}
	}
	
	public void agregarPaquete(Paquete unPaquete)
	{
		listaPaquetes.add(unPaquete);
	}
	
	public double costoDeViaje()
	{
		this.recorrerListaPaquete();
		return costoTotal;
	}
	
	public int duracionDeViajeJuntoAPaquete(String unInicioDeViaje, String unFinalDeViaje)
	{
		inicioDeViajeAComparar = unInicioDeViaje;
		finalDeViajeAComparar = unFinalDeViaje;
		this.recorrerListaPaquete();
		return duracionTotal;
	}
	
	public int sizeLista()
	{
		return listaPaquetes.size();
	}
}