package com.trashcan.emotional.demo.diary.model.response;

import com.trashcan.emotional.demo.common.model.Attachments;
import com.trashcan.emotional.demo.diary.entity.Diary;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class DiaryResponse {

    private Long id;

    private String contents;

    private Attachments attachments;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    private LocalDateTime deletedAt;

    @Builder
    public DiaryResponse(
            Long id,
            String contents,
            Attachments attachments,
            LocalDateTime createdAt,
            LocalDateTime modifiedAt,
            LocalDateTime deletedAt
    ) {
        this.id = id;
        this.contents = contents;
        this.attachments = attachments;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.deletedAt = deletedAt;
    }

    public static DiaryResponse of(Diary diary) {
        return DiaryResponse.builder()
                .id(diary.getId())
                .attachments(diary.getAttachments())
                .contents(diary.getContents())
                .createdAt(diary.getCreatedAt())
                .modifiedAt(diary.getModifiedAt())
                .deletedAt(diary.getDeletedAt())
                .build();
    }


}
