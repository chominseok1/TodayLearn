 <h1> StringTokenizer </h1>

 ```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("입력하세요:");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		//System.out.println(st.countTokens());
		String[] s1=new String[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()) {
			
			s1[i]=st.nextToken();
			i++;
		}
		System.out.println(Arrays.toString(s1));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(br.readLine());
		System.out.println(st.countTokens());
		StringBuffer sb=new StringBuffer(str);
	
	     sb.append("야호");
		System.out.println(sb.reverse());
		
		 BufferedReader b1=new BufferedReader(new InputStreamReader(System.in)); 
	        // 문자 받은거 스캐너 대체
	        String st=b1.readLine();
	        StringBuffer sb1=new StringBuffer(st);
	        System.out.println(sb1);
	        System.out.println(sb1.reverse());
	        if(sb1.equals(sb1.reverse()))
	        {
	            System.out.println("1");
	        }
	        else
	        {
	            System.out.println("0");
	        }
	}

}

 ```