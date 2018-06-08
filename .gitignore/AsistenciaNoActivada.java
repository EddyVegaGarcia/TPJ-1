package fiuba.algo3.tp1;

public class AsistenciaNoActivada extends EstadoAsistencia
{
	private double asistenciaPorVuelo = 0.0;
	private int asistenciaPorEstadia = 0;
	
	@Override
	public double costoPorAsistencia(double unCostoPorVuelo, double unCostoPorEstadia, int unaDuracionDeDiasDeEstadia)
	{
		return (unCostoPorVuelo*(1+asistenciaPorVuelo))+(unCostoPorEstadia)+(unaDuracionDeDiasDeEstadia*asistenciaPorEstadia);
	}
}