import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[7];
		int oddnum = 0;
		for(int i=0;i<nums.length;i++) {
			System.out.print("Input number "+ (i+1)+":");
			nums[i] = scan.nextInt();
			if(nums[i]%2!=0) {
				oddnum++;
			}
		
		}
		System.out.println("");
		System.out.print("There are "+oddnum+" of number"+"\nList of odd number : ");
		for(int _nums:nums) {
			if(_nums%2!=0) {
				System.out.print(_nums+" ");
			}
		}

	}

}
