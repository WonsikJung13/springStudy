package lecture.p01lombok;

public class App {
    public static void main(String[] args) {
        JavaBean4 j4 = new JavaBean4();
        j4.setAddress("test");
        j4.setScore(1);

        System.out.println(j4.getScore());
        System.out.println(j4.getAddress());
        System.out.println(j4.toString());
    }


}
