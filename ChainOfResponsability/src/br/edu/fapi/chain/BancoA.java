package br.edu.fapi.chain;

public class BancoA extends BancoChain{
	
	public BancoA() {
        super(IDBancos.bancoA);
    }
 
    @Override
    public void efetuaPagamento() {
        System.out.println("Pagamento efetuado no banco A");
    }

}
