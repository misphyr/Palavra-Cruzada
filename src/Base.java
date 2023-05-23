import java.util.Scanner;

public class Base {
	//O que tem na palavra cruzada?
	//São vetores que se cruzam em determinados pontos?
	//Caso o indice de dois dos possíveis vetores forem iguais, eles se cruzam
	//Se for adicionar mais palavras por dentro do jogo, como seria possível?
	
	private static String[] palavras = new String[50];
	
	public static void main(String[] args) {
			
		palavras[0] = "Teste";
		palavras[1] = "Dominio";
		
		inserirPalavra();
		exibirPalavras();
		deletarPalavras();
		loadPalavras();
		exibirPalavras();
		comparaPalavras();
	}
	
	private static void comparaPalavras() {
		for(int a = 0; a < palavras.length - 1; a++) {
			if(palavras[a] != null) {
			char[] c1 = palavras[a].toCharArray();
			char[] c2 = palavras[a+1].toCharArray();
			for(int j = 0; j< c1.length;j++) {
				for(int i = 0; i< c2.length;i++) {
						if(c1[j] == c2[i]) {
						System.out.print("\n-- As palavras " + palavras[a] + " e " + palavras[a+1] + "\nTem a letra igual: " + c1[j]);
						}	//cruza
			}
			}
			}
		}
	}
	
	private static void loadPalavras() {
		for(int a = 0; a < palavras.length-1; a++) {
			if(palavras[a] == null) {
				palavras[a] = palavras[a+1];
				palavras[a + 1] = null;
			}
		}
	}

	private static void deletarPalavras() {
		Scanner ler = new Scanner(System.in);		
		int temp = Integer.parseInt(ler.nextLine()) - 1;
		palavras[temp] = null;
	}

	private static void inserirPalavra() {
		 Scanner ler = new Scanner(System.in);
		 String temp = ler.nextLine();
		 for(int a = 0; a < palavras.length; a++) {
				if(palavras[a] == null) {
					palavras[a] = temp;
					break;
				}
			}
	}

	static void exibirPalavras() {
		int j = 0;
		for(int a = 0; a < palavras.length; a++) {
			if(palavras[a] != null) {
				j++;
				System.out.print(j + " - ");
				for(int i = 0; i <	palavras[a].toCharArray().length; i++) {
					char[] letras = palavras[a].toCharArray();
					System.out.print(letras[i]);
				}
				System.out.print("\n");
			}
		}

	}
	
}
