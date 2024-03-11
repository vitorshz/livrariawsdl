package br.unipar.livraria.ws;

import br.unipar.livraria.ws.interfaces.LivrariaWebService;
import br.unipar.livraria.ws.models.Livro;
import br.unipar.livraria.ws.services.LivrariaService;
import jakarta.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "br.unipar.livraria.ws.interfaces.LivrariaWebService")
public class LivrariaWebServiceImp implements LivrariaWebService{

    @Override
    public ArrayList<Livro> findLivro(String nome) {
        LivrariaService livrariaService = new LivrariaService();
        return livrariaService.findLivro(nome); 
    }

    @Override
    public ArrayList<Livro> listAll() {
        LivrariaService livrariaService = new LivrariaService();
        return livrariaService.listAll();
    }

    @Override
    public Livro findById(int id) {
        LivrariaService livrariaService = new LivrariaService();
        return livrariaService.findById(id);    
    }

    @Override
    public String logar(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
