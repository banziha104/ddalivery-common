package com.lyj.ddalivery.ddalivery.exception


class NotFoundException : RuntimeException {
    constructor() : super("리소스를 찾지 못했습니다.") {}
    constructor(msg: String?) : super(msg) {}
    constructor(msg: String?, t: Throwable?) : super(msg, t) {}
}
