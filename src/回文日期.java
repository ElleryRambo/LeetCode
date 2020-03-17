import java.util.*;


//回文日期
/**
 * 链接：https://ac.nowcoder.com/acm/contest/3886/A
 来源：牛客网

 输入包括两行，每行包括一个8位数字。
 第一行表示牛牛指定的起始日期。
 第二行表示牛牛指定的终止日期。
 保证datei和都是真实存在的日期，且年份部分一定为4位数字，且首位数字不为0。
 保证date1 —定不晚于date2。

 输出一行，包含一个整数，表示在date1和date2之间，有多少个日期是回文的。

 链接：https://ac.nowcoder.com/acm/contest/3886/A
 来源：牛客网

 输入
 复制
 20110101
 20111231
 输出
 复制
 1
 说明
 符合条件的日期是20111102。

 链接：https://ac.nowcoder.com/acm/contest/3886/A
 来源：牛客网

 输入
 复制
 20000101
 20101231
 输出
 复制
 2
 说明
 符合条件的日期是20011002和20100102。
 * */
class date {
    int day;
    int month;
    int year;
    int[][] dayofmonth = new int [][]{
            {0,0},{31,31},{28,29},{31,31},{30,30},{31,31},{30,30},{31,31},{31,31},{30,30},{31,31},{30,30},{31,31}
    };
    int ISYEAP(int x){
        return x%100!=0 && x%4 ==0 || x%400==0 ? 1 : 0;
    }
    void nextday(){
        day++;
        if(day>dayofmonth[month][ISYEAP(year)])
        {
            day=1;
            month++;
            if(month>12)
            {
                month=1;
                year++;
            }
        }
    }

    public date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class 回文日期 {
    static boolean huiwen(int m)
    {
        int i=m ,s=0;
        while(i!=0)
        {s=s*10+i%10;
            i=i/10;}
        if(s==m)
            return true;
        return false;
    }

    public static void main(String[] args) {
        date dt = new date(1, 1, 1);
        int ans = 0, l = 0;

        Scanner sc = new Scanner(System.in);
        int date1 = sc.nextInt();
        int date2 = sc.nextInt();

        int y1 = date1 / 10000;
        int m1 = (date1 - y1 * 10000) / 100;
        int d1 = (date1 - y1 * 10000) % 100;
        int y2 = date2 / 10000;
        int m2 = (date2 - y2 * 10000) / 100;
        int d2 = (date2 - y2 * 10000) % 100;
        dt.year = y1;
        dt.month = m1;
        dt.day = d1;
        do {
            l = dt.year * 10000 + dt.month * 100 + dt.day;
            if (huiwen(l)) {
                ans++;
            }
            dt.nextday();
            //法一
//        } while (dt.year != y2 || dt.month != m2 || dt.day != d2);
            //法二
        }while(!(dt.year == y2 && dt.month == m2 && dt.day == d2));
        //法三
//        }while(l != date2);
        System.out.println(ans);
//        for (int i = 0;i < list.size();i++){
//            if (list.get(i) == date1){
//                for (int j = i;j<list.size();j++){
//                    if (list.get(j) == date2){
//                        if (huiwen(date2)){
//                            ans ++;
//                            System.out.println(ans);
//                            return;
//                        }else {
//                            System.out.println(ans);
//                            return;
//                        }
//                    }
//                    if (huiwen(list.get(j))){
//                        ans ++;
//                    }else {
//                        continue;
//                    }
//                }
//            }
//        }
        return ;
    }
}
