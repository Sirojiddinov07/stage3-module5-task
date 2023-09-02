package com.mjc.school.repository;

import com.mjc.school.repository.model.CommentModel;

public interface CommentRepository extends BaseRepository<CommentModel, Long> {
    Object[] getCommentsByNewsId (Long newsId);
}
