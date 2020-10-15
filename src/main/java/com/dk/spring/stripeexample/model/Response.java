package com.dk.spring.stripeexample.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Response {

    private boolean status;
    private String details;

    public Response() {
        this.status = true; //default to true
    }

    public Response(boolean status) {
        this.status = status;
    }
}
