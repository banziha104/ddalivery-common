package com.lyj.ddalivery.ddalivery.exception.auth

class PasswordInCorrectException : RuntimeException {
    constructor() : super("패스워드가 일치하지 않습니다") {}
    constructor(msg: String?) : super(msg) {}
    constructor(msg: String?, t: Throwable?) : super(msg, t) {}
}