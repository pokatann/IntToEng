package IntToEng;
import java.util.Scanner;
public class IntToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド

    static String translateEng(int n) {
    	/*String s=String.valueOf(n);
    	switch (n) {
			case 0: s="zero"; break;
			case 1: s = "one"; break;
			case 2: s = "two"; break;
			case 3: s = "three"; break;
			case 4: s = "four"; break;
			case 5: s = "five"; break;
			case 6: s = "six"; break;
			case 7: s = "seven"; break;
			case 8: s = "eight"; break;
			case 9: s = "nine"; break;
			case 10:s="ten"; break;
		}
		return s;
    }*/
    	int hundreds = n / 100;
        int tens = (n / 10) % 10; // (n % 100) / 10
        int ones = n % 10;
        
        if(tens==0){
        	return hahaha(hundreds)+" hundred "+hahaha(ones);
        }
       if(tens==1){
    	   if(ones==0)return hahaha(hundreds)+" hundred "+"ten";
    	   if(ones==1)return hahaha(hundreds)+" hundred "+"eleven";
    	   if(ones==2)return hahaha(hundreds)+" hundred "+"twelve";
    	   if(ones==5)return hahaha(hundreds)+" hundred "+"fifteen";
    	   else{return hahaha(hundreds)+" hundred "+hahaha(ones)+"teen ";
       }}
       if(tens==2){
    	   if(ones==0)return hahaha(hundreds)+" hundred "+"twenty";
    	   else{return hahaha(hundreds)+" hundred "+"twenty "+hahaha(ones);
    	   }}
       if(tens==3){
    	   if(ones==0)return hahaha(hundreds)+" hundred "+"thirty";
    	   else{return hahaha(hundreds)+" hundred "+"thirty "+hahaha(ones);
    	   }}
       if(tens==4){
    	   if(ones==0)return hahaha(hundreds)+" hundred "+"forty";
    	   else{return hahaha(hundreds)+" hundred "+"forty "+hahaha(ones);
    	   }}
       if(tens==5){
    	   if(ones==0)return hahaha(hundreds)+" hundred "+"fifty";
    	   else{return hahaha(hundreds)+" hundred "+"fifty "+hahaha(ones);
    	   }}
       else{
    	   return hahaha(hundreds)+" hundred "+hahaha(tens)+"ty "+hahaha(ones);
       }
    }
static String hahaha(int a){
	String s=null;
	switch (a) {
	case 0: s=""; break;
	case 1: s = "one"; break;
	case 2: s = "two"; break;
	case 3: s = "three"; break;
	case 4: s = "four"; break;
	case 5: s = "five"; break;
	case 6: s = "six"; break;
	case 7: s = "seven"; break;
	case 8: s = "eight"; break;
	case 9: s = "nine"; break;
	
    }
	return s;
}
    }

