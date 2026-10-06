package br.com.exemplo.avl.repository;

import br.com.exemplo.avl.model.Solicitacao;
import java.util.List;

public interface SolicitacaoRepository {
    void inserir(Solicitacao s);
    Solicitacao buscar(int numero);
    boolean remover(int numero);
    List<Solicitacao> listar();
    String exibirArvore();

    // Assinatura do método de alteração (Tarefa 8)
    boolean alterar(int numero, String solicitante, String descricao);
}