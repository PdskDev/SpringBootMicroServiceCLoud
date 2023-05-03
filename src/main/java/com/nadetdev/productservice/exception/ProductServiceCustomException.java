package com.nadetdev.productservice.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ProductServiceCustomException extends RuntimeException{

    private String errorMessage;
    private String errorCode;

    public ProductServiceCustomException(String errorMessage, String errorCode) {
        super(errorMessage);
        this.errorCode = errorCode;
    }
}
