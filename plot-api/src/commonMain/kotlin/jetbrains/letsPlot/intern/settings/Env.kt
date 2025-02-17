/*
 * Copyright (c) 2022. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot.intern.settings

internal expect object Env {
    fun get(name: String): String?
    fun getBool(name: String): Boolean?
}
