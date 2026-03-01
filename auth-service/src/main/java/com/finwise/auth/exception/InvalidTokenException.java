// InvalidTokenException.java
package com.finwise.auth.exception;
public class InvalidTokenException extends RuntimeException {
    public InvalidTokenException(String message) { super(message); }
}