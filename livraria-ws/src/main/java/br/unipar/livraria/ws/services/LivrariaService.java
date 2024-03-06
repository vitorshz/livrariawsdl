package br.unipar.livraria.ws.services;

import br.unipar.livraria.ws.models.Livro;
import br.unipar.livraria.ws.repositories.LivroRepository;
import java.util.ArrayList;

public class LivrariaService {
    
    public ArrayList<Livro> listAll(){
        LivroRepository livroRepository = new LivroRepository();
        return livroRepository.listAll();
    }
    
}
