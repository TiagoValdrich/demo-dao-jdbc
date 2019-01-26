package application;

import model.DAO.DaoFactory;
import model.DAO.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department insert() ===");

        Department department = new Department(null, "Food");

        departmentDao.insert(department);

        System.out.println("Department inserted sucessfully, ID: " + department.getId());

        System.out.println("=== ------------------------- ===");

    }

}
