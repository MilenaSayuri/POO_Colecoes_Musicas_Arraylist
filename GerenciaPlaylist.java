import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import java.util.Collections;

public class GerenciaPlaylist {
    public static void main(String[] args) {
        //List <Musica> musicas = new LinkedList <>(); //<Musica> = parametrico, <>=operador diamente
        var musicas = new ArrayList<Musica>();
        var menu = "1-Adicionar\n2-Ver músicas\n3-Avaliar música\n4-Excluir música\n0-Sair";
        int op;
        do{
            op = parseInt(showInputDialog(menu));
            switch(op){
                case 1:{
                    //Pegar os dados da musica
                    var titulo = showInputDialog("TITULO?");
                    //construir um objeto musica
                    var musica = new Musica(titulo);
                    //adicionar na coleção com add
                    musicas.add(musica);
                    //avisar o usuario que deu certo
                    showMessageDialog(null,"OKAY, ADICIONOU!");
                    break;
                }
                case 2:{
                    var sb = new StringBuilder(""); //construtor de string
                    //for each our enhanced for
                    Collections.sort(musicas);
                    for(Musica m : musicas){ //m faz referencia a musicas
                        sb
                        .append(m) //append é de concatenar, encaixar -- o toString esta nao explicito mas ta ai
                        .append("\n")
                        .append("***********************")
                        .append("\n");
                    }
                    //refaça com o for normal
                    // for(int i = 1; i <= musicas.size(); ++i){
                    //     sb
                    //     .append(musicas.get(i - 1))
                    //     .append("\n")
                    //     .append("***********************");
                    // }
                    showMessageDialog(null, sb);
                    break;
                }
                case 3:{
                    //ordenar por avaliação
                    Collections.sort(musicas, new ComparadorPorTitulo());
                    var sb = new StringBuilder("");
                    for(Musica m : musicas){ //m faz referencia a musicas
                        sb
                        .append(m) //append é de concatenar, encaixar -- o toString esta nao explicito mas ta ai
                        .append("\n")
                        .append("***********************")
                        .append("\n");
                    }
                }
            }
        }while (op != 0 );

    }
}
    