public class Cat implements Venue{

   //Auto généré
    private int id;
    private String nom;
    //private static int nbreCat;


    //Constructeur
    public Cat(){

    }

    public Cat(String nom){
       this.nom=nom;
   }


   //Getters and Setters
    public int getId(){
       return id;
    }
    public void setId(int id){
       this.id=id;
    }

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom : "+nom;
    }

}