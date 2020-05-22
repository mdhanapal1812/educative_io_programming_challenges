class CyclicSort {

  public static void sort(int[] nums) {
    // TODO: Write your code here  
    int j = 0;  
    for(int i=1;i<=nums.length;i++){
      nums[j] = i;
      j++;
    }
  }
}