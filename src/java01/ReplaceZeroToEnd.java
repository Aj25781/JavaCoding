package java01;

public class ReplaceZeroToEnd {
	
	static public void replaceZero(int a[]) {
		
		int countNonZero=0; 
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0) {
				a[countNonZero]=a[i];
				
			countNonZero++;	
			}
			
			
		}
		while(countNonZero<a.length) {
			a[countNonZero++]=0;
		}
		
		for(int arr:a)
		{
			System.out.print(arr+" ");
		}
		
		
	}
	
	public static void main(String args[]) {
		
		int a[]= {0,1,0,3,12} ;
		
	replaceZero(a);
		
		
		
	}

}
