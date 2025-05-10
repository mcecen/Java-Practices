package methodlar;

	public class uret {
		int kapi;
		int vites;
		public uret(int kapi){
			this.kapi=kapi;
		}
		public uret(int kapi, int vites){
			this.kapi=kapi;
			this.vites=vites;
		}
		//public uret(){
		//	kapi=4;
		//}
	public static void main(String[] args) {
		uret a1= new uret(4);
		uret a2= new uret(4,5);
		//uret a3=new uret();
		System.out.println(a1.kapi);
		System.out.println(a2.vites);
		//System.out.println(a3.vites);
	}

}
