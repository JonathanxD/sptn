/**
 *      sptn - Provides utility for multiple data in single container, such as Pair and Triple.
 *
 *         The MIT License (MIT)
 *
 *      Copyright (c) 2021 JonathanxD <https://github.com/JonathanxD/sptn>
 *      Copyright (c) contributors
 *
 *
 *      Permission is hereby granted, free of charge, to any person obtaining a copy
 *      of this software and associated documentation files (the "Software"), to deal
 *      in the Software without restriction, including without limitation the rights
 *      to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *      copies of the Software, and to permit persons to whom the Software is
 *      furnished to do so, subject to the following conditions:
 *
 *      The above copyright notice and this permission notice shall be included in
 *      all copies or substantial portions of the Software.
 *
 *      THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *      IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *      FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *      AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *      LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *      OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *      THE SOFTWARE.
 */
package com.github.jonathanxd.sptn

import com.github.jonathanxd.kores.Types
import com.github.jonathanxd.kores.base.*
import com.github.jonathanxd.kores.base.Annotation
import com.github.jonathanxd.kores.base.Retention
import com.github.jonathanxd.kores.base.comment.Comments
import com.github.jonathanxd.kores.base.comment.Link
import com.github.jonathanxd.kores.base.comment.Plain
import com.github.jonathanxd.kores.generic.GenericSignature
import com.github.jonathanxd.kores.type.Generic
import com.github.jonathanxd.kores.type.PlainKoresType

class CheckedOperatorGenerator(n: Int): OperatorGenerator(n) {
    override val packagee: String get() = "com.github.jonathanxd.sptn.function.checked"
    override val name: String get() = "CheckedOperator"

    override fun apply(number: Int, i: InterfaceDeclaration.Builder): InterfaceDeclaration.Builder =
        i.implementations(
            Generic.type(PlainKoresType(CheckedFunctionGenerator(number + 1).typeNames[number], false)).of(*(0..number + 1).map { Generic.type("T") }.toTypedArray())
        )

    override fun apply(m: MethodDeclaration.Builder): MethodDeclaration.Builder =
        m.throwsClause(Types.THROWABLE)
}