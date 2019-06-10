/* 
 * Copyright (C) 2019 Aayush Atharva
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aayushatharva.hexdecimal;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Aayush Atharva
 */
public class DecimalToHex {

    public String DecimalToHex(BigInteger Decimal) {
        List<String> HexBlock = new ArrayList<>();

        int QuotientLeft;

        BigInteger DecimalBigInteger = Decimal;

        do {
            BigInteger[] result = DecimalBigInteger.divideAndRemainder(BigInteger.valueOf(16));

            BigInteger Quotient = result[0];
            BigInteger Remainder = result[1];

            HexBlock.add(getHex(Remainder.intValue()));
            QuotientLeft = Quotient.intValue();

            DecimalBigInteger = Quotient;
        } while (QuotientLeft != 0);

        // Reverse the Arraylist
        Collections.reverse(HexBlock);

        StringBuilder ComputedHex = new StringBuilder();

        for (String Hex : HexBlock) {
            ComputedHex.append(Hex);
        }

        return ComputedHex.toString();
    }

    private String getHex(int Decimal) {

        switch (Decimal) {
            case 0:
                return DECIMAL_0;
            case 1:
                return DECIMAL_1;
            case 2:
                return DECIMAL_2;
            case 3:
                return DECIMAL_3;
            case 4:
                return DECIMAL_4;
            case 5:
                return DECIMAL_5;
            case 6:
                return DECIMAL_6;
            case 7:
                return DECIMAL_7;
            case 8:
                return DECIMAL_8;
            case 9:
                return DECIMAL_9;
            case 10:
                return DECIMAL_10;
            case 11:
                return DECIMAL_11;
            case 12:
                return DECIMAL_12;
            case 13:
                return DECIMAL_13;
            case 14:
                return DECIMAL_14;
            case 15:
                return DECIMAL_15;
            case 16:
                return DECIMAL_16;
            case 17:
                return DECIMAL_17;
            case 18:
                return DECIMAL_18;
            case 19:
                return DECIMAL_19;
            case 20:
                return DECIMAL_20;
            case 21:
                return DECIMAL_21;
            case 22:
                return DECIMAL_22;
            case 23:
                return DECIMAL_23;
            case 24:
                return DECIMAL_24;
            case 25:
                return DECIMAL_25;
            case 26:
                return DECIMAL_26;
            case 27:
                return DECIMAL_27;
            case 28:
                return DECIMAL_28;
            case 29:
                return DECIMAL_29;
            case 30:
                return DECIMAL_30;
            case 40:
                return DECIMAL_40;
            case 50:
                return DECIMAL_50;
            case 60:
                return DECIMAL_60;
            case 70:
                return DECIMAL_70;
            case 80:
                return DECIMAL_80;
            case 90:
                return DECIMAL_90;
            case 100:
                return DECIMAL_100;
            case 200:
                return DECIMAL_200;
            case 1000:
                return DECIMAL_1000;
            case 2000:
                return DECIMAL_2000;
            default:
                break;
        }

        return null;
    }

    private static final String DECIMAL_0 = "0";
    private static final String DECIMAL_1 = "1";
    private static final String DECIMAL_2 = "2";
    private static final String DECIMAL_3 = "3";
    private static final String DECIMAL_4 = "4";
    private static final String DECIMAL_5 = "5";
    private static final String DECIMAL_6 = "6";
    private static final String DECIMAL_7 = "7";
    private static final String DECIMAL_8 = "8";
    private static final String DECIMAL_9 = "9";

    private static final String DECIMAL_10 = "A";
    private static final String DECIMAL_11 = "B";
    private static final String DECIMAL_12 = "C";
    private static final String DECIMAL_13 = "D";
    private static final String DECIMAL_14 = "E";
    private static final String DECIMAL_15 = "F";

    private static final String DECIMAL_16 = "10";
    private static final String DECIMAL_17 = "11";
    private static final String DECIMAL_18 = "12";
    private static final String DECIMAL_19 = "13";
    private static final String DECIMAL_20 = "14";
    private static final String DECIMAL_21 = "15";
    private static final String DECIMAL_22 = "16";
    private static final String DECIMAL_23 = "17";
    private static final String DECIMAL_24 = "18";
    private static final String DECIMAL_25 = "19";

    private static final String DECIMAL_26 = "1A";
    private static final String DECIMAL_27 = "1B";
    private static final String DECIMAL_28 = "1C";
    private static final String DECIMAL_29 = "1D";
    private static final String DECIMAL_30 = "1F";

    private static final String DECIMAL_40 = "28";
    private static final String DECIMAL_50 = "32";

    private static final String DECIMAL_60 = "3C";

    private static final String DECIMAL_70 = "46";
    private static final String DECIMAL_80 = "50";

    private static final String DECIMAL_90 = "5A";

    private static final String DECIMAL_100 = "64";

    private static final String DECIMAL_200 = "C8";
    private static final String DECIMAL_1000 = "3E8";
    private static final String DECIMAL_2000 = "7D0";
}
