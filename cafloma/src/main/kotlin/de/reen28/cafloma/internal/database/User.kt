package de.reen28.cafloma.internal.database

import de.reen28.cafloma.internal.database.audit.Auditable
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var uuid: UUID, //could be some external id
    //other attributes could be retrieved from external service
): Auditable<User>()