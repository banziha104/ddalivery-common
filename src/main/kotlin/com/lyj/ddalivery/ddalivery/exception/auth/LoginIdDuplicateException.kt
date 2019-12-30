package com.lyj.ddalivery.ddalivery.exception.auth

class LoginIdDuplicateException : RuntimeException {
    constructor() : super("로그인 아이디가 중복되었습니다") {}
    constructor(msg: String?) : super(msg) {}
    constructor(msg: String?, t: Throwable?) : super(msg, t) {}
}