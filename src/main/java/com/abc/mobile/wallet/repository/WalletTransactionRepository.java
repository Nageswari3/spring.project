package com.abc.mobile.wallet.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.abc.mobile.wallet.entity.WalletTransaction;

@Repository
public interface WalletTransactionRepository extends JpaRepository<WalletTransaction, Integer> {

}