package com.mh.vezdekod21final.trimmer.interfaces

import android.net.Uri

interface OnCompressVideoListener {
    fun onCompressStarted()
    fun getResult(uri: Uri)
    fun onError(message: String)
}