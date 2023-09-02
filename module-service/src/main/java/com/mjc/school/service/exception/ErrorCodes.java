package com.mjc.school.service.exception;

public enum ErrorCodes {
    NEWS_NOT_EXIST("0001", "News with id %d does not exist."),
    AUTHOR_NOT_EXIST("0002", "Author Id does not exist. Author Id is: %d"),

    TAG_NOT_EXIST("0006", "Tag with id %d does not exist."),
    COMMENT_NOT_EXIST("0007", "Comment with id %d does not exist.");

    private final String code_id;
    private final String code_message;

    ErrorCodes(String code_id, String code_message) {
        this.code_id = code_id;
        this.code_message = code_message;
    }

    public String getMessage() {
        return "ERROR_CODE: " + code_id + " ERROR_MESSAGE: " + code_message;
    }
}