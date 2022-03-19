package com.baboaisystem.binancechainkit.core

import com.baboaisystem.binancechainkit.models.Balance
import com.baboaisystem.binancechainkit.models.LatestBlock
import com.baboaisystem.binancechainkit.models.SyncState
import com.baboaisystem.binancechainkit.models.Transaction

interface IStorage {
    var latestBlock: LatestBlock?
    var syncState: SyncState?

    fun setBalances(balances: List<Balance>)
    fun getBalance(symbol: String): Balance?
    fun getAllBalances(): List<Balance>?
    fun removeBalances(balances: List<Balance>)

    fun addTransactions(transactions: List<Transaction>)
    fun getTransaction(hash: String): Transaction?
    fun getTransactions(
        symbol: String,
        fromAddress: String?,
        toAddress: String?,
        fromTransactionHash: String?,
        limit: Int?
    ): List<Transaction>
}
