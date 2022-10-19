package lecture.p02core;

public class App {
    public static void main(String[] args) {

        Servlet1 servlet1 = new Servlet1();
        servlet1.setProductDAO(new ProductDAO());
        servlet1.doGet();

        System.out.println("프로그램 계속 진행....");
    }
}
