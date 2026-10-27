class Solution {
    public int maxArea(int[] height) {
        int lp=0;
        int rp=height.length-1;
        int maxwater=0;
        while(lp<rp){
            int w=rp-lp;
            int h=Math.min(height[lp],height[rp]);
            int containerwater=w*h;
            if(containerwater>maxwater){
                maxwater=containerwater;
            }
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;





        // int maxwater=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int width=j-i;
        //         int h=Math.min(height[i],height[j]);
        //         int containerWater=h*width;
        //         if(containerWater>maxwater){
        //             maxwater=containerWater;
        //         }
        //     }
        // }
        // return maxwater;
    }
}