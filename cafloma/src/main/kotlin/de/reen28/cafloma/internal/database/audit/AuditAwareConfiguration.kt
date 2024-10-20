package de.reen28.cafloma.internal.database.audit

import de.reen28.cafloma.internal.database.User
import org.springframework.data.domain.AuditorAware
import org.springframework.stereotype.Component
import java.util.*

@Component
class AuditAwareConfiguration: AuditorAware<User> {

    override fun getCurrentAuditor(): Optional<User> {
        TODO("Not yet implemented")
    }

}