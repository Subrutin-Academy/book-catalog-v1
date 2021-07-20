package com.subrutin;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

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
        DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(bf);
        rdr.loadBeanDefinitions(new ClassPathResource("application-context.xml"));
        BookService bs = (BookService) bf.getBean("bookService");
        BookDetailDTO dto = bs.findBookDetailById(1L);
        System.out.println(dto);
        
    }
    
    
}
