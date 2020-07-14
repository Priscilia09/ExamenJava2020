public class Service {

     //Taille Reservation :nbre Cellule du Tableau
      final int TAILLE=10;
    //Taille Réélle :nbre element du Tableau
      private int nbreCat=0;//nbre Classe dans le tableau ,
                               //mais aussi la position d'insertion
      private int nbrePersonne=0;
    //Declaration des Tableaux
    private Cat tabcat[];
    private Personne [] tabPersonne;

    public Service(){
        //Creation du Tableau
        tabcat=new Cat[TAILLE];
        tabPersonne=new Personne[TAILLE];

    }


    public void creerCat(Cat cat){
        if(nbreCat<TAILLE){
            //Generer ID de la Classe
            cat.setId(nbreCat+1);
            tabcat[nbreCat]=cat;
            nbreCat++;
        }else{
            System.out.println("Tableau Rempli");
        }
        
    }
    public void listerCat(){
        for(int i=0;i<nbreCat;i++){
            System.out.println(tabcat[i].affiche());
        }
        
    }

    
    public void  ajouterPersonne(Personne pers){
          tabPersonne[nbrePersonne]=pers;
           nbrePersonne++;

    }

    public void listerEmpParCat(Cat cat){
        for(int i=0;i<nbrePersonne;i++){
            if(tabPersonne[i] instanceof Emp){
                //Convertion d'une Personne en un Etudiant=> downCasting
                //((Etudiant)tabPersonne[i]) possible car Etudiant herite de Personne
                   if(((Emp)tabPersonne[i]).getCat().getId()==cat.getId()){
                       System.out.println(tabPersonne[i].affiche());
                   }
            }
           
        }
        
    }

    //Uc 



    
}