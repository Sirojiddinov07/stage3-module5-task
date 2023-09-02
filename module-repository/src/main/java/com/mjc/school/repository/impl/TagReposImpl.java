package com.mjc.school.repository.impl;

import com.mjc.school.repository.TagRepository;
import com.mjc.school.repository.model.NewsModel;
import com.mjc.school.repository.model.TagModel;
import org.springframework.stereotype.Repository;

@Repository
public class TagReposImpl extends AbstractRepo<TagModel, Long> implements TagRepository {

    @Override
    protected void setFields(TagModel oldModel, TagModel newModel) {
        oldModel.setName(newModel.getName());
    }

    @Override
    public Object[] getTagsByNewsId(Long newsId) {
        NewsModel newsModel = entityManager.find(NewsModel.class, newsId);
        return newsModel.getTags().stream().toArray();
    }
}
