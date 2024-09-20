package br.com.rpires.tarefaMod24.testes.test;

import br.com.rpires.tarefaMod24.testes.dao.ContratoDao;
import br.com.rpires.tarefaMod24.testes.dao.IContratoDao;
import br.com.rpires.tarefaMod24.testes.mocks.ContratoDaoMock;
import br.com.rpires.tarefaMod24.testes.service.ContratoService;
import br.com.rpires.tarefaMod24.testes.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTeste(){
        IContratoDao dao = new ContratoDaoMock();

        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDados(){
        IContratoDao dao = new ContratoDao();

        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTeste(){
        IContratoDao dao = new ContratoDaoMock();

        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Buscado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDados(){
        IContratoDao dao = new ContratoDao();

        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Buscado", retorno);
    }

    @Test
    public void excluirTeste(){
        IContratoDao dao = new ContratoDaoMock();

        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Excluido", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDados(){
        IContratoDao dao = new ContratoDao();

        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Excluido", retorno);
    }

    @Test
    public void atualizarTeste(){
        IContratoDao dao = new ContratoDaoMock();

        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDados(){
        IContratoDao dao = new ContratoDao();

        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Atualizado", retorno);
    }



}
