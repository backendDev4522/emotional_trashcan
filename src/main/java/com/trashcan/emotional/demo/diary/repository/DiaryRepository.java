package com.trashcan.emotional.demo.diary.repository;

import com.trashcan.emotional.demo.diary.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
}
