package com.aurionpro.service;

public interface AccounEntityService {

    public void depositFunds(int accountId, int amount);
    public void withdrawFunds(int accountId, int amount);
}
