import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyan on 2016/10/9.
 */
public class Company {

    public void show(List<CrosstalkActor> list) {

        for (CrosstalkActor actor:list) {
            System.out.println(actor.name);
        }

       /*
        System.out.println(gdg.getName());
        System.out.println(yq.getName());
        System.out.println(yyp.getName());
        System.out.println(lyf.getName());
        */
    }

    public static void main(String[] args) {

        List<CrosstalkActor> list = new ArrayList<CrosstalkActor>();
        list.add(new GuoDeGang());
        list.add(new YueYunPeng());
        list.add(new YuQian());

        new Company().show(list);

        // new Company().show(new GuoDeGang(),new YuQian(),new YueYunPeng(), new LuoYuFeng());
    }
}
