/*
 * Copyright (c) 2021. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot.intern.layer.geom

import jetbrains.letsPlot.intern.Options
import jetbrains.letsPlot.intern.layer.OptionsCapsule

interface YDotplotAesthetics : OptionsCapsule {
    val x: Any?
    val y: Any?
    val binWidth: Any?
    val stackSize: Any?

    val alpha: Any?
    val color: Any?
    val fill: Any?
    val size: Any?

    override fun seal() = Options.of(
        "x" to x,
        "y" to y,
        "binwidth" to binWidth,
        "stacksize" to stackSize,
        "alpha" to alpha,
        "color" to color,
        "fill" to fill,
        "size" to size,
    )
}