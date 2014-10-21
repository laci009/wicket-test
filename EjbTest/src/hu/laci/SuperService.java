package hu.laci;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class SuperService
 */
@Stateless
public class SuperService implements SuperServiceLocal {

    /**
     * Default constructor. 
     */
    public SuperService() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getStuff(String message) {
    	if (message == null) {
    		return "cica";
    	} else {
    		return message + " is OK";
    	}
    }

}
