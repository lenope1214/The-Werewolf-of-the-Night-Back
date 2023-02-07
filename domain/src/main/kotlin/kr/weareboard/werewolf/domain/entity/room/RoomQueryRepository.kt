package kr.weareboard.werewolf.domain.entity.room

import com.querydsl.jpa.impl.JPAQueryFactory
import kr.weareboard.werewolf.domain.entity.room.QRoom.Companion.room
import kr.weareboard.werewolf.domain.entity.room.dto.response.QRoomResponseDto
import kr.weareboard.werewolf.domain.entity.room.dto.response.RoomResponseDto
import org.springframework.stereotype.Component

@Component
// JPAQueryFactory를 사용하려면 QueryDslConfig 파일에 Bean 등록 해줘야함.
class RoomQueryRepository(
    private val queryFactory: JPAQueryFactory,
){

    // findById
    fun findById(id: Long): RoomResponseDto? {
        return queryFactory
            .select(
                QRoomResponseDto(
                    room.id,
                    room.name,
                    room.description,
                    room.maxPlayer,
                    room.isStarted,
                    room.isFinished,
                    room.deletedAt.isNotNull,
                    room.isPrivate,
                    room.owner.id,
                    room.owner.name,
                    room.users.size()
                )
            )
            .from(room)
            .where(room.id.eq(id))
            .fetchOne()
    }

    // findByNameContains
    fun findByNameContains(name: String): List<RoomResponseDto> {
        return queryFactory
            .select(
                QRoomResponseDto(
                    room.id,
                    room.name,
                    room.description,
                    room.maxPlayer,
                    room.isStarted,
                    room.isFinished,
                    room.deletedAt.isNotNull,
                    room.isPrivate,
                    room.owner.id,
                    room.owner.name,
                    room.users.size()
                )
            )
            .from(room)
            .where(room.name.contains(name))
            .fetch()
    }
}