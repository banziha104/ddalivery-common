package com.lyj.ddalivery.ddalivery.exception.product

class CategoryNotFoundException : RuntimeException {
    constructor() : super("카테고리를 찾을 수 없습니다") {}
    constructor(msg: String?) : super(msg) {}
    constructor(msg: String?, t: Throwable?) : super(msg, t) {}
}