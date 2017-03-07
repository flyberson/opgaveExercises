/*
 */
package exerciseabstractfactory;

/**
 *
 * @author flyberson
 */
public class OrcInfantryFactory extends InfantryFactory {
    int techlevel;
    public InfantryUnit createUnit(int techlevel){
           if(techlevel==0){
            RockHauler rh = new RockHauler(2, 0, 12, 2);
            rh.setRace(2);
            return rh;}
        if(techlevel==1){
            SpearThrower st = new SpearThrower(3, 2, 12, 3);
            st.setRace(2);
            return st;}
        if(techlevel==2){
            Archer a = new Archer(4, 2, 12, 4);
            a.setRace(2);
            return a;}
        if(techlevel==3){
             CrossbowMan cbm = new CrossbowMan(4, 2, 12, 5);
            cbm.setRace(2);
             return cbm;}
        if(techlevel==4){
            Musketeer m = new Musketeer(5, 2, 12, 5);
            m.setRace(2);
            return m;}
        return null;
}
    
}
