/*
 * Copyright (C) 2020 Aayush Atharva
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
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            case 16:
                return "10";
            case 17:
                return "11";
            case 18:
                return "12";
            case 19:
                return "13";
            case 20:
                return "14";
            case 21:
                return "15";
            case 22:
                return "16";
            case 23:
                return "17";
            case 24:
                return "18";
            case 25:
                return "19";
            case 26:
                return "1A";
            case 27:
                return "1B";
            case 28:
                return "1C";
            case 29:
                return "1D";
            case 30:
                return "1F";
            case 40:
                return "28";
            case 50:
                return "32";
            case 60:
                return "3C";
            case 70:
                return "46";
            case 80:
                return "50";
            case 90:
                return "5A";
            case 100:
                return "64";
            case 200:
                return "C8";
            case 1000:
                return "3E8";
            case 2000:
                return "7D0";
            default:
                break;
        }

        return null;
    }
}
