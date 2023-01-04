package Graph.src;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class numOfMinutes1376 {
	public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
	      LinkedList<Integer> adj[]=new LinkedList[n+1];
	    for(int i=0;i<=n;i++)
	        adj[i]=new LinkedList<>();
	    for(int i=0;i<manager.length;i++)
	        if(manager[i]!=-1) adj[manager[i]].add(i);
	    
	     int ans=0;
	     Queue<int[]> q=new LinkedList<>();
	     q.add(new int[]{headID,0});
	    while(!q.isEmpty()){
	        int[] peek=q.poll();
	        int id=peek[0];
	        int time=peek[1];
	        int it=informTime[id];
	        ans=Math.max(ans,time);
	        Iterator<Integer> iterator=adj[id].listIterator();
	        while(iterator.hasNext())
	            q.add(new int[]{iterator.next(),time+it});
	    }
	    return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, headID = 2;
		int[] manager = {2,2,-1,2,2,2};
		int[] informTime = {0,0,1,0,0,0};
		
		System.out.println(numOfMinutes(n, headID, manager, informTime));

	}

}
