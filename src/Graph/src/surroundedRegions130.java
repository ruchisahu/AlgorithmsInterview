import java.util.LinkedList;
import java.util.Queue;

public class surroundedRegions130 {
	 public static void solve(char[][] board) {
	     if(board.length == 0){
	            return ;
	        }
	        boolean[][] visit = new boolean[board.length][board[0].length];
	        int b = board.length;
	        int r = board[0].length;
	        Queue<int[]> q = new LinkedList<>();
	        int[][] direction = new int[][] {{1,0},{0,1},{0,-1},{-1,0}};
	        for(int i = 0; i < b; i++){
	            for(int j = 0; j < r; j++){
	                if(i == 0 || j == 0 || i == b-1 ||j == r-1){
	                    if(board[i][j] == 'O'){
	                        q.offer(new int[]{i,j});
	                        visit[i][j] = true;
	                    }
	                }
	            }
	        }
	        
	        while(!q.isEmpty()){
	            int size = q.size();
	            for(int i = 0; i < size; i++){
	                int[] pos = q.poll();
	                for(int j = 0; j < 4; j++){
	                    int x = pos[0]+direction[j][0];
	                    int y = pos[1]+direction[j][1];
	                    if(x >= 0 && x <b && y>=0 && y < r && !visit[x][y] && board[x][y] == 'O'){
	                        q.offer(new int[] {x,y});
	                        visit[x][y] = true;
	                    }
	                }
	            }
	        }
	        
	        for(int i = 0; i < b; i++){
	            for(int j = 0; j < r; j++){
	                if(!visit[i][j]){
	                    board[i][j] = 'X';
	                }
	            }
	        }
	        
	        
	        
	    }

	public static void main(String[] args) {
		char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		
		solve(board);

	}

}
