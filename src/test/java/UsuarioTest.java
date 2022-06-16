import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsuarioTest {

    @Test
    public void deveNotificarUmUsuario() {
        OneFootballTime oneFootballTime = new OneFootballTime("Real Madrid");
        Usuario usuario = new Usuario("CR7");
        usuario.notificar(oneFootballTime);
        oneFootballTime.lancarInformacoes();
        assertEquals("CR7, notificação lançada no OneFootballTime{nome=Real Madrid}", usuario.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarUsuarios() {
        OneFootballTime oneFootballTime = new OneFootballTime("Real Madrid");
        Usuario usuario1 = new Usuario("CR7");
        Usuario usuario2 = new Usuario("Benzema");
        usuario1.notificar(oneFootballTime);
        usuario2.notificar(oneFootballTime);
        oneFootballTime.lancarInformacoes();
        assertEquals("CR7, notificação lançada no OneFootballTime{nome=Real Madrid}", usuario1.getUltimaNotificacao());
        assertEquals("Benzema, notificação lançada no OneFootballTime{nome=Real Madrid}", usuario2.getUltimaNotificacao());
    }

    @Test
    public void naoDeveNotificarUsuario() {
        OneFootballTime oneFootballTime = new OneFootballTime("Real Madrid");
        Usuario usuario = new Usuario("CR7");
        oneFootballTime.lancarInformacoes();
        assertEquals(null, usuario.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarUsuarioTimeA() {
        OneFootballTime oneFootballTimeA = new OneFootballTime("Real Madrid");
        OneFootballTime oneFootballTimeB = new OneFootballTime("Liverpool");
        Usuario usuario1 = new Usuario("CR7");
        Usuario usuario2 = new Usuario("Salah");
        usuario1.notificar(oneFootballTimeA);
        usuario2.notificar(oneFootballTimeB);
        oneFootballTimeA.lancarInformacoes();
        assertEquals("CR7, notificação lançada no OneFootballTime{nome=Real Madrid}", usuario1.getUltimaNotificacao());
        assertEquals(null, usuario2.getUltimaNotificacao());
    }

}
