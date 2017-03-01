/*
 */
package exerciseabstractfactory;

/**
 *
 * @author flyberson
 */
public abstract class InfantryFactory {
    public InfantryUnit createUnit( int techlevel){
           if(techlevel==0){
            RockHauler rh = new RockHauler();
            return rh;}
        if(techlevel==1){
            SpearThrower st = new SpearThrower();
            return st;}
        if(techlevel==2){
            Archer a = new Archer();
            return a;}
        if(techlevel==3){
             CrossbowMan cbm = new CrossbowMan();
            return cbm;}
        if(techlevel==4){
            Musketeer m = new Musketeer();
            return m;}
        return null;
        
        
    }
    
}
