package fiuba.algo3.tp1;

public class AsistenciaActivada extends EstadoAsistencia
{
	
	private double asistenciaPorVuelo = 0.1;
	private int asistenciaPorEstadia = 30;
	
	@Override
	public double costoPorAsistencia(double unCostoPorVuelo, double unCostoPorEstadia, int unaDuracionDeDiasDeEstadia)
	{
		return (unCostoPorVuelo*(1+asistenciaPorVuelo))+(unCostoPorEstadia)+(unaDuracionDeDiasDeEstadia*asistenciaPorEstadia);
	}
}