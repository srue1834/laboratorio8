package com.example.laboratorio8.network

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Noticia_autor (
        val fecha: String,
        val titulo: String,
        val autor: String,
        val puntos: Int) :

    Parcelable
