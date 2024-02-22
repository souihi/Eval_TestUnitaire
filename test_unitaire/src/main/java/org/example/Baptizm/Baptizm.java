package org.example.Baptizm;

public class Baptizm {

    public org.example.Baptizm.ClergyMember ClergyMember;

    public Baptizm(ClergyMember clergyMember){
        ClergyMember = clergyMember;
    }
    public boolean CanBeBaptizedBy(ClergyMember clergyMember){
        return clergyMember.IsPriest || clergyMember.IsPop;
    }

    public boolean CanBeTeachedBy(ClergyMember clergyMember)
    {
        return  clergyMember == ClergyMember;
    }

    public org.example.Baptizm.ClergyMember getClergyMember() {
        return ClergyMember;
    }

    public void setClergyMember(org.example.Baptizm.ClergyMember clergyMember) {
        ClergyMember = clergyMember;
    }
}
