package br.unipar.livraria.ws.services;

import br.unipar.livraria.ws.exceptions.AutorizacaoException;
import br.unipar.livraria.ws.exceptions.ValidacaoException;
import br.unipar.livraria.ws.models.Livro;
import br.unipar.livraria.ws.repositories.LivroRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LivroService {
    
    public ArrayList<Livro> listAll()throws SQLException{
        LivroRepository livroRepository = new LivroRepository();
        return livroRepository.listAll();
    }
    
    public Livro findById(int id)throws SQLException {
        LivroRepository livroRepository = new LivroRepository();
        return livroRepository.findById(id);
    }
    public ArrayList<Livro> findLivro(String nome) throws SQLException{
        LivroRepository livroRepository = new LivroRepository();
        return livroRepository.findLivro(nome);
    }
    
    public Livro insert(Livro livro) throws ValidacaoException{
        
        //REGRA DE NEGOCIO
        if(livro.getNome().length()<=3){
            throw new ValidacaoException("Nome do livro deve possuir mais de 3 caracteres");
        }
        if(livro.getNrPaginas()  <= 0){
            throw new ValidacaoException("Nome do livro deve possuir mais de 3 caracteres");
        }
        
        
        try {
            LivroRepository livroRepository = new LivroRepository();
            return livroRepository.insert(livro);
        } catch (SQLException ex) {
            throw new ValidacaoException("Erro interno no servidor");
        }
    }
    
    public Livro update(Livro livro) throws SQLException  {
        LivroRepository livroRepository = new LivroRepository();
        return livroRepository.update(livro);
    }
    
    public void delete(int id) throws SQLException{
        LivroRepository livroRepository = new LivroRepository();
        livroRepository.delete(id);
    }

    

}
