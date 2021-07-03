import java.util.*;
public class Max_length
 {

	public static void main(String[] args) {
      
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string:");
		String a= s.nextLine();
		int  n = a.length();
		int res =0, cur_len =0;
		for(int i= 0; i<n ;i++)
		{
			if(a.charAt(i) != ' ')
			{
				cur_len++;
			}
			else
			{
				res = Math.max(res, cur_len);
				cur_len = 0 ;
			}
		}
		
		System.out.println(res);
	}

}