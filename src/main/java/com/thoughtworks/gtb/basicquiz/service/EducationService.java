package com.thoughtworks.gtb.basicquiz.service;

import com.thoughtworks.gtb.basicquiz.domain.Education;
import com.thoughtworks.gtb.basicquiz.repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public List<Education> getEducationListById(long id) {
        return educationRepository.getEducationListById(id);
    }

    // GTB: - 没有判断 use 是否是存在的
    public List<Education> addEducation(long id, Education education) {
        return educationRepository.addEducation(id, education);
    }
}
