package month01.day01;
/*
 * 未完成的solution
 * 问题：给定多个数字放到数组，将各个数字拼接，使得拼接的数字最大，返回字符串类型
 */
public class Solution {
	
	public static void main(String[] args) {
		Solution so = new Solution();
		int[] arr = {12, 3, 4, 5, 6, 7, 34};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		String str = so.solve(arr);
		System.out.println(str);
		
	}
	
    public String solve (int[] nums) {
    	int[] arr = nums;
    	for(int i=arr.length-1; i>0;i--) {
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		StringBuffer s= new StringBuffer();
		for(int i=0; i<arr.length; i++) {
			s.append(arr[i]);
		}
    	
    	return s.toString();
        // write code here
    }
}
