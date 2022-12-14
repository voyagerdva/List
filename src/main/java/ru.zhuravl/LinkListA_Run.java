package ru.zhuravl;

import java.util.Arrays;

public class LinkListA_Run {
    public static void main(String[] args) {
        System.out.println("\n\n========== Check ADD() ObjectA : ");

        InterfaceListA linkListA = new LinkListA();

        String dataA[] = {"Alfa", "Beta", "Gamma", "Delta"};


        for (String name: dataA) {
            ObjectA objectA = new ObjectA(name);
            linkListA.add(objectA);
        }
        System.out.println(linkListA.getSize() + "\n-----------------------\n");

//========================================================================================================
        System.out.println("\n\n========== Check intersect() method(): ");

        InterfaceListA linkListA1 = new LinkListA();
        InterfaceListA linkListA2 = new LinkListA();

        String data1[] = {"00", "11", "22", "33", "44", "55", "66", "77"};
        String data2[] = {"55", "44", "X", "77", "88"};


        for (String name: data1) {
            ObjectA objectA = new ObjectA(name);
            linkListA1.add(objectA);
        }
        int s = linkListA1.getSize();
        System.out.println(s + "\n-----------------------\n");
        linkListA1.printObjectsList();


        for (String name: data2) {
            ObjectA objectA = new ObjectA(name);
            linkListA2.add(objectA);
        }
        s = linkListA2.getSize();
        System.out.println(s + "\n-----------------------\n");
        linkListA2.printObjectsList();


        InterfaceListA linkListA3 = linkListA1.intersect((LinkListA) linkListA2);

        System.out.printf("%s %s \n", "size linkListA3: ", linkListA3.getSize());
        System.out.println(Arrays.toString(linkListA3.getListValuesNames()));
        linkListA3.printObjectsList();


//===================================================================================================
        System.out.println("\n\n========== Check addList() method(): ");

        linkListA1.addList((LinkListA) linkListA2);

        System.out.println(Arrays.toString(linkListA1.getListValuesNames()));
        linkListA1.printObjectsList();


//=========================================================================================================

        System.out.println("\n\n========== Check getNodeValueNames method(): ");

        System.out.println(((LinkListA) linkListA1).getNode(0).getValue().name);
        System.out.println(linkListA1.getElement(0));
        System.out.println(((LinkListA) linkListA1).getNode(1).getValue().name);
        System.out.println(linkListA1.getElement(1));
        System.out.println(((LinkListA) linkListA1).getNode(2).getValue().name);
        System.out.println(linkListA1.getElement(2));
        System.out.println(((LinkListA) linkListA1).getNode(3).getValue().name);
        System.out.println(linkListA1.getElement(3));
        System.out.println(((LinkListA) linkListA1).getNode(4).getValue().name);
        System.out.println(linkListA1.getElement(4));

        InterfaceItemA ref = ((LinkListA) linkListA1).getNode(0);
        System.out.println(ref.getName());
    //=========================================================================================================
        System.out.println("\n\n========== Check removeHead method(): ");

        InterfaceListA linkListA6 = new LinkListA();

        String data3[] = {"00", "11", "22", "33", "44", "55", "66", "77"};


        for (String name: data3) {
            ObjectA objectA = new ObjectA(name);
            linkListA6.add(objectA);
        }
        s = linkListA6.getSize();
        System.out.println(s + "\n-----------------------\n");
        linkListA6.printObjectsList();

        System.out.println("\n" + linkListA6.getSize() + "\n-----------------------\n");

        linkListA6.removeElement(16);
        System.out.println(Arrays.toString(linkListA6.getListValuesNames()));
        System.out.println("\n" + linkListA6.getSize() + "\n-----------------------\n");
        System.out.println();

    }





}



