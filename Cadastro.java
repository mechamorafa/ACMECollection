1public class Cadastro {

	private String nome;
	private Disco[] disco;


	public Cadastro (String nome, Disco[] disco){
		this.nome = nome;
		this.disco = disco;
	}

	public static void PesquisaTudo(Disco[] discos) {
		System.out.println("===================================");
		System.out.println("Todos os discos cadastrados:");
		System.out.println("===================================");
		for(int i=0; i<5; i++){
			Dono res = discos[i].getDono();
			System.out.println("Título: " + discos[i].getNome() + " | Artista: " + discos[i].getArtista() + " | Ano: " + discos[i].getAno() + " | Gravadora: " + discos[i].getGravadora() + " | Dono: " + res.getNome() + " - Email: " + res.getEmail());
		}
		System.out.println("===================================");
	}

	public static void PesquisaAno(Disco[] discos, int ano) {
		int contador = 0;
		Disco[] resultado = new Disco[5];
		for(int i=0; i<5; i++){
			int comparaAno = discos[i].getAno();
			if(comparaAno==ano){
				resultado[contador] = new Disco(discos[i].getNome(), discos[i].getArtista(), discos[i].getAno(), discos[i].getGravadora(), discos[i].getDono());
				contador = contador + 1;
			}
		}

		if(contador==0){
			System.out.println("Nenhum disco encontrado para o ano: " + ano);
		} else {
			for(int i=0; i<5; i++){
				if(resultado[i]!=null){
					Dono res = resultado[i].getDono();
					System.out.println("Título: " + resultado[i].getNome() + " | Artista: " + resultado[i].getArtista() + " | Ano: " + resultado[i].getAno() + " | Gravadora: " + resultado[i].getGravadora() + " | Dono: " + res.getNome() + " - Email: " + res.getEmail());
				}
			}
		}

	}

	public static void PesquisaDono (Disco[] discos, String dono) {
		int contador = 0;
		Disco[] resultado = new Disco[5];
		for(int i=0; i<5; i++){
			Dono recebeDono = discos[i].getDono();
			String comparaDono = recebeDono.getNome();

			if(comparaDono.toLowerCase().contains(dono.toLowerCase())){
				resultado[contador] = new Disco(discos[i].getNome(), discos[i].getArtista(), discos[i].getAno(), discos[i].getGravadora(), discos[i].getDono());
				contador = contador + 1;
			}
		}

		if(contador==0){
			System.out.println("Nome do dono não localizado.");
		} else {
			for(int i=0; i<5; i++){
				if(resultado[i]!=null){
					Dono res = resultado[i].getDono();
					System.out.println("Título: " + resultado[i].getNome() + " | Artista: " + resultado[i].getArtista() + " | Ano: " + resultado[i].getAno() + " | Gravadora: " + resultado[i].getGravadora() + " | Dono: " + res.getNome() + " - Email: " + res.getEmail());
				}
			}
		}

	}

}
