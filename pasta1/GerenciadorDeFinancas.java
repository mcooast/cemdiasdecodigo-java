package GerenciadorFinancasPessoais;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeFinancas {

    private List<Transacao> transacoes;

    public GerenciadorDeFinancas(){
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao (Transacao transacao){
        transacoes.add(transacao);
    }

    public void exibirResumoTransacoes(){
        System.out.println("==== Resumo das Transações ====");
        for (Transacao transacao : transacoes){
            System.out.println("Descrição: " + transacao.getDescricao());
            System.out.println("Valor: " + transacao.getValor());
            System.out.println("Tipo: " + transacao.getTipo());
            System.out.println("------------------");
        }
    }

    public double calcularSaldoAtual(){
        double saldoAtual = 0;
        for (Transacao transacao : transacoes){
            if (transacao.getTipo().equalsIgnoreCase("receita")){
                saldoAtual += transacao.getValor();
            } else if (transacao.getTipo().equalsIgnoreCase("despesa")){
                saldoAtual -= transacao.getValor();
            }
        }

        return saldoAtual;
    }

}
