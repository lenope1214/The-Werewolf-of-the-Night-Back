package kr.weareboard.werewolf.domain.entity.user

import com.querydsl.core.types.Path
import com.querydsl.core.types.PathMetadata
import com.querydsl.core.types.PathMetadataFactory.forProperty
import com.querydsl.core.types.PathMetadataFactory.forVariable
import com.querydsl.core.types.dsl.BooleanPath
import com.querydsl.core.types.dsl.DateTimePath
import com.querydsl.core.types.dsl.EntityPathBase
import com.querydsl.core.types.dsl.NumberPath
import com.querydsl.core.types.dsl.StringPath
import java.lang.Class
import java.time.LocalDateTime
import javax.`annotation`.processing.Generated
import kotlin.Long
import kotlin.String
import kr.weareboard.werewolf.domain.entity.QBaseEntity

/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.kotlin.codegen.KotlinEntitySerializer")
public class QUser : EntityPathBase<User> {
  public val _super: QBaseEntity by lazy {
    QBaseEntity(this)
  }


  public val changePassword: BooleanPath = createBoolean("changePassword")

  /**
   * inherited
   */
  public val createdAt: DateTimePath<LocalDateTime> by lazy {
    _super.createdAt
  }


  /**
   * inherited
   */
  public val createdBy: StringPath by lazy {
    _super.createdBy
  }


  /**
   * inherited
   */
  public val deleted: BooleanPath by lazy {
    _super.deleted
  }


  /**
   * inherited
   */
  public val deletedAt: DateTimePath<LocalDateTime> by lazy {
    _super.deletedAt
  }


  /**
   * inherited
   */
  public val deletedBy: StringPath by lazy {
    _super.deletedBy
  }


  public val email: StringPath = createString("email")

  public val id: NumberPath<Long> = createNumber("id", Long::class.java)

  public val loginAt: DateTimePath<LocalDateTime> = createDateTime("loginAt",
      LocalDateTime::class.java)

  public val name: StringPath = createString("name")

  public val password: StringPath = createString("password")

  public val providerId: StringPath = createString("providerId")

  /**
   * inherited
   */
  public val updatedAt: DateTimePath<LocalDateTime> by lazy {
    _super.updatedAt
  }


  /**
   * inherited
   */
  public val updatedBy: StringPath by lazy {
    _super.updatedBy
  }


  public val username: StringPath = createString("username")

  public constructor(variable: String) : super(User::class.java, forVariable(variable))

  public constructor(path: Path<out User>) : super(path.type, path.metadata)

  public constructor(metadata: PathMetadata) : super(User::class.java, metadata)

  public constructor(type: Class<out User>, metadata: PathMetadata) : super(type, metadata)

  public companion object {
    private const val serialVersionUID: Long = 1799714425

    public val user: QUser = QUser("user")
  }
}
