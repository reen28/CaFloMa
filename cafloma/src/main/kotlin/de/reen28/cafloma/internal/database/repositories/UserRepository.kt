package de.reen28.cafloma.internal.database.repositories

import de.reen28.cafloma.internal.database.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository: JpaRepository<User, UUID>
// UUID might change to something else since the user should
// be provided by an external service