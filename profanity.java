import java.util.*;
public class profanity {

	public static void main(String[] args) {
		String[] badwords= {"mad","fool","retard","dumb"};
		Scanner s = new Scanner(System.in);
		String comments;
		comments = s.nextLine();
		String[] str= comments.split(" ");
		int len=str.length;
		int len1=badwords.length;;
		boolean isProf=false;
		for(int i=0; i<len; i++)
		{
			for(int j=0; j<len1; j++)
			{
			if(str[i].equals(badwords[j]))
			{
				isProf=true;
			}
			
			}
		}
		if(isProf)
		{
			System.out.println("profanity found");
		}
		else
			System.out.println("profanity not found");

	}

}
