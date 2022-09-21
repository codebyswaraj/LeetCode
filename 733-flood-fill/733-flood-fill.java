class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image == null || image.length ==0 || image[0].length == 0) return image;
        
        if(image[sr][sc] == color) return image;
        
        floodFill(image, sr, sc, image[sr][sc], color);
        return image;
        
    }
     public void floodFill(int[][] image, int sr, int sc, int prevColor, int newColor) {
         System.out.println(sr + "   " + sc);
         if(sr < 0 || sr >= image.length || sc <0 || sc >=image[0].length) return;
         if(image[sr][sc] != prevColor) return;
         image[sr][sc] = newColor;
         floodFill(image, sr-1, sc, prevColor, newColor);
         floodFill(image, sr, sc-1, prevColor, newColor);
         floodFill(image, sr+1, sc, prevColor, newColor);
         floodFill(image, sr, sc+1, prevColor, newColor);
     }
    
}