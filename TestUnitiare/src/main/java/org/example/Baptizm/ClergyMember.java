package org.example.Baptizm;

public class ClergyMember {

    public boolean IsPriest;
    public boolean IsPop;

    public ClergyMember(){
        IsPriest = false;
        IsPop = false;
    }

    public boolean isPriest() {
        return IsPriest;
    }

    public void setPriest(boolean priest) {
        IsPriest = priest;
    }

    public boolean isPop() {
        return IsPop;
    }

    public void setPop(boolean pop) {
        IsPop = pop;
    }
}
