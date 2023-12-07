import java.io.*;
import java.util.*;
public class 버블정렬 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//버블정렬: 데이터의 인접 요소끼리 비교하고,swap연산을 수행하며 정렬하는 방식 
		/*
		 * 42 32 24 60 15
		 *  swap
		 * 32 42 24 60 15
		 * 	  swap
		 * 32 24 42 60 15
		 * 		no swap
		 * 32 24 42 60 15
		 * 			swap
		 * 32 24 42 15| 60
		 * ***************
		 * 
		 * 32 24 42 15 60
		 *  swap
		 *  
		 * 24 32 42 15 60
		 *   no swap
		 * 24 32 42 15 60
		 * 		 swap
		 * 24 32 15 42 60
		 * 		   no swap 
		 * 24 32 15 |42 60|
		 * 이런식으로 앞에꺼 뒤에 꺼 비교해서 정렬하는 방식
		 * 예제 
		 * 5
		 * 5
		 * 2
		 * 3
		 * 4
		 * 1
		 */ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<N-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
