package sky.project.dao.employeedao.citydao;

import sky.project.models.City;

import java.sql.SQLException;

public interface CityDAO {
    City findById(Integer id) throws SQLException;
}
