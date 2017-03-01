/*
 */
package exerciseabstractfactory;

/**
 *
 * @author flyberson
 */
public class FactoryFactory {
    public InfantryFactory createInfanftryFactory(int race){
        if ( race==1){
            HumanInfantryFactory hf = new HumanInfantryFactory();
            return hf;
        }
        if ( race==2){
            OrcInfantryFactory of = new OrcInfantryFactory();
            return of;
        }
        return null;
    }
    
}
