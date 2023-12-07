import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_23969 {
	 public static void main(String args[]) throws IOException{
		 /*
		  *  6 10
			 4 6 5 1 3 2
			 출력: 2 4
			 6 12
			 4 6 5 1 3 2
			 출력: -1
		  */
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st=new StringTokenizer(br.readLine());
	        int N=Integer.parseInt(st.nextToken());
	        int c=Integer.parseInt(st.nextToken());
	        int arr[]=new int[N];
	        st=new StringTokenizer(br.readLine());
	        int count=0;
	        for(int i=0;i<N;i++){
	            arr[i]=Integer.parseInt(st.nextToken());
	        }
	        // 2중 for문을 한번에 나가기 위해서는 loop를 지정하고 break 루프명;
	        loop:
	        for(int i=0;i<N-1;i++){
	            for(int j=0;j<N-1-i;j++){
	                if(arr[j]>arr[j+1]){
	                    
	                    int temp=arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=temp;
	                    count++;
	                    if(count==c)     	
		                    break loop;
	                }
	                System.out.println(count+":"+Arrays.toString(arr));
	                
	            }
	        }
	        if(count<c)
                System.out.println(-1);
            else {
            	for(int i=0;i<N;i++) {
                    if(i!=N-1)
            		System.out.print(arr[i]+" ");
                    else
                     System.out.print(arr[i]);   
            	}
            }
          
     }
}
