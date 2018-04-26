package places

import argonaut.Argonaut.{casecodec1, casecodec6}
import argonaut.CodecJson

case class PlaceResponse(results: List[Place])

object PlaceResponse {
  implicit def PlaceResponseJson: CodecJson[PlaceResponse] =
    casecodec1(PlaceResponse.apply, PlaceResponse.unapply)("results")
}

object Place {
  implicit def PlaceCodecJson: CodecJson[Place] =
    casecodec6(Place.apply, Place.unapply)("id", "name", "price_level", "rating", "vicinity", "types")
}

case class Place(id: String,
                 name: String,
                 price_level: Option[Int],
                 rating: Float,
                 vicinity: String,
                 types: List[String])