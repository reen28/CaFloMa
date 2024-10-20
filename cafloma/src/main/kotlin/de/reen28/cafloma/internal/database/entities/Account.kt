package de.reen28.cafloma.internal.database.entities

import de.reen28.cafloma.internal.database.audit.Auditable
import jakarta.persistence.*
import java.util.*

@Entity
data class Account(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var uuid: UUID,

    // other table references
    @ManyToOne
    @JoinColumn(name = "user_id")
    val ownedBy: User,

    @OneToMany(mappedBy = "account")
    val transactions: List<Transaction> = mutableListOf(),

    @OneToMany(mappedBy = "account")
    val budgets: List<Budget> = mutableListOf(),

    @OneToMany(mappedBy = "account")
    val standingOrders: List<StandingOrder> = mutableListOf(),

    @OneToMany(mappedBy = "account")
    val tags: List<Tag> = mutableListOf()
): Auditable<User>()