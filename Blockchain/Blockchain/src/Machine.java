public class Machine extends Noeud {

    int ID;
    String mdp;

    int degreFiabilite;
    /**
     * Variables de verifications
     */
    boolean checkVitesse;
    boolean checkConso;
    boolean checkForce;

    /**
     * Constructeur d'une Machine
     * int ID : identifiant de la machine ou numéro
     * String mdp : mot de passe de la machine en brut
     * boolean checkVitesse, checkConso, checkForce : Variables de contrôle
     * degrefiabilite prends la somme des booleen convertis en int
     */
    public Machine(int ID, String mdp, boolean checkVitesse, boolean checkConso, boolean checkForce) {
        super();
        this.ID = ID;
        this.mdp = mdp;

        this.checkVitesse = checkVitesse;
        this.checkConso = checkConso;
        this.checkForce = checkForce;
        this.degreFiabilite = (boolToInt(checkConso) + boolToInt(checkForce) + boolToInt(checkVitesse));
    }


    /**
     * Converti un boolean a en int (true = 1 / False = 0)
     */
    int boolToInt(boolean a) {
        return Boolean.compare(a, false);
    }


    /**
     * Redefinition de la fonction .toString pour renvoyer la chaîne d'une machine
     */
    @Override
    public String toString() {
        String toReturn = "\nMachine: " + ID + "\nmdp: " + mdp + "\ncheckVitesse: " + checkVitesse + "\ncheckConso: " + checkConso + "\ncheckForce: " + checkForce + "\nFiabilite: " + degreFiabilite;
        if (degreFiabilite == 3) {
            toReturn += " (FIABLE)";
        } else {
            toReturn += " (NON FIABLE)";
        }
        return toReturn;
    }

    /**
     * Fonction qui affiche une machine
     */
    public void afficher() {
        System.out.println(this.toString());
    }

/**Main de test creation et affichate*/
/*
    public static void main(String[] args){
        Machine t = new Machine(1,"sdfsdf",true,true,true);
       t.afficher();

        Machine f= new Machine(2,"f trdfg htdf",false,true,false);
        f.afficher();
    }
*/

}
