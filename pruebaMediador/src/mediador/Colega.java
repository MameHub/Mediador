package mediador;

public abstract class Colega {

	protected IMediador mediador;

	// -------------------------------
	public IMediador getMediador() {
		return this.mediador;
	}

	// -------------------------------
	public void setMediador(IMediador m) {
		this.mediador = m;
	}

	// -------------------------------
	public void comunicar(String mensaje) {
		this.getMediador().enviar(mensaje, this);
	}

	// -------------------------------
	// M�todo a implementar por las clases que hereden
	public abstract void recibir(String mensaje);

}
