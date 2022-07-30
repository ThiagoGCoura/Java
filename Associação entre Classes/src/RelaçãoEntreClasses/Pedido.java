
package RelaçãoEntreClasses;

public class Pedido {
    int numero;
    Produto item;
    int quantidade;
    double valor;
    Produto preço;
    
    public Pedido(int n, Produto i, int q){
        
        this.numero = n;
        this.item = i;
        this.quantidade = q;
        
    }
    
    public void calculaPedido() {
        this.valor+=quantidade*item.preço;
    }
    
    public String toString() {
        
        String retorno =
                    "Número do pedido: "+numero+"\n" +
                    "Código do Produto: "+item.cod+"\n" +
                    "Descrição: "+item.descricao+"\n" +
                    "Preço do Produto: "+item.preço+"\n" +
                    "Quantidade: "+quantidade+"\n" +
                    "Valor total do pedido: "+valor;
        return retorno;
        
    }
    
}
