package com.lyj.ddalivery.ddalivery.exception.product


class SellerNotFoundException : RuntimeException {
    constructor() : super("판매자를 찾을 수 없습니다") {}
    constructor(msg: String?) : super(msg) {}
    constructor(msg: String?, t: Throwable?) : super(msg, t) {}
}