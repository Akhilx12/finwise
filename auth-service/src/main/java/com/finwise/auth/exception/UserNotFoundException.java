// UserNotFoundException.java
package com.finwise.auth.exception;
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) { super(message); }
}