/*
package com.accenture.tagtrainingspring.screening;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ScreeningRowMapper implements RowMapper<Screening> {
    @Override
    public Screening mapRow(ResultSet resultSet, int i) throws SQLException {
        Screening screening = new Screening();
        screening.setId(resultSet.getInt("id"));
        screening.setDiagnosis(resultSet.getString("diagnosis").charAt(0));
        screening.setRadiusMean(resultSet.getDouble("radius_mean"));
        screening.setTextureMean(resultSet.getDouble("texture_mean"));
        screening.setPerimeterMean(resultSet.getDouble("perimeter_mean"));
        screening.setAreaMean(resultSet.getDouble("area_mean"));
        screening.setSmoothnessMean(resultSet.getDouble("smoothness_mean"));
        screening.setCompactnessMean(resultSet.getDouble("compactness_mean"));
        screening.setConcavityMean(resultSet.getDouble("concavity_mean"));
        screening.setConcavePointsMean(resultSet.getDouble("concave_points_mean"));
        screening.setSymmetryMean(resultSet.getDouble("symmetry_mean"));
        screening.setFractalDimensionMean(resultSet.getDouble("fractal_dimension_mean"));
        screening.setRadiusMean(resultSet.getDouble("radius_se"));
        screening.setTextureSe(resultSet.getDouble("texture_se"));
        screening.setPerimeterSe(resultSet.getDouble("perimeter_se"));
        screening.setAreaSe(resultSet.getDouble("area_se"));
        screening.setSmoothnessSe(resultSet.getDouble("smoothness_se"));
        screening.setCompactnessSe(resultSet.getDouble("compactness_se"));
        screening.setConcavitySe(resultSet.getDouble("concavity_se"));
        screening.setConcavePointsSe(resultSet.getDouble("concave_points_se"));
        screening.setSymmetrySe(resultSet.getDouble("symmetry_se"));
        screening.setFractalDimensionSe(resultSet.getDouble("fractal_dimension_se"));
        screening.setRadiusWorst(resultSet.getDouble("radius_worst"));
        screening.setTextureWorst(resultSet.getDouble("texture_worst"));
        screening.setPerimeterWorst(resultSet.getDouble("perimeter_worst"));
        screening.setAreaWorst(resultSet.getDouble("area_worst"));
        screening.setSmoothnessWorst(resultSet.getDouble("smoothness_worst"));
        screening.setCompactnessWorst(resultSet.getDouble("compactness_worst"));
        screening.setConcavityWorst(resultSet.getDouble("concavity_worst"));
        screening.setConcavePointsWorst(resultSet.getDouble("concave_points_worst"));
        screening.setSymmetryWorst(resultSet.getDouble("symmetry_worst"));
        screening.setFractalDimensionWorst(resultSet.getDouble("fractal_dimension_worst"));
        screening.setGroupId(resultSet.getString("group_id").charAt(0));
        return screening;
    }
}
*/