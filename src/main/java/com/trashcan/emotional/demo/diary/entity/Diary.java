package com.trashcan.emotional.demo.diary.entity;


import com.trashcan.emotional.demo.common.model.Attachments;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "Diary")
public class Diary {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contents;

    @Embedded
    private Attachments attachments;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    private LocalDateTime deletedAt;
}
