package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/springjdbc/config.xml"); 
         JdbcTemplate template= ctx.getBean("jdbcTemplate",JdbcTemplate.class);//ctrl 1 assign a local varible
         
         //insert query
         String query="insert into student(id,name,city)values(?,?,?)";
         
         //fire query
        int result = template.update(query,456,"navin kumar","delhi");
        System.out.println("output"+ result);
    }
}
