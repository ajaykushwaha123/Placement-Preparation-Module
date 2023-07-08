

//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       for(int i = 0; i< n ;i++){
            HashMap<Integer,Integer>map = new HashMap<>();
            for(int j = i+1; j< n; j++){
                int sum = (A[i] + A[j]);
                if(map.containsKey(X-sum)){
                    return true;
                }else{
                    map.put(A[j],i);
                }
            }
        }
        return false;
    
    }
}
