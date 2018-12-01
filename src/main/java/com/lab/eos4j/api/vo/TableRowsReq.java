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

    @JsonProperty("table_key")
    private String tableKey;

    private Boolean json = true;

    private int limit = 10;

    @JsonProperty("lower_bound")
    private String lowerBound;

    @JsonProperty("upper_bound")
    private String upperBound;

    @JsonProperty("key_type")
    private String keyType;

    @JsonProperty("index_position")
    private String indexPosition;

    @JsonProperty("encode_type")
    private String encodeType = "dec";
}


