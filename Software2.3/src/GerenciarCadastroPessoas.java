
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bruno
 */
public class GerenciarCadastroPessoas {
        private ArrayList<CadastroPessoas> listinha;
    
    public GerenciarCadastroPessoas(){
        listinha = new ArrayList();
    }
    
    public void inserir(CadastroPessoas cadastro){
        listinha.add(cadastro);
    }
   
}
