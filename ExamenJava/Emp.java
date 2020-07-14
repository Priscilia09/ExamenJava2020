import java.time.LocalDate;

public class Emp extends Personne {


    
    private int annee;

    //Propriété navigationnelle
     private Cat  catEmpl;
   
    //Constructeur
       //Par defaut
           public Emp(){
          }
      //Surcharge du Contructeur
         //Creer un Objet puis de l'initialiser
          public Emp(String nomComplet,
               LocalDate dateNaiss,int annee ){
            //Initialisation de la personne
              super(nomComplet,dateNaiss);
             
             this.annee=annee;
          }

   //Getters and Setters
     public Cat getCat(){
        return this.catEmpl;
     }

     public void setCat(Cat cat){
           this.catEmpl=cat;
   }
   //redefinition de la methode affiche()

    @Override
    public String affiche(){
    //super signifie personne
    //this signifie etudiant
       return super.affiche()
                     +" Annee "+annee;
    }

}