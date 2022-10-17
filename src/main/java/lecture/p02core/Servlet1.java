package lecture.p02core;

import lombok.Setter;

@Setter
public class Servlet1 {

    private ProductDAO productDAO;

    public void doGet() {
        productDAO.getProductName();
    }
}
