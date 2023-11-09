public class Musica{
    private String titulo;
    private int avaliacao;

    public Musica(){
    }

    public Musica(String titulo){
        this(titulo, 0);
    }

    public Musica(String titulo, int avaliacao){
        setTitulo(titulo);
        setAvaliacao(avaliacao);
    }

    public void setTitulo(String titulo){//metodo, 
        setTitulo(titulo);
    } 

    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }





}