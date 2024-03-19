package br.unipar.livraria.ws.services;

import br.unipar.livraria.ws.models.Livro;
import br.unipar.livraria.ws.repositories.LivroRepository;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    public Livro insert(Livro livro) throws SQLException{
        LivroRepository livroRepository = new LivroRepository();
        return livroRepository.insert(livro);
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
