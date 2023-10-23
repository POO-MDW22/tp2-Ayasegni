public class test {
    public static void main(String[] args){
        livre l1=new livre(2,"voiture","opel",30000000);
        l1.affiche();
        System.out.println("le nv titre est:"+l1.nb);
        l1.settitre("moto  ");
        l1.gettitre();
        l1.setauteur(" rover ");
        l1.getauteur();
        l1.setid(3);
        l1.getid();
     l1.setprix(4000);
     l1.getprix();
     l1.affiche();
        System.out.println(l1.toString());
    }
}
