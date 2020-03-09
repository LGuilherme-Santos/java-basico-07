package br.fai.projeto07;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private void start() {
		
		
		operacao();

	}

	private void operacao(int x, int y) {
		int x, y;
		x = 5;
		y = 5;
		int soma = x + y;
		

		System.out.println("soma: " + soma);

	}
}
