import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int opcaoMenu;
		int pesquisaPorAno;
		String pesquisaPorDono;
		Disco[] discos = new Disco[5];
		Dono[] donos = new Dono[5];


		// Cadastro de Donos:
		donos[0] = new Dono("Carl Sagan", "sagan@uchicago.edu");
		donos[1] = new Dono("Neil deGrasse Tyson", "hayden-planetarium@amnh.org");
		donos[2] = new Dono("Michio Kaku", "mkaku@aol.com");
		donos[3] = new Dono("Stephen Hawking", "professor@stephenhawking.org.uk");
		donos[4] = new Dono("Frank Close", "physics@st-andrews.ac.uk");

		// Cadastro de Discos:
		discos[0] = new Disco("O Descobridor dos Sete Mares", "Tim Maia", 1983, "EMI", donos[0]);
		discos[1] = new Disco("9 Luas", "Os Paralamas do Sucesso", 1996, "EMI", donos[1]);
		discos[2] = new Disco("Eu sou todos nós", "Zé Ramalho", 1998, "BMG",donos[2]);
		discos[3] = new Disco("Estação da luz", "Alceu Valença", 1985, "RCA", donos[3]);
		discos[4] = new Disco("Elogio da Loucura", "BMG", 1988, "Polygram", donos[4]);

		// Menu
		do{
			System.out.println("\tAcervo de Discos:");
			System.out.println("1. Listar Discos Cadastrados");
			System.out.println("2. Pesquisar Discos pelo Ano");
			System.out.println("3. Pesquisar Discos pelo Dono");
			System.out.println("0. Sair");
			System.out.println("Opcao:");
			opcaoMenu = in.nextInt();

			switch(opcaoMenu){
				case 0:
					System.out.println("Programa encerrado! Até mais! ;)");
					break;
				case 1:
					Cadastro.PesquisaTudo(discos);
					break;

				case 2:
					System.out.println("Pesquisar por ano: ");
					pesquisaPorAno = in.nextInt();

					Cadastro.PesquisaAno(discos, pesquisaPorAno);
					break;

				case 3:
					System.out.println("Pesquisar por Dono: ");
					pesquisaPorDono = in.next();

					Cadastro.PesquisaDono(discos, pesquisaPorDono);
					break;

				case 4:
					System.out.println("Você saiu!");
					break;

				default:
					System.out.println("Opção inválida.");
			}
		} while(opcaoMenu != 0);


	}

}

