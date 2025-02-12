/*
 * Copyright 2015-2016 Magnus Madsen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ca.uwaterloo.flix.language.phase

import ca.uwaterloo.flix.api.Flix
import ca.uwaterloo.flix.util.Options
import org.scalatest.FunSuite

class TestVerifier extends FunSuite {

  val opts: Options = Options.DefaultTest.copy(verifier = true)

  test("Belnap.flix") {
    new Flix()
      .addPath("./examples/domains/Belnap.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("Constant.flix") {
    new Flix()
      .addPath("./examples/domains/Belnap.flix")
      .addPath("./examples/domains/Constant.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("ConstantParity.flix") {
    new Flix()
      .addPath("./examples/domains/Belnap.flix")
      .addPath("./examples/domains/ConstantParity.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("ConstantSign.flix") {
    new Flix()
      .addPath("./examples/domains/Belnap.flix")
      .addPath("./examples/domains/ConstantSign.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("Parity.flix") {
    new Flix()
      .addPath("./examples/domains/Belnap.flix")
      .addPath("./examples/domains/Parity.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("Mod3.flix") {
    new Flix()
      .addPath("./examples/domains/Belnap.flix")
      .addPath("./examples/domains/Mod3.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("PrefixSuffix.flix") {
    new Flix()
      .addPath("./examples/domains/Belnap.flix")
      .addPath("./examples/domains/PrefixSuffix.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("Sign.flix") {
    new Flix()
      .addPath("./examples/domains/Belnap.flix")
      .addPath("./examples/domains/Sign.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("StrictSign.flix") {
    new Flix()
      .addPath("./examples/domains/Belnap.flix")
      .addPath("./examples/domains/StrictSign.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("Type.flix") {
    new Flix()
      .addPath("./examples/domains/Type.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("ilo/Cube.flix") {
    new Flix()
      .addPath("./examples/domains/ilo/Cube.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("ilo/InfNoAccDcc.flix") {
    new Flix()
      .addPath("./examples/domains/ilo/InfNoAccDcc.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("ilo/M2.flix") {
    new Flix()
      .addPath("./examples/domains/ilo/M2.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("ilo/M3.flix") {
    new Flix()
      .addPath("./examples/domains/ilo/M3.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("ilo/M2M3.flix") {
    new Flix()
      .addPath("./examples/domains/ilo/M2M3.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("ilo/N5.flix") {
    new Flix()
      .addPath("./examples/domains/ilo/N5.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("ilo/SubD4.flix") {
    new Flix()
      .addPath("./examples/domains/ilo/SubD4.flix")
      .setOptions(opts)
      .solve()
      .get
  }

  test("ilo/SubZ2Z4.flix") {
    new Flix()
      .addPath("./examples/domains/ilo/SubZ2Z4.flix")
      .setOptions(opts)
      .solve()
      .get
  }

}
