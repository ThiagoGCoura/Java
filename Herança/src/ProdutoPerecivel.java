
public class ProdutoPerecivel extends Produto {
    int validade;
    
    ProdutoPerecivel(String nome,int quantidade ,double preco ,int validade){
        super(nome, quantidade, preco);
        this.validade=validade;
    }
    
    @Override
    public void entraEstoque(int qtde){
        if(validade<=2)
            quantidade=0;
        if (quantidade!=0)
            System.out.println("Não é possivel adicionar o produto, pois há estoque.");
        else
            quantidade+=qtde;
    }
    
    @Override
    public void retiraEstoque(int qtde){
        if(validade<=2)
            quantidade=0;
        if(quantidade>qtde)
           quantidade-=qtde;
        /*else  
           System.out.println("Estoque insuficiente.");*/
    }
    
    @Override
    public String toString(){
        return super.toString()+ "\n"+ validade;
    }
}
