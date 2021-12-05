package model;

import java.util.ArrayList;

public class GerenciarProduto {
    
    //coleção de produtos
    static ArrayList<Produto> listaProdutos = new ArrayList();
    
    
    //Adiciona um produto na coleção de Produtos
    public boolean adicionarProduto(Produto e){
        if (e.getCodigoProduto() == 0){
            return false;
        }
        else {
            listaProdutos.add(e);
            return true;
        }        
    }
    
    //Devolve a lista de Produtos
    public ArrayList<Produto> listaDeProdutos(){
        return listaProdutos;
    }
    
    //Remove um produto da coleção de Produtos
    public boolean removerProduto (Produto e){
        
        if (verificarExistencia(e)){
            try {
            listaProdutos.remove(e);
            return true;
            }
            catch(Exception exc){
                return false;
            }
        }
        else {
            return false;
        }
    }
       
    //Verifica a existência de um produto
    private boolean verificarExistencia (Produto e){
        
        for(int i = 0; i < listaProdutos.size(); i ++){
            if(listaProdutos.get(i).getCodigoProduto() == e.getCodigoProduto()){
                return true;
            }
        }
        
        return false;
    }
    
    //Seleciona um produto apenas pelo código
    public Produto selecionarProduto (int codigo){
        for(int i = 0; i < listaProdutos.size(); i ++){
            if(listaProdutos.get(i).getCodigoProduto() == codigo){
                return listaProdutos.get(i);
            }
        }
        return null;
    }
}
