package com.springboot.accounting.dto

import com.springboot.accounting.model.Customer
import com.springboot.accounting.model.Transaction
import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto(
        val id: String?,
        val balance: BigDecimal?  = BigDecimal.ZERO,
        val creationDate: LocalDateTime,
        val customer: AccountCustomerDto?,
        val transactions: Set<TransactionDto>?
)
