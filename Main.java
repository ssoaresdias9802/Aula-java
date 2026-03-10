public class Main{
    public static void main(String [] args){
        Vetor listaAniv= new Vetor(10);
        listaAniv.add(0, "STEPHANIE");
        listaAniv.add(1, "SOLANGE");
        listaAniv.add(2, "LAURA");
        listaAniv.add(3, "YVES");

        System.out.println("Total de covidados " + listaAniv.size());

        listaAniv.mostraLista();
        

    }
}