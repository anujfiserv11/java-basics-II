public class Cat {
     private String name;

    // Constructors...
   public Cat(String name)
   {

   
this.name = name;
   }
   
   // Methods...
   public String getName() {
       return name;
   }
   public String toString() {
    return "This is: " + name;
}
    public static void main(String[] args)
    {
        var myCat = new Cat("Gypsy");
 System.out.println(myCat.toString());
    }
}
