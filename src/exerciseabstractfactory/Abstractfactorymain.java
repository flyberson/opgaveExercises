/*
 */
package exerciseabstractfactory;

/**
 *
 * @author flyberson
 */
public class Abstractfactorymain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Archer archer1 = new Archer();
        Archer archer2= new Archer();
        RockHauler rh1= new RockHauler();
        RockHauler rh2= new RockHauler();
        SpearThrower st1 = new SpearThrower();
        SpearThrower st2 = new SpearThrower();
        CrossbowMan cm1 = new CrossbowMan();
        CrossbowMan cm2 = new CrossbowMan();
        Musketeer m1 = new Musketeer();
        Musketeer m2 = new Musketeer();
        
        while (rh1.hits>0 && m2.hits >0){
            m2.attack(rh1);
            rh1.attack(m2);
            System.out.println("Musk hits "+m2.hits);
            System.out.println("Rock hits "+rh1.hits);
        }
        
    }
  
    
}
