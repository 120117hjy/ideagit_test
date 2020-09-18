package com.sgcc.user.dao;

public interface AccountDao {

    void addAccount(String name,double money);

    void updateAccount(String name,double money,boolean isbuy);

}
