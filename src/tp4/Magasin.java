import javax.xml.crypto.Data;
public class magasin {
    String adress;
    int id;
    int Capasitee;
    produit[] products;
    magasin(String adress,int id,int capasitee,produit[] p){
        this.adress=adress;
        this.id=id;
        this.Capasitee=capasitee;

        this.products=p;
    }
    void Affichermagasin(){
        System.out.println("id of the Market: "+id + " located in "+adress +" that supports "+Capasitee+" product");
        for (int i=0;i<products.length;i++){
            if (products[i] != null) {
                products[i].afficherProduit();
            }
        }
    }
}
    

