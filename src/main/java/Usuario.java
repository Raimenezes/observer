import java.util.Observer;
import java.util.Observable;

public class Usuario implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void notificar(OneFootballTime oneFootballTime){
        oneFootballTime.addObserver(this);
    }

    public void update(Observable oneFootballTime, Object arg1) {
        this.ultimaNotificacao = this.nome + ", notificação lançada no " + oneFootballTime.toString();
    }
}
