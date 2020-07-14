import java.time.LocalDate;

public abstract class Personne implements Venue {

   //Auto généré
    protected int id;
   
    protected  String nomComplet;
    protected  LocalDate dateArr;
    protected  int  duree;

    public Personne (String nomComplet,
               LocalDate dateArr){
      this.nomComplet=nomComplet;
      this.dateArr=dateArr;
     //Initialisé ID
       this.duree=calculDuree();

    }

      public Personne (){
        //Initialisé ID
    }

   //Getters and Setters



   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet;
    }

   private int calculDuree(){
      return 0;
   }

}