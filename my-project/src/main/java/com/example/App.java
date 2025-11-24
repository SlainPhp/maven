package com.example;
import org.apache.commons.lang3.StringUtils;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String originalString = "Hello World!";
        String reversedString = StringUtils.reverse(originalString);
        System.out.println(reversedString);
    }
}
