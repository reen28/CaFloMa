package de.reen28.cafloma.internal.database.repositories

import de.reen28.cafloma.internal.database.StandingOrder
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface StandingOrderRepository: JpaRepository<StandingOrder, UUID>