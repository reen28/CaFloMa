package de.reen28.cafloma.internal.database.repositories

import de.reen28.cafloma.internal.database.Transaction
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface TransactionRepository: JpaRepository<Transaction, UUID>