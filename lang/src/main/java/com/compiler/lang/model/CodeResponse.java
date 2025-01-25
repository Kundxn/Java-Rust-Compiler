package com.compiler.lang.model;

public class CodeResponse {

    private String status;
    private String output;

    public CodeResponse(String status, String output) {
        this.status = status;
        this.output = output;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
