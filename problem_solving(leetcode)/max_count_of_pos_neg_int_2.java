class Solution {
    public int maximumCount(int[] nums) {
        //initialize two vars that count if the int is pos/neg
        int min = 0;
        int max = 0;
        //we loop through the array
        for(int i : nums){
            if(i < 0 ) {//add one to min if i < 0

                min++;
            } else  if(i > 0){//add one to min if i > 0
                max++;
            }
        }
        //method that checks what number is higher
        return Math.max(min,max);

        // 0 aint pos or neg
        //return max of negative/postive integers in an array
    }
}