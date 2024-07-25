public class Singleton {

    // A variável que vai armazenar a instância única da classe
    private static Singleton instance;

    // O construtor é privado para evitar a criação de instâncias fora da classe
    private Singleton() {
        // Inicialização do Singleton
    }

    // Método público para obter a instância única da classe
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            // Se a instância ainda não foi criada, cria uma nova instância
            instance = new Singleton();
        }
        return instance;
    }
}
