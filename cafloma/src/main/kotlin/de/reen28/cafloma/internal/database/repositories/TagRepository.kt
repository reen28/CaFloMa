package de.reen28.cafloma.internal.database.repositories

import de.reen28.cafloma.internal.database.entities.Tag
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TagRepository: JpaRepository<Tag, UUID>