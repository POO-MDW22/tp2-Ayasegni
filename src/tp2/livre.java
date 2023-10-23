public class livre {
    private int id;
    private String titre;
    private String auteur;
    private float prix;
    static int nb;
    public livre(int id, String titre,  String auteur, float prix) {

        this.auteur = auteur;
        this.titre = titre;
        this.id = id;
        this.prix = prix;
        nb++ ;

    }

    public void affiche() {
        System.out.println("id: " + this.id + "auteur est  " + this.auteur  + "titre: " + this.titre + "prix :" + this.prix+"nb:");
    }
    public void settitre(String t){
        this.titre=t;
    }
    public String gettitre(){

        return this.titre;
    }

    public void setauteur(String p){
        this.auteur=p;}
    public String getauteur(){
        return this.auteur;}
    public void setid(int i){
        this.id=i;
    }
    public int getid(){
        return this.id;
    }
  public void setprix(float p){
      this.prix=p;
         }
   public float  getprix(){
        return this.prix;
    }
 public String toString () {
     return "le livre est:"+this.titre+"l auteur est:"+this.auteur+"le prix:"+this.prix+"l id est "+this.id;
    }
    }


