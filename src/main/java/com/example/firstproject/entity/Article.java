package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor //기본 생성자 추가 어노테이션
@ToString
public class Article {
    @Id              //엔티티 대푯값 지정
    @GeneratedValue  //자동 생성 기능
    private Long id;
    @Column          // title 필드 선언, DB 테이블의 title열과 연결
    private String title;
    @Column
    private String content;
//Article 생성자 추가

}
