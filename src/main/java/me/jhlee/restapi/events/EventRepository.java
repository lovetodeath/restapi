package me.jhlee.restapi.events;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JavaDoc용 클래스의 용도를 설명합니다.
 *
 * @author 인프라지원실 TA파트 이준한
 * @version 1.0
 * <pre>
 * 2020.05.31 : 최초 작성
 * </pre>
 * @since 2020-05-31
 */
public interface EventRepository extends JpaRepository<Event, Integer> {
}
