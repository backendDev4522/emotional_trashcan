package com.trashcan.emotional.demo.diary.service;

import com.trashcan.emotional.demo.common.model.Attachments;
import com.trashcan.emotional.demo.diary.entity.Diary;
import com.trashcan.emotional.demo.diary.model.response.DiaryResponse;
import com.trashcan.emotional.demo.diary.repository.DiaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryService {

    private DiaryRepository diaryRepository;

    public DiaryService(
            DiaryRepository diaryRepository
    ) {
        this.diaryRepository = diaryRepository;
    }

    public List<Diary> findAllDiaries() {
        return diaryRepository.findAll();

    }


}
