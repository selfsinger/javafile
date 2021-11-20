package house;

public class House {
   public House()
   {
	   this("duplex");
	   System.out.println("default constructore");
   }
   public House(String type)
   {
	   this("white",2000000);
	   System.out.println(" Type of the house : " +type);
   }
   public House(String color,double cost)
   {
	   this(6,"Italian",2,"sofa");
	   System.out.println(" House color is :" +color+ "\n House cost is : " +cost);
   }
   public House(int bedroom,String kitchen,int bathroom,String hall)
   {
	 System.out.println(" Number of bedrooms are : " +bedroom+ "\n Style of kitchen is : " +kitchen+ "\n Number of bathrooms are : " +bathroom+ "\n Attraction of hall is : " +hall);
   
   }
   }
