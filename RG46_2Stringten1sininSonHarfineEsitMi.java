package Practice_Mentoring;

public class RG46_2Stringten1sininSonHarfineEsitMi {
    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen bir program yazınız.

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */

        String x="feminine";
        String y="nine";
        String z="tio";

        kontrolEt(x,y,z);

    }

    public static void kontrolEt(String x, String y, String z) {
        System.out.println(x.endsWith(y));
        System.out.println(x.endsWith(z));

    }



}
