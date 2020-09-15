package com.thoughtworks.gtb.basicquiz.repository;

import com.thoughtworks.gtb.basicquiz.domain.Education;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EducationRepository {
    private final Map<Long, List<Education>> educationMap = new HashMap<>();

    {
        List<Education> educationList = new ArrayList<>();
        educationList.add(new Education(1, 2005, "Secondary school specializing in artistic", "Eos, explicabo, nam, tenetur et ab eius deserunt aspernatur ipsum ducimus quibusdam quis voluptatibus."));
        educationList.add(new Education(1, 2009, "First level graduation in Graphic Design", "Aspernatur, mollitia, quos maxime eius suscipit sed beatae ducimus quaerat quibusdam perferendis? Iusto, quibusdam asperiores unde repellat."));
        educationMap.put(1L, educationList);
    }

    public List<Education> getEducationListById(long id) {
        return educationMap.get(id);
    }

    public List<Education> addEducation(long id, Education education) {
        education.setUserId(id);
        if(educationMap.containsKey(id)) {
            educationMap.get(id).add(education);
        } else {
            List<Education> educationList = new ArrayList<>();
            educationList.add(education);
            educationMap.put(id, educationList);
        }
        return getEducationListById(id);
    }
}
