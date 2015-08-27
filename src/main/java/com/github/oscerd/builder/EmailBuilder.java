package com.github.oscerd.builder;

public class EmailBuilder {

    private final Email email;
    
    private EmailBuilder() {
        email = new Email();
    }
    
    public static EmailBuilder eMail() {
        return new EmailBuilder();
    }
    
    public EmailBuilder from(String from) {
        email.setFrom(from);
        return this;
    }
    
    public EmailBuilder to(String to) {
        email.setTo(to);
        return this;
    }
    
    public EmailBuilder subject(String subject) {
        email.setSubject(subject);
        return this;
    }
    
    public EmailBuilder content(String content) {
        email.setContent(content);
        return this;
    }
    
    public EmailBuilder mimetype(String mimetype) {
        email.setMimetype(mimetype);
        return this;
    }
    
    public Email build() {
        validate();
        return email;
    }
    
    private void validate() {
        if (email.getFrom() == null) {
            throw new IllegalArgumentException("Email from cannot be null or empty");
        }
        
        if (email.getTo() == null) {
            throw new IllegalArgumentException("Email to cannot be null or empty");
        }
        
        if (email.getSubject() == null) {
            throw new IllegalArgumentException("Email subject cannot be null or empty");
        }
      
        if (email.getContent() == null) {
            throw new IllegalArgumentException("Email content cannot be null or empty");
        }
        
        if (email.getMimetype() == null) {
            throw new IllegalArgumentException("Email mimetype cannot be null or empty");
        }
    }
}
