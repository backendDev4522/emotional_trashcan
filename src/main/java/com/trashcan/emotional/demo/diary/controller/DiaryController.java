package com.trashcan.emotional.demo.diary.controller;

import com.trashcan.emotional.demo.diary.entity.Diary;
import com.trashcan.emotional.demo.diary.model.response.DiaryResponse;
import com.trashcan.emotional.demo.diary.service.DiaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DiaryController {

    private DiaryService diaryService;

    public DiaryController(
            DiaryService diaryService
    ) {
       this.diaryService = diaryService;
    }


    // HTTP protocol 관련. METHOD(GET, POST, DELETE, PUT), HEADER, URL
    @GetMapping(value = "/diaries")

    public ResponseEntity findAllDiaries() {
        List<DiaryResponse> response = diaryService.findAllDiaries().stream()
                .map(d -> DiaryResponse.of(d))
                .collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }



}
