package diziler;

public class diziler {
	public static void main(String[] arg){
		int ikiboy[][]= new int[3][];
		ikiboy[0]=new int [2];
		ikiboy[1]=new int [1];
		ikiboy[2]=new int [3];
		ikiboy[0][0]=89;
		ikiboy[0][1]=32;
		ikiboy[1][0]=5;
		ikiboy[2][0]=60;
		ikiboy[2][1]=78;
		ikiboy[2][2]=49;
		int a=0;
		for(int i=0; i<ikiboy.length; i++)
			 a += ikiboy[i].length;
		System.out.println(a);
	}
}
