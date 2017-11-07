public class Vote {
    public static void main(String[] args) {
        double suma=0;
        double sumb=0;
        double sumc=0;
        double sumd=0;
        double sume=0;
        double total=1;

        java.util.Scanner s=new java.util.Scanner(System.in);

        vote(s,total,suma,sumb,sumc,sumd,sume);

    }

    public static void vote(java.util.Scanner s,double total,double suma,double sumb,double sumc,double sumd,double sume) {

        System.out.println("请根据常识选出您认为对的选项：(键入大写字母后按回车)");
        System.out.println("A、臭喵是香香的。");
        System.out.println("B、香喵是臭臭的。");
        System.out.println("C、两只都是香喵。");
        System.out.println("D、两只都是臭喵。");
        System.out.println("E、两只都是香喵，但臭喵更香。");
        String input=s.next();

        if(input.equals("A")) {
            suma=suma+1;
        }else if(input.equals("B")) {
            sumb=sumb+1;
        }else if(input.equals("C")) {
            sumc=sumc+1;
        }else if(input.equals("D")) {
            sumd=sumd+1;
        }else if(input.equals("E")) {
            sume=sume+1;
        }else if(input.equals("EXIT")) {
            System.exit(0);
        }

        System.out.println("##################");
        System.out.println("目前各选项占比如下：");
        System.out.println("A："+(suma/total*100)+"%");
        System.out.println("B："+(sumb/total*100)+"%");
        System.out.println("C："+(sumc/total*100)+"%");
        System.out.println("D："+(sumd/total*100)+"%");
        System.out.println("E："+(sume/total*100)+"%");
        total++;
        System.out.println("#################");
        System.out.println("下面进行第"+(int)total+"次投票。"+"（也可以键入“EXIT”退出程序。）");
        vote(s,total,suma,sumb,sumc,sumd,sume);
    }
}
