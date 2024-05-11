class Solution {
         public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
           Double[][] ratio=new Double[quality.length][2];
        for(int i=0;i<quality.length;i++) {
        	ratio[i][0]=(double)wage[i]/(double)quality[i];
        	ratio[i][1]=(double)quality[i];
        }
        Arrays.sort(ratio,(a, b)->(Double.compare(a[0], b[0])));
        PriorityQueue<Double> q = new PriorityQueue<>((a, b) -> Double.compare(b, a));
        double cost=Double.MAX_VALUE;
        double qual=0.0d;
        for(Double[] rat:ratio) { 
        	qual+=rat[1];
        	q.add(rat[1]); 
        	if(q.size()>k)
        		qual-=q.poll();  
        	if(q.size()==k)
        		cost=Math.min(cost, qual*rat[0]);
        }
        
        
        return cost;
    }
    
}