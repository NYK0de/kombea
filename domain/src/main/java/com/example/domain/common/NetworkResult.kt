package com.example.domain.common

import com.example.domain.models.AppErrorUI

sealed class NetworkResult<out T>{
    data class Success<out T>(val data: T): NetworkResult<T>()
    data class Error<T>(val error: AppErrorUI): NetworkResult<T>()
    data class Loading<T>(val data: T? = null): NetworkResult<T>()
}
