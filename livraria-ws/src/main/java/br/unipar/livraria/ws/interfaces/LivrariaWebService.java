package br.unipar.livraria.ws.interfaces;

import br.unipar.livraria.ws.models.Livro;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.ArrayList;


//SEI: Interface Endpoint Service
@WebService
public interface LivrariaWebService {
    
    @WebMethod
    ArrayList<Livro> findLivro(String nome);
    
    @WebMethod
    ArrayList<Livro> listAll();
    
    @WebMethod
    Livro findById(int id);
    
    
    
}
