package inf008.util.ordenacao;

import inf008.contabil.Conta;
import inf008.contabil.Lancamento;

public interface Ordenador {

	void ordenar(Conta[] contas);
	void ordenar(Lancamento[] lancamento);

}
