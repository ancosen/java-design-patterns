package com.github.oscerd.builder;

import org.junit.Test;

public class EmailBuilderTest {

    @Test
    public void testBuilder(){
        Email email = EmailBuilder.eMail().from("test@test.com").to("test@test.it").content("Hello!").subject("Greetings").mimetype("text/html").build();
        
        System.out.println(email.toString());
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testBuilderFail(){
        Email email = EmailBuilder.eMail().to("test@test.it").content("Hello!").subject("Greetings").mimetype("text/html").build();
        
        System.out.println(email.toString());
    }
}
