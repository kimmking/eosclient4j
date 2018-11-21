package com.lab.eos4j.api.service;

import java.util.List;
import java.util.Map;

import com.lab.eos4j.api.vo.Block;
import com.lab.eos4j.api.vo.TableRows;
import com.lab.eos4j.api.vo.ChainInfo;
import com.lab.eos4j.api.vo.TableRowsReq;
import com.lab.eos4j.api.vo.account.Account;
import com.lab.eos4j.api.vo.action.Actions;
import com.lab.eos4j.api.vo.history.TransactionHis;
import com.lab.eos4j.api.vo.transaction.Transaction;
import com.lab.eos4j.api.vo.transaction.push.TxRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface RpcService {

    @GET("/v1/chain/get_info")
    Call<ChainInfo> getChainInfo();

    @POST("/v1/chain/get_block")
    Call<Block> getBlock(@Body Map<String, String> requestFields);

    @POST("/v1/chain/get_account")
    Call<Account> getAccount(@Body Map<String, String> requestFields);

    @POST("/v1/chain/get_currency_balance")
    Call<List<String>> getCurrencyBalance(@Body Map<String, String> requestFields);

    @POST("/v1/chain/push_transaction")
    Call<Transaction> pushTransaction(@Body TxRequest request);

    @POST("/v1/chain/get_table_rows")
    Call<TableRows> getTableRows(@Body TableRowsReq request);

    @POST("/v1/history/get_actions")
    Call<Actions> getActions(@Body Map<String, Object> requestFields);

    @POST("/v1/history/get_transaction")
    Call<TransactionHis> getTransaction(@Body Map<String, String> requestFields);


}
