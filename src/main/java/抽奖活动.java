import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 抽奖活动 {
    static String[] cj = {"孙qiang","zhangqi","baiwei"};


    static int num = 1;
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        for(;;){
            if(set.size() == num){
                break;
            }
            int random = new SecureRandom().nextInt(cj.length);
            set.add(cj[random]);
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println("中奖：\r\n" + iterator.next());
        }

    }

}
