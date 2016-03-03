
/**
 * Write a description of class candyGo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candyGo
{
    public static void main (String[] args)
    {
        int total = 0;      //total candies in my bag
        
        /*# To get started, create a bag of M&Ms called myBag*/
        
        BagMAndMs myBag = new BagMAndMs("Plain");
        
        /*# 1. What will the following line print (if anything?)
               Why does it work (even if that means it prints
               nothing) this way?
        */
        System.out.println(myBag);
        // It will print the toString method
        /*# 1.5  Create an overloaded constructor in the 
         * BagMAndMs class (details there) and then update you
         * object creation above to use the new method.
         */
        // done
        /*# 2. Which one of the following will add 1 red M&Ms
         * to my bag?  Uncomment that line. For the others,
         * be prepared to explain why they don't work.
         */
        // numRed += 1;  makes no sense, it's not a variable
        // myBag.numRed += 1;  method call not a variable, can't access the private instance variables`
        // myBag.addRed; needs the parentheses for the non-existant parameters
        myBag.addRed();
        // myBag.addRed(1);  There are no parameters accepted
        // addRed();  There is no method call
        // addRed(1);  There is no method call, and the parameter is not accepted 
        
        /*# 3. Write the statement to add the appropriate number
         * of candies in your bag. Then print out the contents
         * of your bag object to make sure it is correct.
         */
        int numCandy=myBag.addCandy(2,6,3,3,2,0);
        System.out.println(myBag);
        
        /*# 4. Write a print statment that will indicate how
         * many total candies are in your bag. For example:
         * "There are 13 candies in my bag"
         */
        System.out.println("There are "+numCandy+" candies in my bag");
        
        /*# 5. Create a second bag of M&Ms called myBag2,
           fill it appropriately, and print out its contents
           */
        BagMAndMs myBag2=new myBag2("Plain")
        int numCandy2=myBag2.addCandy(1,3,2,1,6,1);
        System.out.println(myBag2);
        /*# 6. How can you find out how many total candies 
         * you have (in both bags combined)? */
        int total=numCandy2+numCandy;
        /*# 7. Finally, create a method that allows you to 
         * eat some of this candy....
         */
        
    }
}
