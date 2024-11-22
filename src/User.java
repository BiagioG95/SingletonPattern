public class User {
    private String nome;
    private Integer eta;

    // Unica istanza della classe User
    private static User instance;

    // Costruttore privato per impedire la creazione di istanze esterne
    private User() {
        this.nome = "Default Name";
        this.eta = 0;
    }

    // Metodo statico per ottenere l'unica istanza della classe
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    // Metodo per stampare le informazioni
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome + ", Età: " + eta);
    }
}
