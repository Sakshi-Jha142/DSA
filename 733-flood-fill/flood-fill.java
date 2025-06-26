class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        makeFlood(image,sr,sc,color,image[sr][sc]);
        return image;
    }

    public static void makeFlood(int[][] image, int sr, int sc, int color,int curr){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length|| curr==color ){
            return ;
        }
        if(curr!=image[sr][sc])
            return ;
        image[sr][sc]=color;
        makeFlood(image,sr+1,sc,color,curr);
        makeFlood(image,sr-1,sc,color,curr);
        makeFlood(image,sr,sc+1,color,curr);
        makeFlood(image,sr,sc-1,color,curr);

    }
}