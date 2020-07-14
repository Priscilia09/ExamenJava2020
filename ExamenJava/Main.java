import java.time.LocalDate;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {
    
String choix;
     Scanner clavier=new Scanner(System.in);
     Service service =new Service();
    do {

        System.out.println("1-Ajout Service");
        System.out.println("2-Lister les Services ");
        System.out.println("3-Ajouter un employé ");
        System.out.println("4-Lister les journaliers");
        System.out.println("5-Lister les embauchés d'un service");
        System.out.println("6-Quitter");
        System.out.println("Faites votre choix");
        choix=clavier.nextLine();
        switch(choix){
            case "1":
            System.out.println("Entrer le libelle du service");
               String libelle =clavier.nextLine();
              Cat cl=new Cat(libelle);
               service.creerCat(cl);
            break;

            case "2":

            service.listerCat();
            break;

            case "3":
            System.out.println("Entrer le Nom Complet");
            String nomComplet =clavier.nextLine();
            System.out.println("Entrer la Date Naissance");
            LocalDate dateNaiss= LocalDate.now();
            System.out.println("Entrer l'Année");
            int annee =clavier.nextInt();
            System.out.println("Saisir l'ID du service");
            service.listerCat();
            int idCat=clavier.nextInt();
            Cat catEmp=new Cat();
            catEmp.setId(idCat);

            Emp et =new Emp(nomComplet, dateNaiss, annee);
                   et.setCat(catEmp);
              service.ajouterPersonne(et);

            break;

            case "5":
            System.out.println("Saisir l'ID de l'employe ");
            service.listerCat();
            int id=clavier.nextInt();
            Cat cat=new Cat();
            cat.setId(id);
            service.listerEmpParCat(cat);
            break;

        }
        
    } while (choix!="6");

        
}
    
}