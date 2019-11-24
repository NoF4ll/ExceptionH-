package hue21_11_2019;

public class arrayOutOfB {

	public static void main(String[] args) {
		try
		{
			int [] a = new int[7];
			for(int i=0 ; i<=a.length+1;i++)
			{
				a[i] = i;
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			a.printStackTrace();
		}
	}

}
