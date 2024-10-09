//package com.museum.gestionale.DbManager;
//
//import com.museum.gestionale.Entity.Autore;
//import com.museum.gestionale.Entity.Opera;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
//
//import javax.sql.DataSource;
//import javax.swing.tree.RowMapper;
//import javax.swing.tree.TreePath;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//import java.util.Map;
//@Service
//public class OperaQueryManager {
//
//	private final JdbcTemplate jdbcTemplate;
//
//	@Autowired
//	public OperaQueryManager(DataSource dataSource) {
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//	}
//
//	public List<Map<String, Object>> getAllOperas() {
//		String sql = "SELECT * FROM opera";
//		return jdbcTemplate.queryForList(sql, new OperaRowMapper());
//	}
//
//	private static class OperaRowMapper implements RowMapper {
//
//		public Opera mapRow(ResultSet rs, int rowNum) throws SQLException {
//			Opera opera = new Opera();
//			opera.setId(rs.getInt("id"));
//			opera.setName(rs.getString("title"));
//			opera.setAuthor(rs.getObject("author", Autore.class));
//			opera.setYear(rs.getInt("data"));
//			return opera;
//		}
//
//		@Override
//		public int[] getRowsForPaths(TreePath[] path) {
//			return new int[0];
//		}
//	}
//
//
//
//
//}
//
//
//
//
//
