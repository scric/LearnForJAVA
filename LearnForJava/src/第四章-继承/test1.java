import ws.vinta.pangu.Pangu;

/**
 * Created by scric on 2017/3/28.
 */
public class test1 {
    public static void main(String[] args) {
        Pangu pangu = new Pangu();
        String newText = pangu.spacingText("请问Jackie的鼻子有几个？123个！");
        System.out.println(newText); // will be "请问 Jackie 的鼻子有几个？123 个！"

        //测试空格之神,盘古之白
    }
}
