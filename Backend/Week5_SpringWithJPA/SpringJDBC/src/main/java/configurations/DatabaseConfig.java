package configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:database.properties")
public class DatabaseConfig {
    @Autowired
    Environment environment;

    @Bean
    DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
        driverManagerDataSource.setUrl(environment.getProperty("mysql.url"));
        driverManagerDataSource.setUsername(environment.getProperty("mysql.username"));
        driverManagerDataSource.setPassword(environment.getProperty("mysql.password"));
        driverManagerDataSource.setDriverClassName(environment.getProperty("mysql.driver"));
        return driverManagerDataSource;
    }
}
