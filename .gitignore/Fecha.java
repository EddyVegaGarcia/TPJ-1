package fiuba.algo3.tp1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Fecha
{
	private String fecha;
	private int diferenciaDeDias;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date fechaInicial, fechaFinal = null;
	
	private void cambioADate(String unaFechaInicial)
	{
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		
		fechaInicial = null;
		try {
			fechaInicial = dateFormat.parse(unaFechaInicial);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fechaFinal = null;
		try {
			fechaFinal = dateFormat.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void diferenciaDeDiasTotales(String unaFechaInicial)
	{
		this.cambioADate(unaFechaInicial);
		if(!(unaFechaInicial == "9999-99-99"))
			diferenciaDeDias = (int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
		else diferenciaDeDias = -1;
	}
	
	public Fecha(String unaFecha)
	{
		fecha = unaFecha;
	}
	
	public int duracionEndiasConFecha(String unaFechaInicial)
	{
		this.diferenciaDeDiasTotales(unaFechaInicial);
		return diferenciaDeDias + 1;
	}
	
	public int duracionEnNochesCOnFecha(String unaFechaInicial)
	{
		this.diferenciaDeDiasTotales(unaFechaInicial);
		return diferenciaDeDias;
	}
	
	public String obtenerFecha()
	{
		return fecha;
	}
	
	public String menorFechaConFecha(String unaFecha)
	{
		this.cambioADate(unaFecha);
		String fechaMenor;
		if((fechaFinal.getTime()-fechaInicial.getTime()) > 0) fechaMenor = unaFecha;
		else fechaMenor = this.obtenerFecha();
		return fechaMenor;
	}
	
	public String mayorFechaConFecha(String unaFecha)
	{
		this.cambioADate(unaFecha);
		String fechaMayor;
		if((fechaFinal.getTime()-fechaInicial.getTime()) < 0) fechaMayor = unaFecha;
		else fechaMayor = this.obtenerFecha();
		return fechaMayor;
	}
	
}