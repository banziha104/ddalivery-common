package com.lyj.ddalivery.ddalivery.exception.product

class FileNotSaveException : RuntimeException {
    constructor() : super("파일을 저장하지 못햇습니다.") {}
    constructor(msg: String?) : super(msg) {}
    constructor(msg: String?, t: Throwable?) : super(msg, t) {}
}