package PAP;
public class Palindrome {
    public boolean palindrome(int x)
    {
        int store=x;
		boolean flag=true;
		if(x<0){
		 flag=false;
		}
		else{
			int sum=0;
			while(x>0){
				int r=x%10;
				sum=sum*10+r;
				x=x/10;
			}
			if(store==sum)
				flag=true;
			else
				flag=false;
			return flag;
		}
		if(flag==true)
			return true;
		else
			return false;
    }
}
