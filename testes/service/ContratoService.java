package br.com.rpires.tarefaMod24.testes.service;

import br.com.rpires.tarefaMod24.testes.dao.IContratoDao;

public class ContratoService implements IContratoService {

    public IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();

        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Buscado";
    }
    @Override
    public String excluir() {
        return "Excluido";
    }
    @Override
    public String atualizar() {
        return "Atualizado";
    }

}
