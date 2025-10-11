package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne // 다대일 관계 설정
    @JoinColumn(name="article_id") //외래키 생성, Article 엔티티의 기본키와 매핑
    private Article article;
    @Column //해당 필드를 테이블 속성으로 매핑
    private String nickname;
    @Column
    private String body;
}

