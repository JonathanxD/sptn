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

import com.github.jonathanxd.kores.base.KoresParameter
import com.github.jonathanxd.kores.base.MethodDeclaration
import com.github.jonathanxd.kores.generic.GenericSignature
import com.github.jonathanxd.kores.type.Generic

open class FunctionGenerator(n: Int): FunctionalInterfaceGenerator(n) {
    override val name: String get() = "Function"

    override fun generateGenericSignature(number: Int): GenericSignature =
        GenericSignature.create(
            (0..number).map {
                Generic.type(this.genericNames[it])
            } + listOf(Generic.type("R"))
        )

    override fun generateFunction(number: Int): MethodDeclaration =
        MethodDeclaration.Builder.builder()
            .publicModifier()
            .name("apply")
            .returnType(Generic.type("R"))
            .run(::apply)
            .parameters((0..number).map {
                KoresParameter.Builder.builder()
                    .type(this.genericTypes[it])
                    .name(this.fieldNames[it])
                    .build()
            })
            .build()
}