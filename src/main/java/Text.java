import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


class Qqq implements Comparator<profile> {

    public int compare(profile o1, profile o2) {
        if(o1.getA() < o2.getA())return -1;
        else if (o1.getA() == o2.getA()) return 0;
        else return 1;
    }
}

public class Text {


    /**
     * 可变参数
     * @param nums
     *
     * @return
     */
    static double sum(double... nums){//加了statir则不需要创建对象直接调用此方法
        double sum = 0 ;
        for(double num : nums)
            sum+=num;
            return sum;
    }

    /**
     *
     * @param i
     */
    public static int add(int i){
        i++;
        System.out.println("add()..."+ i);
        return 1;
    }

    public static void main(String[] args) throws CloneNotSupportedException {//main方法中的参数就是命令行参数
        System.out.println(sum());
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2));

        /**
         * 10/3保留小数点后1000位
         * 答案：3.(999个3)4
         */
        BigDecimal num1 = new BigDecimal("10");
        BigDecimal num2 = new BigDecimal("3");
        System.out.println(num1.divide(num2,1000, RoundingMode.CEILING));
        Text.add(2);
        System.out.println();

//        profile[] p={
//                new profile(1,"",new Date()),
//                new profile(2,"",new Date()),
//        };
//
//        Arrays.sort(p);
//
//        System.out.println(p.toString());

        profile a=new profile(1,"abc",new Date());
        profile a1=(profile)a.clone();
        System.out.println(a==a1);
        System.out.println(a.getC()==a1.getC());
        System.out.println(a.getB()==a1.getB());
    }




}
