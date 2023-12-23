class Solution {
    public boolean isPathCrossing(String path) {
       List<List<Integer>> pointsReached = new ArrayList<>();
        
        List<Integer> currentPoint = new ArrayList<>();
        currentPoint.add(0);
        currentPoint.add(0);
        pointsReached.add(currentPoint);

        for(int i=0; i<path.length(); i++){
            char ch = path.charAt(i);
            int xCoordinate = pointsReached.get(i).get(0);
            int yCoordinate = pointsReached.get(i).get(1);

            switch(ch){
                case 'N':
                    yCoordinate++;
                    break;
                case 'S':
                    yCoordinate--;
                    break;
                case 'E':
                    xCoordinate++;
                    break;
                case 'W':
                    xCoordinate--;
                    break;
            }
            
            currentPoint = new ArrayList<>();
            currentPoint.add(xCoordinate);
            currentPoint.add(yCoordinate);

            if(pointsReached.contains(currentPoint))
                return true;
            pointsReached.add(currentPoint);
        }

        return false;
    }
}