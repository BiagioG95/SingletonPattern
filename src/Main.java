/*
Design patterns - Singleton & static

Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
Creare 2 oggetti User di cui creerà un'istanza.
Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video


 */
public class Main {
    public static void main(String[] args) {
        // Primo oggetto User con valori di default
        User user1 = User.getInstance();
        System.out.println("Informazioni di default:");
        user1.stampaInformazioni();

        // Modifica delle informazioni
        user1.setNome("Mario");
        user1.setEta(30);

        // Secondo oggetto User (che in realtà punta alla stessa istanza e poi li modifica)
        User user2 = User.getInstance();
        System.out.println("Informazioni modificate:");
        user2.stampaInformazioni();

    }
    }
