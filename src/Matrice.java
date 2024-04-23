public class Matrice {
    private int[][] matrice;

    public Matrice(int righe, int colonne) {
        this.matrice = new int[righe][colonne];
    }

    public void inizializza(int[] valori) {
        int k = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                matrice[i][j] = valori[k++];
            }
        }
    }

    public void scambiaRighe() {
        int[][] nuovaMatrice = new int[matrice[0].length][matrice.length];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                nuovaMatrice[j][i] = matrice[i][j];
            }
        }
        matrice = nuovaMatrice;
    }

    public void stampa() {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrice matrice = new Matrice(2, 3);
        int[] valori = {1, 2, 3, 4, 5, 6};
        matrice.inizializza(valori);

        System.out.println("Matrice di partenza:");
        matrice.stampa();

        System.out.println("\nMatrice risultato:");
        matrice.scambiaRighe();
        matrice.stampa();
    }
}