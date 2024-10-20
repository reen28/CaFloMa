package de.reen28.cafloma.internal.database.entities

import de.reen28.cafloma.internal.database.audit.Auditable
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.util.*

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var uuid: UUID, //could be some external id

    // other table references
    @OneToMany(mappedBy = "ownedBy")
    var accounts: List<Account>
): Auditable<User>()