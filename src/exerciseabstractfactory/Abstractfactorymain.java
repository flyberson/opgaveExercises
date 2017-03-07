/*
 */
package exerciseabstractfactory;

import sun.security.acl.WorldGroupImpl;

/**
 *
 * @author flyberson
 */
public class Abstractfactorymain {
    static InfantryFactory hf1;
    static InfantryFactory of1;
    static InfantryUnit Hunit1;
    static InfantryUnit Hunit2;
    static InfantryUnit Ounit1;
    static InfantryUnit Ounit2;
    static World world;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        world = World.getInstance();
//        world.setName("The World");
    world.setName("Earth");
        System.out.println(world.getName());
        
        FactoryFactory ff = new FactoryFactory();
        hf1 = ff.createInfanftryFactory(1);
        of1 = ff.createInfanftryFactory(2);
        
        Hunit1 = hf1.createUnit(0);
        Hunit2 = hf1.createUnit(2);
       
        Ounit1 = of1.createUnit(3);
        Ounit2 = of1.createUnit(4);
        System.out.println(Hunit1+Hunit1.getClass().getSimpleName()+Hunit1.getRace());
        System.out.println(Hunit2+Hunit2.getClass().getSimpleName()+Hunit2.getRace());
        System.out.println(Ounit1+Ounit1.getClass().getSimpleName()+Ounit1.getRace());
        System.out.println(Ounit2+Ounit2.getClass().getSimpleName()+Ounit2.getRace());
        
        
        while((Hunit1.hits>0 || Hunit2.hits > 0) && (Ounit1.hits>0 || Ounit2.hits>0)){
            if(Hunit1.hits>0){
                Hunit1.attack(Ounit1);
                Hunit1.attack(Ounit2);
            }
             if(Hunit2.hits>0){
                Hunit2.attack(Ounit1);
                Hunit2.attack(Ounit2);
            }
              if(Ounit1.hits>0){
                Ounit1.attack(Hunit1);
                Ounit1.attack(Hunit2);
            }
               if(Ounit2.hits>0){
                Ounit2.attack(Hunit1);
                Ounit2.attack(Hunit2);
            }
            System.out.println("Human1 ="+Hunit1.hits + "  Human 2 ="+ Hunit2.hits 
                    + "  Orc1 =" + Ounit1.hits + "  Orc2 =" + Ounit2.hits);
        }
        
    }
  
    
}
