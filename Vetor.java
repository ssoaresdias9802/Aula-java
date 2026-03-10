public class Vetor {
    private String[ ] A; // armazena os nomes do vetor
    private int capacity; // capacidade do vetor
    private int size; // elementos no vetor
    public Vetor(int capacity) {
        A = new String[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    public boolean isEmpty() {
        if (size==0){return true;}
        else{return false;}
    }

    public int size() {
        //retorna qtd de elementos na lsita
        //até que ponto a lista esta preenchida
        return size;
    }

    public int get(int i) throws Exception {
        //retorna o elemento da posição i
        if (i>=size){
            throw new Exception ("Posição Inválida!");
        }
        return A[i];

    }
    public void set(int i, String n) throws Exception {
        //altera o conteúdo posição i para n
        if (i>=size){
            throw new Exception("Posição Inválida!");
        }
        A[i]=n;
    }
    public void add(int i, String n) throws Exception {
        //insere novo elemento na lista na posição i
        if (size==capacity)
            throw new Exception("A lista está cheia!");
        if (i>size)
            throw new Exception("Posição de inserção inválida!");

        for (int z=size;z>i;z--){
            A[z]=A[z-1];
        }
        
    }
    public void remove(int i) throws Exception {
        //remove elemento da posição i

        if (isEmpty())
            throw new Exception("A lista esta vazia!");
        if (i>=size)
            throw new Exception("Este índice está vazio!");

        for (int z=i;z<size-1;z++){
            A[z]=A[z+1];
        }
        size--;
    }
    public int search(int n) {
        for (int i;i<size;i++)
            if (A[i].equals(n))
                return i;

        return -1;
        
    }
    public void mostraLista(){
        //exibe tds elementos
        for (int i=0;i<size;i++)
            System.out.println(A[i]);
    } 
    
}