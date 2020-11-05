package codingwizards;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int no = 1000000;
		long noBeingChecked = 0;
		long maxLngth = 0;
		long initial = 0;
		for(int i = 2; i <= no; i++)
		{
			int len = 1;
			noBeingChecked = i;
			while(noBeingChecked!=1)
			{
				if(noBeingChecked%2 == 0)
					noBeingChecked/=2;
				else
					noBeingChecked = noBeingChecked*3+1;
				len++;
			}
			if(len > maxLngth)
			{
				maxLngth = len;
				initial = i;
			}
		}
		System.out.println(initial);
	}

}
