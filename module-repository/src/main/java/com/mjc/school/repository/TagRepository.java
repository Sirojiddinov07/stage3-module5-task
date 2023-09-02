package com.mjc.school.repository;

import com.mjc.school.repository.model.TagModel;

public interface TagRepository extends BaseRepository<TagModel, Long> {
    Object[] getTagsByNewsId(Long newsId);
}
