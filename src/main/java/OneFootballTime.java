import java.util.Observable;

public class OneFootballTime extends Observable {

    private String nome;


    public OneFootballTime(String nome){
        this.nome = nome;
    }

    public void lancarInformacoes(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "OneFootballTime{" +
                "nome=" + nome +
                '}';
    }
}
