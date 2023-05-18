import java.util.ArrayList;

public class Magasin {
    private ArrayList<Produit> stock;

    public Magasin(ArrayList<Produit> stock) {
        this.stock = stock;
    }

    public ArrayList<Produit> getStock() {
        return stock;
    }
}
