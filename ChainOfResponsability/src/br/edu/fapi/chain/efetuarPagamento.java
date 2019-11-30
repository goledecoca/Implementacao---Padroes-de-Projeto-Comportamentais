package br.edu.fapi.chain;

public class efetuarPagamento(IDBancos id) throws Exception {

	 if (podeEfetuarPagamento(id)) {
	        efetuaPagamento();
	    } else {
	        if (next == null) {
	            throw new Exception("banco não cadastrado");
	        }
	        next.efetuarPagamento(id);
	    }
	}
	 
	private boolean podeEfetuarPagamento(IDBancos id) {
	    if (identificadorDoBanco == id) {
	        return true;
	    }
	    return false;
	}
}