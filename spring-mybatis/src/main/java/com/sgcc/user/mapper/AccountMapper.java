package com.sgcc.user.mapper;

public interface AccountMapper {

    void addAccount(String name, double money);

    void updateAccount(String name, double money, boolean isbuy);
}
