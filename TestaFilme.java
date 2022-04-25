public class TestaFilme {

    public static void main(String [] args) {
        Filme f=new Filme();
        f.setCodigo(1235);
        f.setNome("A era do Gelo");
        f.setValor(2);

        System.out.println("O codigo do filme é: "+f.getCodigo());

        f.setCodigo(456);
        f.setNome("A menina que roubava livros");
        f.setValor(3);

        System.out.println("O codigo do filme é: "+f.getCodigo());
    
        
    }
    
}
