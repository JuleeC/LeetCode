class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(int i =1; i <= n; i++) {
            int key = 0;
            int i_zero = i;
            while(i_zero != 0) {
                key += i_zero % 10;
                i_zero = i_zero / 10;
            }
            map.put(key,map.getOrDefault(key,0) +1);
            max = Math.max(max,map.get(key));
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> pairs : map.entrySet()){
            if(pairs.getValue() == max) {
                count++;
            }
        }
        return count;

    }
}