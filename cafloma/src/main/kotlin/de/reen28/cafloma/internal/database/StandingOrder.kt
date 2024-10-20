package de.reen28.cafloma.internal.database

import de.reen28.cafloma.internal.database.audit.Auditable
import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

@Entity
data class StandingOrder(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var uuid: UUID,
    val name: String,
    val description: String?,
    @Embedded
    val amount: Amount,
    @Embedded
    val frequency: Frequency,
    val nextExecutionAt: LocalDateTime,

    @ManyToOne
    @JoinColumn(name = "account_id")
    val account: Account
): Auditable<User>()