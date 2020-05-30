package me.jhlee.restapi.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * JavaDoc용 클래스의 용도를 설명합니다.
 *
 * @author 서비스INFRA팀 TA파트 이준한
 * @version 1.0
 * <pre>
 * 2020.05.30 : 최초 작성
 * </pre>
 * @since 2020-05-30
 */
class EventTest {
    @Test
    public void builder() {
        Event event = Event.builder()
                .name("Inflearn Spring REST API")
                .description("REST API development with Spring")
                .build();
        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean() {
        // Given
        String name = "Event";
        String description = "Spring";

        // When
        Event event = new Event();
        event.setName(name);
        event.setDescription(description);

        // Then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }
}