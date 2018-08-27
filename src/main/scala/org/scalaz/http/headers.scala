package org.scalaz.http

final case class Header(name: String, value: String)

trait Headers {

  def accept[A](value: String): Endpoint[A]

}
