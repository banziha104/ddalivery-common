package com.lyj.ddalivery.ddalivery.exception.auth

class UserResourceNotFoundException : RuntimeException {
    constructor() : super("일치하는 유저 정보가 없습니다") {}
    constructor(msg: String?) : super(msg) {}
    constructor(msg: String?, t: Throwable?) : super(msg, t) {}
}