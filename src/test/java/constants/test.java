package constants;

/**
 * Created by ecovacsqa on 2018/8/23.
 */
public class test {
    public  static void main(String[] args){
//        String str="Estimated remaining time: 145hour(s)";
//        char ss[] = str.toCharArray();
//        String returnStr="";
//
//        loop:for (int i = 0; i < ss.length; i++){
//            if(String.valueOf(ss[i]).equals("0")||String.valueOf(ss[i]).equals("1")||String.valueOf(ss[i]).equals("2")||String.valueOf(ss[i]).equals("3")||String.valueOf(ss[i]).equals("4")||String.valueOf(ss[i]).equals("5")||String.valueOf(ss[i]).equals("6")||String.valueOf(ss[i]).equals("7")||String.valueOf(ss[i]).equals("8")||String.valueOf(ss[i]).equals("9")){
//                System.out.println("0000000"+ss[i]);
//                System.out.println("index is: "+i);
//                returnStr=str.substring(0,i);
//                System.out.println("111111"+returnStr);
//                break;
//            }
//        }
//        loop1:for (int i = ss.length-1; i >0; i--){
//            if(String.valueOf(ss[i]).equals("0")||String.valueOf(ss[i]).equals("1")||String.valueOf(ss[i]).equals("2")||String.valueOf(ss[i]).equals("3")||String.valueOf(ss[i]).equals("4")||String.valueOf(ss[i]).equals("5")||String.valueOf(ss[i]).equals("6")||String.valueOf(ss[i]).equals("7")||String.valueOf(ss[i]).equals("8")||String.valueOf(ss[i]).equals("9")){
//                System.out.println("0000000"+ss[i]);
//                System.out.println("index2 is: "+i);
//                returnStr=str.substring(i+1,ss.length);
//                System.out.println("111111"+returnStr);
//                break;
//            }
//        }


        String str="Tutte le domeniche";
        String[] q=str.replaceAll(" ", "\\|").split("\\|");
        System.out.println("111111"+str.replaceAll("\\pP", "").replace(" ", ""));
        System.out.println("2222222"+q[0].toString());


    }
}
