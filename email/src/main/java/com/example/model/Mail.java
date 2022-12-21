package com.example.model;

public class Mail {
    private String language;
    private int pageSize;
    private boolean spamsFillter;
    private String signature;

    public Mail(String language, int pageSize, boolean spamsFillter, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spamsFillter = spamsFillter;
        this.signature = signature;
    }

    public Mail() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFillter() {
        return spamsFillter;
    }

    public void setSpamsFillter(boolean spamsFillter) {
        this.spamsFillter = spamsFillter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
