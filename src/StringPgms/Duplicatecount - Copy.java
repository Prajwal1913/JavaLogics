package Replace;

public class Duplicatecount {
		public static void main(String[] args) {
			String str="mummy";
			int count=0;
			char[] ch=str.toCharArray();
			//String[] str1 = str.split(" ");
			for(int i=0;i<ch.length;i++)
			{
				boolean flag=true;
				for(int j=0;j<ch.length;j++){
					if(ch[i]==ch[j] && i!=j)
					{
						flag=false;
						break;
					}
				}
				if(flag==false)
				{
					count++;
				}
			}
			System.out.println(count);
	}
}