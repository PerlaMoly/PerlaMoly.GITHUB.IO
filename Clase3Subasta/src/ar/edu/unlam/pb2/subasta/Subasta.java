package ar.edu.unlam.pb2.subasta;

public class Subasta {

	private Integer valorInicial;
	private Boolean abierta;

	public Subasta() {
		this.valorInicial = 0;
		this.abierta = true;
	}

	public Subasta(Integer valorInicial) {
		this.valorInicial = valorInicial;
		this.abierta = true;
	}

	public void nuevaOferta(Integer oferta) {
		if (oferta > this.valorInicial && this.abierta) {
			this.valorInicial = oferta;
		}
	}

	public Integer itemVendido() {
		this.abierta = false;
		return this.valorInicial;
	}

	public Integer getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(Integer valorInicial) {
		this.valorInicial = valorInicial;
	}

	public Boolean getAbierta() {
		return abierta;
	}

	public void setAbierta(Boolean abierta) {
		this.abierta = abierta;
	}

}
