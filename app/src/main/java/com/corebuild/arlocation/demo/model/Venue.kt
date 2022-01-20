package com.corebuild.arlocation.demo.model

import com.google.gson.annotations.SerializedName

data class Venue(
    @SerializedName("name")
    val name: String,
    @SerializedName("address")
    val address: String,
    @SerializedName("lat")
    val lat: String,
    @SerializedName("long")
    val long: String,
    @SerializedName("icon")
    val iconURL: String
)

data class VenueData(
    val categories: List<Category>,
    val hasPerk: Boolean,
    val id: String,
    val location: Location,
    val name: String,
    val referralId: String
)

data class Category(
    val icon: Icon,
    val id: String,
    val name: String,
    val pluralName: String,
    val primary: Boolean,
    val shortName: String
)

data class Location(
    val address: String,
    val cc: String,
    val city: String,
    val country: String,
    val distance: Int,
    val formattedAddress: List<String>,
    val labeledLatLngs: List<LabeledLatLng>,
    val lat: Double,
    val lng: Double,
    val state: String
)

data class Icon(
    val prefix: String,
    val suffix: String
)

data class LabeledLatLng(
    val label: String,
    val lat: Double,
    val lng: Double
)