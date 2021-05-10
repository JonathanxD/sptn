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
package com.github.jonathanxd.sptn.tuple;

import com.github.jonathanxd.sptn.tuple.Tuple18;
import com.github.jonathanxd.sptn.tuple.Tuple16;
import java.util.Objects;

/**
 * Class generated by <a href="https://github.com/JonathanxD/sptn">sptn</a>
 */
public class Tuple17<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17> {

    private final T1 data1;
    private final T2 data2;
    private final T3 data3;
    private final T4 data4;
    private final T5 data5;
    private final T6 data6;
    private final T7 data7;
    private final T8 data8;
    private final T9 data9;
    private final T10 data10;
    private final T11 data11;
    private final T12 data12;
    private final T13 data13;
    private final T14 data14;
    private final T15 data15;
    private final T16 data16;
    private final T17 data17;

    public Tuple17(T1 data1, T2 data2, T3 data3, T4 data4, T5 data5, T6 data6, T7 data7, T8 data8, T9 data9, T10 data10, T11 data11, T12 data12, T13 data13, T14 data14, T15 data15, T16 data16, T17 data17) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.data7 = data7;
        this.data8 = data8;
        this.data9 = data9;
        this.data10 = data10;
        this.data11 = data11;
        this.data12 = data12;
        this.data13 = data13;
        this.data14 = data14;
        this.data15 = data15;
        this.data16 = data16;
        this.data17 = data17;
    }

    public static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17> Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> of(T1 data1, T2 data2, T3 data3, T4 data4, T5 data5, T6 data6, T7 data7, T8 data8, T9 data9, T10 data10, T11 data11, T12 data12, T13 data13, T14 data14, T15 data15, T16 data16, T17 data17) {
        return new Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(data1, data2, data3, data4, data5, data6, data7, data8, data9, data10, data11, data12, data13, data14, data15, data16, data17);
    }

    public T1 get1() {
        return this.data1;
    }

    public T1 component1() {
        return this.data1;
    }

    public T2 get2() {
        return this.data2;
    }

    public T2 component2() {
        return this.data2;
    }

    public T3 get3() {
        return this.data3;
    }

    public T3 component3() {
        return this.data3;
    }

    public T4 get4() {
        return this.data4;
    }

    public T4 component4() {
        return this.data4;
    }

    public T5 get5() {
        return this.data5;
    }

    public T5 component5() {
        return this.data5;
    }

    public T6 get6() {
        return this.data6;
    }

    public T6 component6() {
        return this.data6;
    }

    public T7 get7() {
        return this.data7;
    }

    public T7 component7() {
        return this.data7;
    }

    public T8 get8() {
        return this.data8;
    }

    public T8 component8() {
        return this.data8;
    }

    public T9 get9() {
        return this.data9;
    }

    public T9 component9() {
        return this.data9;
    }

    public T10 get10() {
        return this.data10;
    }

    public T10 component10() {
        return this.data10;
    }

    public T11 get11() {
        return this.data11;
    }

    public T11 component11() {
        return this.data11;
    }

    public T12 get12() {
        return this.data12;
    }

    public T12 component12() {
        return this.data12;
    }

    public T13 get13() {
        return this.data13;
    }

    public T13 component13() {
        return this.data13;
    }

    public T14 get14() {
        return this.data14;
    }

    public T14 component14() {
        return this.data14;
    }

    public T15 get15() {
        return this.data15;
    }

    public T15 component15() {
        return this.data15;
    }

    public T16 get16() {
        return this.data16;
    }

    public T16 component16() {
        return this.data16;
    }

    public T17 get17() {
        return this.data17;
    }

    public T17 component17() {
        return this.data17;
    }

    public <T18> Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> plus(T18 data18) {
        return Tuple18.of(this.get1(), this.get2(), this.get3(), this.get4(), this.get5(), this.get6(), this.get7(), this.get8(), this.get9(), this.get10(), this.get11(), this.get12(), this.get13(), this.get14(), this.get15(), this.get16(), this.get17(), data18);
    }

    public Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> minus() {
        return Tuple16.of(this.get1(), this.get2(), this.get3(), this.get4(), this.get5(), this.get6(), this.get7(), this.get8(), this.get9(), this.get10(), this.get11(), this.get12(), this.get13(), this.get14(), this.get15(), this.get16());
    }

    public String toString() {
        return "Tuple17" + "(" + "1 = '" + this.get1() + "'" + ", " + "2 = '" + this.get2() + "'" + ", " + "3 = '" + this.get3() + "'" + ", " + "4 = '" + this.get4() + "'" + ", " + "5 = '" + this.get5() + "'" + ", " + "6 = '" + this.get6() + "'" + ", " + "7 = '" + this.get7() + "'" + ", " + "8 = '" + this.get8() + "'" + ", " + "9 = '" + this.get9() + "'" + ", " + "10 = '" + this.get10() + "'" + ", " + "11 = '" + this.get11() + "'" + ", " + "12 = '" + this.get12() + "'" + ", " + "13 = '" + this.get13() + "'" + ", " + "14 = '" + this.get14() + "'" + ", " + "15 = '" + this.get15() + "'" + ", " + "16 = '" + this.get16() + "'" + "17 = '" + this.get17() + "'" + ")";
    }

    public boolean equals(Object other) {
        if (!(other instanceof Tuple17)) {
            return false;
        }
        Tuple17<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> otherTuple = (Tuple17<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>)other;
        return (Objects.equals(this.get1(), otherTuple.get1()) && Objects.equals(this.get2(), otherTuple.get2()) && Objects.equals(this.get3(), otherTuple.get3()) && Objects.equals(this.get4(), otherTuple.get4()) && Objects.equals(this.get5(), otherTuple.get5()) && Objects.equals(this.get6(), otherTuple.get6()) && Objects.equals(this.get7(), otherTuple.get7()) && Objects.equals(this.get8(), otherTuple.get8()) && Objects.equals(this.get9(), otherTuple.get9()) && Objects.equals(this.get10(), otherTuple.get10()) && Objects.equals(this.get11(), otherTuple.get11()) && Objects.equals(this.get12(), otherTuple.get12()) && Objects.equals(this.get13(), otherTuple.get13()) && Objects.equals(this.get14(), otherTuple.get14()) && Objects.equals(this.get15(), otherTuple.get15()) && Objects.equals(this.get16(), otherTuple.get16()) && Objects.equals(this.get17(), otherTuple.get17()));
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.get1(), this.get2(), this.get3(), this.get4(), this.get5(), this.get6(), this.get7(), this.get8(), this.get9(), this.get10(), this.get11(), this.get12(), this.get13(), this.get14(), this.get15(), this.get16(), this.get17()});
    }
}
