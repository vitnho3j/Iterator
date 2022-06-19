
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Evento implements Iterable<Ingresso>{

    private List<Ingresso> ingressos = new ArrayList<Ingresso>();

    public Evento(Ingresso... ingressos){
        this.ingressos = Arrays.asList(ingressos);
    }
    @Override
    public Iterator<Ingresso> iterator(){
        return ingressos.iterator();
    }

}
