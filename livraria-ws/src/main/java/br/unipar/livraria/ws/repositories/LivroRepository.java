/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.livraria.ws.repositories;

import br.unipar.livraria.ws.models.Livro;
import br.unipar.livraria.ws.models.Pessoa;
import java.util.ArrayList;
import java.util.Date;

public class LivroRepository {
    
    ArrayList<Livro> resultado = new ArrayList<>();
    
    public LivroRepository(){
        Pessoa autor = new Pessoa();
        autor.setId(1);
        autor.setNome("Cleito");
        
        Pessoa editora = new Pessoa();
        editora.setId(1);
        editora.setNome("Shimizu");
        
        Livro a = new Livro();      
        
        a.setId(1);
        a.setNome("Harry poter");
        a.setNrPaginas(240);
        a.setDtLancto(new Date());
        a.setAutor(autor);
        a.setEditora(editora);
        
        Livro b = new Livro();      
        
        b.setId(2);
        b.setNome("Harry poter");
        b.setNrPaginas(240);
        b.setDtLancto(new Date());
        b.setAutor(autor);
        b.setEditora(editora);
        
        Livro c = new Livro();      
        
        c.setId(3);
        c.setNome("Harry poter");
        c.setNrPaginas(240);
        c.setDtLancto(new Date());
        c.setAutor(autor);
        c.setEditora(editora);
        
        resultado.add(a);
        resultado.add(b);
        resultado.add(c);
        
    }
    
    public ArrayList<Livro> findLivro(String nome){
        ArrayList<Livro> listaResultado = new ArrayList<>();
        
        for(Livro livro: resultado){
            if(livro.getNome().toUpperCase().contains(nome.toUpperCase())){
               listaResultado.add(livro);
            }
        }return null;
    }
    
    public ArrayList<Livro> listAll(){
        return resultado;
    }
    
    public Livro findById(int id){
        for(Livro livro: resultado){
            if(livro.getId()== id){
               return livro; 
            }
        }return null;
    }
   
    
}
