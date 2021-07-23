package com.subrutin;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.subrutin.config.AppConfig;
import com.subrutin.domain.Author;
import com.subrutin.domain.Book;
import com.subrutin.dto.BookDetailDTO;
import com.subrutin.service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ApplicationContext appCtx = new ClassPathXmlApplicationContext("application-context.xml");
//        ApplicationContext appCtx = new FileSystemXmlApplicationContext("D:\\akademi\\spring-siap-kerja\\book-catalog\\src\\main\\resources\\application-context.xml");
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        BookService bs = (BookService) appCtx.getBean("bookService");
        BookDetailDTO dto =  bs.findBookDetailById(1L);
        System.out.println("Book Detail = "+dto);
    }
    
    
}
