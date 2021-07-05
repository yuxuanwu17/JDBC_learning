package JDBCTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

public class JDBCTemplateDemo1 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update account set balance = 5000 where id = ?";
        int count = template.update(sql,3);
    }
}
