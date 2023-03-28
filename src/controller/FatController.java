package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {

	public FatController() {
		super();
	}

	public long fatorial(int num) {
		Pilha p = new Pilha();

		long fat = 1;
		p.push(num);

		while (num > 1) {

			try {
				fat = p.top();
				fat = fat * (num - 1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			p.push((int) fat);
			num--;
		}

		return fat;
	}
}