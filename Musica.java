public class Musica implements Comparable <Musica>{
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
        this.titulo = titulo;
    } 

    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    @Override //verifica se de fato escrevi certo - boa pratica 
    public String toString(){
        return String.format(
            "(%s, %d)", //forma de concatenar sem +(no qual é custozo)
            titulo,
            avaliacao
        );
    }

    @Override
    public int compareTo(Musica o) {
        return o.titulo.compareTo(o.titulo);
    }



}