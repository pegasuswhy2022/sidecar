package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@RequestMapping("api/test")
@Slf4j
public class App 
{

    @PostMapping("helloWeb")
    public String testCall(){
        log.info("haha");
        return "hello web!";
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
