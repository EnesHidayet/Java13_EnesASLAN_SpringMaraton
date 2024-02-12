package org.enes.exception;

import lombok.Getter;
@Getter
public class RandevuSistemiException extends RuntimeException{
    private final ErrorType errorType;
    public RandevuSistemiException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public RandevuSistemiException(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }
}
