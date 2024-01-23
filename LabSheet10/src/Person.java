public class Person {
   private String firstName;
   private String lastName;
   
   //Default Constructor
   //Initaialliza firstName and lastName to an empty string
   Person(){
	   firstName=lastName="";
   }
   
   //Constrictor with parameter
   Person(String first,String last){
	   firstName =first;
	   lastName = last;
   }
   
   //Method to set firstName and lastName with parameters
   public void setName(String first,String last) {
	   firstName = first;
	   lastName = last;
   }
   
   //Method to return fisrtName
   public String getFirstName() {
	   return firstName;
   }
   public String getLastName() {
	   return lastName;
   }
   
   //Method to output the first name and last Name
   public String toString() {
	   return firstName+" "+lastName;
   }

}
