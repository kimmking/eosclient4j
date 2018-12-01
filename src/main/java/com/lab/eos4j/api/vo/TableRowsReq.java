package com.lab.eos4j.api.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TableRowsReq {

    private String code = "eosio";

    private String scope;

    private String table;

    private Boolean json = true;

    private int limit = 10;

    @JsonProperty("lower_bound")
    private int lowerBound = 0;

    @JsonProperty("upper_bound")
    private int upperBound = -1;
}
