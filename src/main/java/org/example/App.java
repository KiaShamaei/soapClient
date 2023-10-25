package org.example;

import org.example.soap.HumanSoap;
import org.example.soap.HumanSoapImpService;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException {

        System.out.println( "Hello World!" );
        HumanSoapImpService hImpl = new HumanSoapImpService(new URL("http://localhost:8080/api"));
        HumanSoap humanSoap = hImpl.getHumanSoapImpPort();


    }
}
