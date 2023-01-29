package com.example.bookmanager.bookmanager.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Builder
@Entity //primary key 필요
public class User {
    @Id
    @GeneratedValue //순차적으로 값 증가
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt; // JPA에는 기본적으로 생성 날짜와 수정날짜를 기입해주는것이 좋음
    private LocalDateTime updatedAt;


}
