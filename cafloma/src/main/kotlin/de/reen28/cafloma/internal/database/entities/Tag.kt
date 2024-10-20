package de.reen28.cafloma.internal.database.entities

import de.reen28.cafloma.internal.database.audit.Auditable
import jakarta.persistence.*
import java.util.*

@Entity
data class Tag(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var uuid: UUID,
    val name: String,
    val description: String,

    // other table references
    @ManyToOne
    @JoinColumn(name = "account_id")
    val account: Account
): Auditable<User>()