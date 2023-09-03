package com.mjc.school.repository.impl;

import com.mjc.school.repository.CommentRepository;
import com.mjc.school.repository.model.CommentModel;
import com.mjc.school.repository.model.NewsModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentRepoImpl extends AbstractRepo
        <CommentModel, Long> implements CommentRepository {

    @Override
    protected void setFields(CommentModel oldModel, CommentModel newModel) {
        oldModel.setContent(newModel.getContent());
        oldModel.setNews(newModel.getNews());
    }

    @Override
    public List getCommentsByNewsId(Long newsId) {
        NewsModel newsModel = entityManager.find(NewsModel.class, newsId);
        return List.of(newsModel.getComments().stream().toArray());
    }
}
