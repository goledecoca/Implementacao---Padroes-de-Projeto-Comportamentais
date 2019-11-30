package br.edu.fapi.command;


public void executarCompra (double valor, FormaDePagamento, formaDePagamento) {
	
	Compra compra = new Compra(nomeDaLoja);
    compra.setValor(valor);
    formaDePagamento.processarCompra(compra);
}


