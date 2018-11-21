package com.lab.eos4j.ese;


public enum Action {

    transfer("${precision},${quantity}@eosio.token"), account("account"), ram("ram"), delegate("${precision},${quantity}@eosio.token"), voteproducer("voteproducer"),
    close("${precision},${quantity}@eosio.token");

    private String code;

    private Action(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}