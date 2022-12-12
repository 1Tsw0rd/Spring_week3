package com.example.projectbluehair.member.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
@AllArgsConstructor
public enum MemberErrorCode {
    /* 400 BAD_REQUEST : 잘못된 요청 */
    INVALID_MEMBERNAME(BAD_REQUEST, "유효하지 않은 유저이름입니다."),
    INVALID_PASSWORD(BAD_REQUEST, "유효하지 않은 비밀번호입니다."),
    INVALID_AUTH_TOKEN(UNAUTHORIZED, "등록되지 않은 관리자 토큰입니다."),
    INCORRECT_PASSWORD(BAD_REQUEST, "비밀번호가 일치하지 않습니다."),

    /* 404 NOT_FOUND : Resource 를 찾을 수 없음 */
    MEMBER_NOT_FOUND(NOT_FOUND, "해당 유저 정보를 찾을 수 없습니다"),

    /* 409 CONFLICT : Resource 의 현재 상태와 충돌. 보통 중복된 데이터 존재 */
    DUPLICATE_MEMBERNAME(CONFLICT, "중복된 유저이름입니다.");

    private final HttpStatus httpStatus;
    private final String detail;
}
