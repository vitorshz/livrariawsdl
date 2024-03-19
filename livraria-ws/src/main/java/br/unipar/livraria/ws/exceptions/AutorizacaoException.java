/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.livraria.ws.exceptions;

import jakarta.xml.ws.WebFault;

@WebFault
public class AutorizacaoException extends Exception{

    public AutorizacaoException() {
        super("Usuário ou senha está incorreto");
    }
    
}
