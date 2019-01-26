package model.DAO.impl;

import db.DB;
import db.DbException;
import model.DAO.DepartmentDao;
import model.entities.Department;

import java.sql.*;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department department) {
        PreparedStatement st = null;

        try {

            st = conn.prepareStatement(
                    "INSERT INTO Department "
                        + "(Name) "
                        + "VALUES "
                        + "(?)",
                        Statement.RETURN_GENERATED_KEYS
            );

            st.setString(1, department.getName());

            int rows = st.executeUpdate();

            if (rows > 0) {

                ResultSet rs = st.getGeneratedKeys();

                if (rs.next()) {

                    department.setId(rs.getInt(1));

                }

                DB.closeResultSet(rs);

            } else {

                throw new DbException("Unexpected Error! No rows inserted!");

            }

        } catch (SQLException e) {

            throw new DbException(e.getMessage());

        } finally {

            DB.closeStatement(st);

        }
    }

    @Override
    public void update(Department department) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }
}
