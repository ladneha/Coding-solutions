/* Code Fights: interview question
  You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).
  Input:
  a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

  Output:
  rotateImage(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]

This solution is not in place rotation.
*/

int[][] rotateImage(int[][] a) {
    int row = a.length;
    int col = a[0].length;
    int t = row-1;
    int[][] arr = new int[row][col];
    
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            arr[i][j] = a[t][i];
            t--;
        }
        t = row-1;
    }
    return arr;
}
