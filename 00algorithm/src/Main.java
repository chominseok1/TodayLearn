import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
		//구간합 
		/* 배열 A    15|13|10|7|3|12
		 * 합 배열 S  15|28|38|45|48|60
		 *  합 배열 만드는 공식 *S[i-1]+A[i] 
		 *  ex) 2에서 5까지 구하는 공식
		 *  S[5]=A[0]+A[1]+A[2]+A[3]+A[4]+A[5] 
		 *  S[1]=A[0]+A[1]
		 *  S[5]-S[1]= A[2]+A[3]+A[4]+A[5]
		 *  ==>S[j]-S[i-1] ***** i에서 j까지
		 *  백준 11659번 
		 *  5 3
			5 4 3 2 1
			1 3
			2 4
			5 5 
		 */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()); //5 
		int m=Integer.parseInt(st.nextToken()); //3
		int S[]=new int[N+1];
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			
			S[i]=S[i-1]+Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			System.out.println(S[b]-S[a-1]);
		}
	}

}
