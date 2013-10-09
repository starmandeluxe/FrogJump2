import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//find the earliest time a frog can jump to the destination point
//based on the earliest index that an array of numbers makes a sequential
//path to the destination point
public class FrogJump2 {
	
	public static void main(String[] args)
	{
		System.out.println(solution(5, new int[]{1,3,1,4,2,3,5,4}));
	}
	
	public static int solution(int X, int A[])
	{
		//initialize an array that spans the length of the goal
		//the frog needs to reach
				//default all values in the array to -1
		List<Integer> visited = new ArrayList<Integer>(Collections.nCopies(X, -1));
		
		//iterate through the leaf array 
		//and mark the lowest index of each
		for (int i = 0; i < A.length; i++)
		{
			if (visited.get(A[i]-1) == -1)
			{
				//save the index of the visited leaf 
				//(first time only)
				visited.set(A[i]-1, Integer.valueOf(i));
			}
	
		}
		//if not all leaves were placed, return -1, otherwise
		//return the maximum index of the last element
		if (visited.contains(Integer.valueOf(-1)))
		{
			return -1;
		}
		else
			return Collections.max(visited).intValue();
		
		
	}

}

