
public class LabExample701 {

	public static void main(String[] args) {
	 int[] nums = {12,50,93,45,75,52,80};
	 for(int i=0;i<nums.length;i++) {
		 System.out.print("num["+i+"]="+nums[i]);
	 }
	 System.out.print("using foreach to display value of array");
	 //using foreach
	 for(int _nums:nums) {
		 int j=0;
		System.out.println("num["+j+"]="+_nums);
		j++;
	 }
	 printArrayNumber(nums); //method not return value
	}//end of main
	
	public static void printArrayNumber(int[] number) {
		System.out.println("using method to display value of array");
		for(int i=0;i<number.length;i++) {
			 System.out.print("num["+i+"]="+number[i]);
		 }
	}// end of printArrayNumber

}
