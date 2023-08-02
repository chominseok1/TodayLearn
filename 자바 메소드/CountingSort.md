<h1> 카운팅정렬 </h1>

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class vvvv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // Scanner 대체 /io
        String st=br.readLine().toUpperCase();
        int arr[] =new int[26]; // 알파벳의 갯수는 총 26개
        for(int i =0 ; i<st.length();i++) {
        	char c = st.charAt(i);
        	// a s d f ...
        	// arr[0] -> A  ->  c(A) -'A' -> 0 ,
//        	   arr[1] -> B      c(B) -'A' -> 1
        	// arr[2] -> c      c(C) -'A' -> 2
        	// ...                 
        	// arr[25] ->Z      c(Z) -'A' -> 25
        	arr[c-'A']++; // ex)  // Counting sort -
            // 만약에 알파벳이 B가 들어왔음 그러면 'B'-'A'=1
            //배열의 1번째 인덱스에 1이 들어옴 
            //=> 그말인 즉슨 arr[1]:알파벳 B의순서 이고 
            // arr[1]의 값은 1 => B가 1번 나왔다.
        }
        System.out.println(Arrays.toString(arr));
        int max=0;
        char c='?';
        for(int i=0;i<arr.length;i++)
        {
          if(max<arr[i])
          {  
        	  max=arr[i];
          c=(char)(i+65);
          }
          else if(max==arr[i])
          {
        	  c='?';
          }
        	  
        }
        System.out.println(c);
    }
}
```