package com.cy.pj.sys.service.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

public class UserTest {
	 @Test
	    public void Test1(){
	        String version = SpringVersion.getVersion();
	        String version1 = SpringBootVersion.getVersion();
	        System.out.println(version);
	        System.out.println(version1);
	        
	    }
	
}
