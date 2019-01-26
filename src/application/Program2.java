package application;

import model.DAO.DaoFactory;
import model.DAO.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department insert() ===");

        Department department = new Department(null, "Food");

        departmentDao.insert(department);

        System.out.println("Department inserted sucessfully, ID: " + department.getId());

        System.out.println("=== ------------------------- ===");

        System.out.println("=== TEST 2: Department update() ===");

        department = new Department(1, "Books");

        departmentDao.update(department);

        System.out.println("Department updated!");

        System.out.println("=== ------------------------- ===");

        System.out.println("=== TEST 3: Department deleteById() ===");

        departmentDao.deleteById(7);

        System.out.println("Department deleted sucessfully");

        System.out.println("=== ------------------------- ===");

        System.out.println("=== TEST 4: Department findById() ===");

        Department departmentFound = departmentDao.findById(4);

        System.out.println(departmentFound);

        System.out.println("=== ------------------------- ===");

        System.out.println("=== TEST 5: Department findAll() ===");

        List<Department> list = departmentDao.findAll();

        list.forEach(System.out::println);

        System.out.println("=== ------------------------- ===");

    }

}
