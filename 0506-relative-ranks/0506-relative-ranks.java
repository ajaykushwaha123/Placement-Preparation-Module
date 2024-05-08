class Solution {
    int findMax(int[] score){
        int max=0;
        for(int i=0;i<score.length;i++){
            if(score[i]>max)max=score[i];
        }
        return max;
    }
    public String[] findRelativeRanks(int[] score) {
        int finalIdx=findMax(score);
        int[] arr=new int[finalIdx+1];
        for(int i=0;i<score.length;i++){
            arr[score[i]]=1;
        }
        for(int i=arr.length-2;i>=0;i--){
            arr[i]=arr[i+1]+arr[i];
        }
        String[] res=new String[score.length];
        for(int i=0;i<score.length;i++){
            int value=arr[score[i]];
            if(value<=3){
                if(value==1) res[i]="Gold Medal";
                else if(value==2) res[i]="Silver Medal";
                else res[i]="Bronze Medal";
            }
            else{
                res[i]=value+"";
            }
        }
        return res;
    }
}