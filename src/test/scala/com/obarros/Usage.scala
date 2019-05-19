package com.obarros

import scalaprops.{Property, Scalaprops}

object Usage extends Scalaprops {

  val testDoNothing =
// #do-nothing
    Property.forAll { x: Int =>
      Example.doNothing(x) == x
    }
// #do-nothing

}
