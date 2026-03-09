// 1. PADRÃO SINGLETON (Lazy Holder)
// Garante uma única instância da classe.
// ==========================================
class Singleton {
    private static class InstanceHolder {
        public static Singleton instancia = new Singleton();
    }
    private Singleton() { super(); }
    public static Singleton getInstancia() {
        return InstanceHolder.instancia;
    }
}

// ==========================================
// 2. PADRÃO STRATEGY
// Define comportamentos diferentes para o Robô.
// ==========================================
interface Comportamento {
    void mover();
}

class ComportamentoNormal implements Comportamento {
    public void mover() { System.out.println("Robô movendo-se normalmente..."); }
}

class ComportamentoAgressivo implements Comportamento {
    public void mover() { System.out.println("Robô movendo-se agressivamente!"); }
}

class Robo {
    private Comportamento comportamento;
    public void setComportamento(Comportamento c) { this.comportamento = c; }
    public void mover() { 
        if (comportamento != null) {
            comportamento.mover(); 
        } else {
            System.out.println("Defina um comportamento para o robô primeiro.");
        }
    }
}

// ==========================================
// 3. PADRÃO FACADE
// Simplifica a interação com subsistemas complexos.
// ==========================================
class SubsistemaCep {
    public String recuperarCidade(String cep) { return "Campina Grande"; }
    public String recuperarEstado(String cep) { return "Paraíba"; }
}

class SubsistemaCrm {
    public static void gravar(String nome, String cep, String cidade, String estado) {
        System.out.println("Salvando no CRM: " + nome + " | " + cidade + "-" + estado);
    }
}

class Facade {
    public void cadastrarCliente(String nome, String cep) {
        SubsistemaCep cepApi = new SubsistemaCep();
        String cidade = cepApi.recuperarCidade(cep);
        String estado = cepApi.recuperarEstado(cep);
        
        SubsistemaCrm.gravar(nome, cep, cidade, estado);
    }
}

// ==========================================
// CLASSE PRINCIPAL (EXECUÇÃO)
// ==========================================
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- TESTE SINGLETON ---");
        Singleton s1 = Singleton.getInstancia();
        System.out.println("Endereço da Instância: " + s1);

        System.out.println("\n--- TESTE STRATEGY ---");
        Robo robo = new Robo();
        robo.setComportamento(new ComportamentoNormal());
        robo.mover();
        robo.setComportamento(new ComportamentoAgressivo());
        robo.mover();

        System.out.println("\n--- TESTE FACADE ---");
        Facade facade = new Facade();
        facade.cadastrarCliente("Murilo", "58400000");
        
        System.out.println("\nProjeto executado com sucesso e sem erros de pacote!");
    }
}