public class Disco {


	private String nome;
	private String artista;
	private int ano;
	private String gravadora;
	private Dono dono;


	public Disco (String nome, String artista, int ano, String gravadora, Dono dono){
		this.nome = nome;
		this.artista = artista;
		this.ano = ano;
		this.gravadora = gravadora;
		this.dono = dono;
	}


	public String getNome() {
		return nome;
	}

	public String getArtista() {
		return artista;
	}

	public int getAno() {
		return ano;
	}

	public String getGravadora() {
		return gravadora;
	}

	public Dono getDono() {
		return dono;
	}

}
