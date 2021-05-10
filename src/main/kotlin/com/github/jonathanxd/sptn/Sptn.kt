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

import com.github.jonathanxd.kores.base.ClassDeclaration
import com.github.jonathanxd.kores.base.InterfaceDeclaration
import com.github.jonathanxd.kores.source.process.PlainSourceGenerator
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main(args: Array<String>) {
    val workDir = System.getProperty("user.dir")
    val path = Paths.get(workDir).resolve(args[0])
    val generators = listOf(
        TupleGenerator(32),
        FunctionGenerator(32),
        CheckedFunctionGenerator(32),
        ConsumerGenerator(32),
        CheckedConsumerGenerator(32),
        PredicateGenerator(32),
        CheckedPredicateGenerator(32),
        OperatorGenerator(32),
        CheckedOperatorGenerator(32),
    )

    val sourceGenerator = PlainSourceGenerator()

    generators.forEach {
        it.generate {
            val package_ = it.packageName.replace(".", "/")
            val location = path.resolve(package_)
            val source = sourceGenerator.process(it)

            val fileLocation = location.resolve("${it.simpleName}.java")
            Files.createDirectories(location)
            Files.deleteIfExists(fileLocation)
            Files.write(fileLocation, source.toByteArray(), StandardOpenOption.CREATE, StandardOpenOption.WRITE)
        }
    }
}