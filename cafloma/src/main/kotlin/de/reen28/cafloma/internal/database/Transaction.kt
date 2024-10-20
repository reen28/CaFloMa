package de.reen28.cafloma.internal.database

import de.reen28.cafloma.internal.database.audit.Auditable
import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.UUID

@Entity
data class Transaction(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var uuid: UUID,
    val name: String,
    val description: String?,
    @Embedded
    val amount: Amount,
    val executedAt: LocalDateTime,

    // other table references
    @ManyToOne
    @JoinColumn(name = "account_id")
    val account: Account
): Auditable<User>()