package org.ensime

import sbt._
import Keys._

object Plugin extends sbt.Plugin {
  override lazy val settings = Seq(commands ++= Seq(EnsimeCommand.ensime))
}
