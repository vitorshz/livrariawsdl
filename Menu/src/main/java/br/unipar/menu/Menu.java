/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author lucia
 */
public class Menu extends JFrame{
    private JPanel DinamicaIntrodutoria;
    private JPanel CalcularMedia;
    private JPanel textDemo;

    
    public Menu() {
        
        setTitle("Menu");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        DinamicaIntrodutoria = new Panel1();
        CalcularMedia = new Panel2();
        textDemo = new Panel3();

        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuEx = new JMenu("Exercicios");
        JMenu menuMsg = new JMenu("Mensagens");
        JMenu menuCad = new JMenu("Cadastros");
        JMenu subMenuCliente =  new JMenu("Cliente");
        
        JMenuItem menuItemDinamica = new JMenuItem("Dinâmica Introdutória");
        JMenuItem menuItemCalcular = new JMenuItem("Calcular media");
        JMenuItem menuItemTxtdemo = new JMenuItem("Texto demo");
        
        
        
        JMenuItem menuItemCad = new JMenuItem("Cadastrar");
        JMenuItem menuItemListar = new JMenuItem("Listar");


        //barra de menu
        menuBar.add(menuEx);
        menuBar.add(menuMsg);
        menuBar.add(menuCad);
        
        //submenu
        menuCad.add(subMenuCliente);
        
        //itens do menu Exercicios
        menuEx.add(menuItemDinamica);
        menuEx.add(menuItemCalcular);
        menuEx.add(menuItemTxtdemo);
        
        
        
        //itens submenu
        subMenuCliente.add(menuItemCad);
        subMenuCliente.add(menuItemListar);
        
        //Adicionando ação no item quando clicado
        menuItemDinamica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirPanel(DinamicaIntrodutoria);
            }
        });
        setJMenuBar(menuBar);
        
        
        
    }
    
    private void abrirPanel(JPanel panel){
        getContentPane().removeAll();
        getContentPane().add(panel);
        revalidate();
        repaint();
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Menu menu = new Menu();
                new Menu().setVisible(true);
            }
        });
    }
}
