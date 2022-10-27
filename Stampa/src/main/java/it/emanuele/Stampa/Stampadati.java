package it.emanuele.Stampa;

public class Stampadati {

	private String nome;
	private String cognome;
	private String data;
	
	@Override
	public String toString() {
		return "Dati [nome=" + nome + ", cognome=" + cognome + ", data=" + data + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}

