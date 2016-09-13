import java.util.Scanner;

/**
 * Created by chenyan on 16/9/13.
 */
public class CustomerBiz {

    String nameList = "";

    public void  addName(String name) {

            nameList = nameList + name+ "     ";
    }

    public void showName() {

        System.out.println("**********************");
        System.out.println("      客户姓名列表      ");
        System.out.println("**********************");
        System.out.println(nameList);
    }

    public boolean search(String name){

        System.out.println("********查找结果**********");

        if (nameList.indexOf(name) != -1) {

            return true;
        }

        return false;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        CustomerBiz customerBiz = new CustomerBiz();

        while (true) {
            System.out.print("请输入客户姓名:");
            String name = scanner.next();
            customerBiz.addName(name);

            System.out.print("继续输入吗?(y/n)");
            String isNextInput = scanner.next();
            if ("n".equals(isNextInput)) {
                break;
            }
            else if("y".equals(isNextInput)) {
                continue;
            }
            else {
                System.out.println("输入错误，请重新输入");
                break;
            }


        }

        customerBiz.showName();

        while (true) {
            System.out.print("请输入要查找的客户姓名:");
            String searchName = scanner.next();

            boolean searchResult = customerBiz.search(searchName);

            if (searchResult) {
                System.out.println("找到了");

            }
            else {

                System.out.println("客户姓名不存在");
            }

            System.out.print("继续输入吗?(y/n)");
            String isNextInput = scanner.next();
            if ("n".equals(isNextInput)) {
                break;
            }
            else if("y".equals(isNextInput)) {
                continue;
            }
            else {
                System.out.println("输入错误，请重新输入");
                break;
            }
        }


    }

}
