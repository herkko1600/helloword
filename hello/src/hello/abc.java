/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author herkko
 */
public class abc {
         public static void main(String[] args) {
    
    BInvoice paita= new BInvoice("aaa", "book", 3, 10);
    paita.setUnitPrice(20.0);
    System.out.println("paita hinta: " + paita.getUnitPrice());
    paita.setQty(5);
    System.out.println("paita lukumaara: " + paita.getQty());
    System.out.print("kokonaishinta: " + paita.getTotal(0, 0));
    System.out.println(paita.toString());
    //System.out.println(paita.toString());
    /*
    BInvoice paidat= new BInvoice(20.0,5);
    System.out.println(paidat.getTotal(20, 5));
     }
}
