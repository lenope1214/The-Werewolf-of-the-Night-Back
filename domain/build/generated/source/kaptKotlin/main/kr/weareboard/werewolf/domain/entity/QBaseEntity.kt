package kr.weareboard.werewolf.domain.entity

import com.querydsl.core.types.Path
import com.querydsl.core.types.PathMetadata
import com.querydsl.core.types.PathMetadataFactory.forProperty
import com.querydsl.core.types.PathMetadataFactory.forVariable
import com.querydsl.core.types.dsl.BooleanPath
import com.querydsl.core.types.dsl.DateTimePath
import com.querydsl.core.types.dsl.EntityPathBase
import com.querydsl.core.types.dsl.StringPath
import java.lang.Class
import java.time.LocalDateTime
import javax.`annotation`.processing.Generated
import kotlin.Long
import kotlin.String

/**
 * QBaseEntity is a Querydsl query type for BaseEntity
 */
@Generated("com.querydsl.kotlin.codegen.KotlinSuperSerializer")
public class QBaseEntity : EntityPathBase<BaseEntity> {
  public val createdAt: DateTimePath<LocalDateTime> = createDateTime("createdAt",
      LocalDateTime::class.java)

  public val createdBy: StringPath = createString("createdBy")

  public val deleted: BooleanPath = createBoolean("deleted")

  public val deletedAt: DateTimePath<LocalDateTime> = createDateTime("deletedAt",
      LocalDateTime::class.java)

  public val deletedBy: StringPath = createString("deletedBy")

  public val updatedAt: DateTimePath<LocalDateTime> = createDateTime("updatedAt",
      LocalDateTime::class.java)

  public val updatedBy: StringPath = createString("updatedBy")

  public constructor(variable: String) : super(BaseEntity::class.java, forVariable(variable))

  public constructor(path: Path<out BaseEntity>) : super(path.type, path.metadata)

  public constructor(metadata: PathMetadata) : super(BaseEntity::class.java, metadata)

  public constructor(type: Class<out BaseEntity>, metadata: PathMetadata) : super(type, metadata)

  public companion object {
    private const val serialVersionUID: Long = 221755721

    public val baseEntity: QBaseEntity = QBaseEntity("baseEntity")
  }
}
