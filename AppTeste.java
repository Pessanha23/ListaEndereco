import org.junit.Assert;
import org.junit.Test;

public class AppTeste {
    @Test
    public void teste_1() {
        Cliente p = new Cliente(15, "32084408", "Diega", "joao.pessa@", "01524000", "594", "Cambuci", "ao lado do exercito", "São Paulo");
        Cliente2 cliente2 = new Cliente2();
        cliente2.armazenaCliente(p);
        Cliente clientefinal = cliente2.buscaCliente(15);
        String resultado = clientefinal.getNm_cliente();
        String expectativa = "Diega";

        Cliente o = new Cliente(7,"2222","Steffa","steffa@","01504404", "600", "Florida","ao lado dos jacares", "Estados Unidos");
        cliente2.armazenaCliente(o);
        Cliente clientebusca = cliente2.buscaCliente(7);
        String resultado2 = clientebusca.getNm_cliente();
        String expectativa2 = "Steffa";

        Assert.assertEquals(expectativa2, resultado2);

    }

    @Test
    public void teste_3() {
        Cliente o1 = new Cliente(7,"2222","Steffa","steffa@","01504404", "600", "Florida","ao lado dos jacares", "Estados Unidos");
        Cliente o2= new Cliente(8,"333","Diega","diega@","00000", "700", "Cambuci","ao lado dos jacares", "Estados Unidos");
        Cliente o3= new Cliente(9,"444","Gamiguel","gamiguel@","11111", "800", "vila","ao lado dos jacares", "Estados Unidos");

        Cliente2 cliente2 = new Cliente2();
        cliente2.armazenaCliente(o1);
        cliente2.armazenaCliente(o2);
        cliente2.armazenaCliente(o3);

        String resultado = cliente2.apagaCliente(9);
        String expectativa = "CLIENTE EXCLUIDO COM SUCESSO !!!";

        Assert.assertEquals(expectativa,resultado);

    }
}
