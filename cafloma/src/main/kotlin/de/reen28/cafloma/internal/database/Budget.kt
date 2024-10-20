package de.reen28.cafloma.internal.database

import de.reen28.cafloma.internal.database.audit.Auditable
import jakarta.persistence.*
import java.util.*

@Entity
data class Budget(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var uuid: UUID,
    val name: String,
    val description: String?,
    @Embedded
    val limit: Amount,
    @Embedded
    val frequency: Frequency,

    // other table references
    @ManyToOne
    @JoinColumn(name = "account_id")
    val account: Account
): Auditable<User>()