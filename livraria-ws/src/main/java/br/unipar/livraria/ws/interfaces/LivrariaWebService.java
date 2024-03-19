package br.unipar.livraria.ws.interfaces;

import br.unipar.livraria.ws.exceptions.AutorizacaoException;
import br.unipar.livraria.ws.exceptions.ValidacaoException;
import br.unipar.livraria.ws.models.Livro;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;


//SEI: Interface Endpoint Service
@WebService
public interface LivrariaWebService {
    
    @WebMethod
    ArrayList<Livro> findLivro(String nome) throws SQLException;
    
    @WebMethod
    ArrayList<Livro> listAll() throws SQLException;
    
    @WebMethod
    Livro findById(int id) throws SQLException;
    
    @WebMethod
    String logar(@WebParam(header = true)String login,
                @WebParam(header = true)String senha);
    
    @WebMethod
    Livro inserir(Livro livro) throws AutorizacaoException,
            ValidacaoException;
    
    @WebMethod
    Livro atualizar(Livro livro) throws SQLException;
    
    @WebMethod 
    void deletar(int id)throws SQLException;
    
    
    
}
