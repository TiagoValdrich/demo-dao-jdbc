package application;

import model.DAO.DaoFactory;
import model.DAO.SellerDao;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: Seller findById() ===");
        Seller seller = sellerDao.findById(3);
        System.out.println("=== ------------------------- ===");

        System.out.println(seller);

    }

}
