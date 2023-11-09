import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;

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
                case 2:

            }
        }while (op != 0 );

    }
}
    