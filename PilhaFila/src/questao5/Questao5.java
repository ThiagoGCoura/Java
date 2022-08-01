
package questao5;

public class Questao5 {

    public static void main(String[] args) throws Exception {
        Pilha s = new Pilha(10);
        Fila q = new Fila(10);
        int i;
        for (i = 0; i < 6; i++){
            s.push(i);
        }
        for (i = 0; i < 3; i++){
            q.enqueue(s.top());
            s.pop();
        }
        for (i = 0; i < 3; i++){
            s.push(q.front());
            q.dequeue();
            
        }
        System.out.println(s.top());
    }
    
}
