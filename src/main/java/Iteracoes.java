import java.util.Iterator;

public class Iteracoes {

    public static Integer contarIngressosPista(Evento evento){
        int quantidade = 0;
        for (Ingresso ingresso : evento){
            if (ingresso.getNome() == "Pista"){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarIngressosCamarote(Evento evento){
        int quantidade = 0;
        for (Ingresso ingresso : evento){
            if (ingresso.getNome() == "Camarote"){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarQuantidadeTotalIngressos(Evento evento){
        int quantidade = 0;
        for (Iterator a = evento.iterator(); a.hasNext();){
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
