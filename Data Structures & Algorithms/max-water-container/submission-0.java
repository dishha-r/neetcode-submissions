class Solution {
    public int maxArea(int[] heights) {
        int maxWater =0;
        int lp=0, rp=heights.length-1;
        
        while(lp<rp){
            int w= rp-lp;
            int ht = Math.min(heights[lp], heights[rp]);
            int currWater = w*ht;
            maxWater = Math.max(maxWater, currWater);

        if(heights[lp] < heights[rp]){
          lp++ ;
            }else {
                rp--;
            } 
        }
        return maxWater;
    }
}
