package fiuba.algo3.tp1;

public class Asistencia
{
	private EstadoAsistencia estado = new AsistenciaNoActivada();
	
	public void asistenciaActivada()
	{
		estado = new AsistenciaActivada();
	}
	
	public double costoPorASistencia(double unCostoPorVuelo, double unCostoPorEstadia, int unaDuracionDeDiasDeEstadia)
	{
		return estado.costoPorAsistencia(unCostoPorVuelo, unCostoPorEstadia, unaDuracionDeDiasDeEstadia);
	}
}