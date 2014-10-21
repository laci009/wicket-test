package hu.laci;

import javax.ejb.Local;

@Local
public interface SuperServiceLocal {

    public String getStuff(String message);

}
