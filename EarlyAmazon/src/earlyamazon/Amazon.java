/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earlyamazon;

/**
 *
 * @author nokolie23
 */
public class Amazon {
    
    private String[] item;
    private double[] price;
    private int[] qty;
    
    Amazon()
    {
        item = new String[5];
        price = new double[5];
        qty = new int[5];   
    }
    
    Amazon(String[] i, double[] p, int[] q)
    {
        item = i;
        price = p;
        qty = q;
    }
    
    void sortqty()
    {
        
        int[] nums = qty;
            
        for(int x = 0; x<nums.length; x++)
        {
            System.out.println(item[x] + " -- " + nums[x] + "ct" + " -- " + "$" + price[x]);
        }
        System.out.println("");
        //Sort Code
        
        boolean sorted = false;
        
        while(!sorted)
        {sorted = true;
        for(int x = 0; x < nums.length - 1; x++)
        {
            if(nums[x] < nums[x+1]) //switches the values
            {
                int temp = nums[x+1];
                nums[x+1] = nums[x];
                nums[x] = temp;
                
                String temp2 = item[x+1];
                item[x+1] = item[x];
                item[x] = temp2;
                
                double temp3 = price[x+1];
                price[x+1] = price[x];
                price[x] = temp3;
                
                
                
                sorted = false;
            }
        }
        }
        
           for(int x = 0; x<nums.length; x++)
        {
            System.out.println(item[x] + " -- " + nums[x] + "ct" + " -- " + "$" + price[x]);
        }
    }
    //---------------------------------SORT ITEM--------------------------------
    void sortitem()
    {
        
        int[] nums = qty;
            
        for(int x = 0; x<nums.length; x++)
        {
            System.out.println(item[x] + " -- " + nums[x] + "ct" + " -- " + "$" + price[x]);
        }
        System.out.println("");
        //Sort Code
        
        boolean sorted = false;
        
        while(!sorted)
        {sorted = true;
        for(int x = 0; x < item.length - 1; x++)
        {
            if(item[x].compareTo(item[x+1]) > 0) //switches the values
            {
                int temp = nums[x+1];
                nums[x+1] = nums[x];
                nums[x] = temp;
                
                String temp2 = item[x+1];
                item[x+1] = item[x];
                item[x] = temp2;
                
                double temp3 = price[x+1];
                price[x+1] = price[x];
                price[x] = temp3;
                
                
                
                sorted = false;
            }
        }
        }
        
           for(int x = 0; x<nums.length; x++)
        {
            System.out.println(item[x] + " -- " + nums[x] + "ct" + " -- " + "$" + price[x]);
        }
    }
    
    /// -----------------------------SORT PRICE---------------------------------
    void sortprice()
    {
        
        int[] nums = qty;
            
        for(int x = 0; x < price.length; x++)
        {
            System.out.println(item[x] + " -- " + nums[x] + "ct" + " -- " + "$" + price[x]);
        }
        System.out.println("");
        //Sort Code
        
        boolean sorted = false;
        
        while(!sorted)
        {sorted = true;
        for(int x = 0; x < price.length - 1; x++)
        {
            if(price[x] < price[x+1]) //switches the values
            {
                double temp = price[x+1];
                price[x+1] = price[x];
                price[x] = temp;
                
                String temp2 = item[x+1];
                item[x+1] = item[x];
                item[x] = temp2;
                
                sorted = false;
            }
        }
        }
        
           for(int x = 0; x < price.length; x++)
        {
            System.out.println(item[x] + " -- " + nums[x] + "ct" + " -- " + "$" + price[x]);
        }
    }
    
    void searchprice(double p)
    {
        for(int x = 0; x < price.length; x++)
        {
            if(price[x] == p)
            {
                System.out.println(item[x]+ " -- " + price[x] + " -- " + qty[x]);
            }
        }
    }
    
    void searchitem(String i)
    {
        for(int x = 0; x < item.length; x++)
        {
            if(item[x].equals(i))
            {
                System.out.println(item[x]+ " -- " + price[x] + " -- " + qty[x]);
            }
        }
    }
    
}