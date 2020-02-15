package com.lyj.ddalivery.ddalivery.exception.order

class OrderGroupNotFoundException : RuntimeException {
    constructor() : super("해당되는 주문이 없습니다")
    constructor(msg: String?) : super(msg)
    constructor(msg: String?, t: Throwable?) : super(msg, t)
}