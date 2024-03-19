package br.unipar.livraria.ws;

import br.unipar.livraria.ws.exceptions.AutorizacaoException;
import br.unipar.livraria.ws.exceptions.ValidacaoException;
import br.unipar.livraria.ws.interfaces.LivrariaWebService;
import br.unipar.livraria.ws.services.LivroService;
import br.unipar.livraria.ws.models.Livro;
import jakarta.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;

@WebService(endpointInterface = "br.unipar.livraria.ws.interfaces.LivrariaWebService")
public class LivrariaWebServiceImp implements LivrariaWebService{

    @Override
    public ArrayList<Livro> findLivro(String nome) throws SQLException{
        LivroService livrariaService = new LivroService();
        return livrariaService.findLivro(nome); 
    }

    @Override
    public ArrayList<Livro> listAll() throws SQLException {
        LivroService livrariaService = new LivroService();
        return livrariaService.listAll();
    }

    @Override
    public Livro findById(int id) throws SQLException{
        LivroService livrariaService = new LivroService();
        return livrariaService.findById(id);    
    }

    @Override
    public String logar(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Livro inserir(Livro livro) throws AutorizacaoException, ValidacaoException {
        LivroService livrariaService = new LivroService();
        return livrariaService.insert(livro);
    }
    
    @Override
    public Livro atualizar(Livro livro) throws SQLException {
        LivroService livrariaService = new LivroService();
        return livrariaService.update(livro);
    }

    @Override
    public void deletar(int id) throws SQLException{
        LivroService livrariaService = new LivroService();
        livrariaService.delete(id);
    }

    
    
}
