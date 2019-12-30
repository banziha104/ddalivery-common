package com.lyj.ddalivery.ddalivery.exception.auth



class UsernameNotFoundException : RuntimeException {
    constructor() : super("Identity is NULL") {}
    constructor(msg: String?) : super(msg) {}
    constructor(msg: String?, t: Throwable?) : super(msg, t) {}
}