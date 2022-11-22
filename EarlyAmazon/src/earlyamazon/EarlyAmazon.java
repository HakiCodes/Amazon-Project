/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earlyamazon;
import java.util.Scanner;
/**
 *
 * @author nokolie23
 */
public class EarlyAmazon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);    
    String[] items =  { "Harry Potter Boxed Set", "Deck of Cards", "Water Bottle", "Socks", "Eyebrow Pencil"};
    double[] prices = {    44.99                ,     4.99       ,     8.99      ,  24.99 ,         7.99    };
    int[] qty = {           10                  ,    1000        ,    150        ,    40000,   300          };
    int choice;
    Amazon bob = new Amazon(items, prices, qty);
    
    bob.sortitem();
    
    
        System.out.println("--------AMAZON TEXT MENU--------");
        System.out.println("1. Sort by Name");
        System.out.println("2. Sort by Price");
        System.out.println("3. Sort by Quantity");
        System.out.println("4. Search by Item");
        System.out.println("5. Search by by Price");
        System.out.println("PLEASE ENTER YOUR OPTION:");
        choice = in.nextInt();
        in.nextLine();
        if(choice == 1)
        {
            bob.sortitem();
        }
        if(choice == 2)
        {
            bob.sortprice();
        }
        if(choice == 3)
        {
            bob.sortqty();
        }
        if(choice == 4)
        {
            System.out.println("Which item?");
            String i = in.nextLine();
            bob.searchitem(i);
        }
        if(choice == 5)
        {
            System.out.println("Name your price.");
            double p = in.nextDouble();
            bob.searchprice(p);
        }
    }
    
}
    
