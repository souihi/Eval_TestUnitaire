package org.example;

import org.example.Baptizm.Baptizm;
import org.example.Baptizm.ClergyMember;

public class Main {
    public static void main(String[] args) {
        ClergyMember clergyMembers =new ClergyMember();
//        clergyMembers.setPriest(true);

        Baptizm baptizm = new Baptizm(clergyMembers);
        System.out.println("Peut-il être baptisé ?" + baptizm.CanBeBaptizedBy(clergyMembers));

    }


}