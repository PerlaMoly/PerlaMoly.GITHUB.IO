package ar.edu.unlam.Pb2.PilaRec;

public class PilaRec {

	private Double porcentajeCarga;
	private Double velocidadCarga;
	private Double velocidadConsumo;
	private Integer cargaTotal;
	private Double tiempoTotal;
	private Integer cantDescarga;

	public PilaRec(Double velocidadCarga, Double velocidadConsumo) {
		this.porcentajeCarga = 50.00;
		this.velocidadCarga = velocidadCarga;
		this.velocidadConsumo = velocidadConsumo;
		this.tiempoTotal = 0.0;
		this.cargaTotal = 0;
		this.cantDescarga = 0;
	}

	public Double medirCarga() {
		return this.porcentajeCarga;

	}

	public void consumir(Double minutos) {

		this.porcentajeCarga -= this.velocidadConsumo * minutos;
		if (porcentajeCarga < 0.0)
		
			this.porcentajeCarga = 0.0;
		
		tiempoTotal+=minutos;
		cantDescarga++;
		
	}

	public void cargar(Double minutos) {
		
		this.porcentajeCarga += this.velocidadCarga * minutos;
		if (porcentajeCarga >= 100.00) {
			this.porcentajeCarga = 100.00;
			this.cargaTotal++;
		}
	}
}
