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
import java.util.List;

/**
 *
 * @author Aayush Atharva
 */
public class HexToDecimal {

    public BigInteger getDecimalFromHex(String Hex) {
        List<BigInteger> HexBlockDecimals = new ArrayList<>();

        String[] HexBlock = Hex.split(""); // Break Hex Into Single Blocks

        int Power = HexBlock.length - 1;

        for (String Block : HexBlock) {
            // Get Decimal Base
            String DecimalBase = DecimalBase(Block);

            // Compute Power Of Hex Block
            BigInteger power = new BigInteger("16");
            power = power.pow(Power);

            // Compute Whole Hex Block
            BigInteger BlockCompute = new BigInteger(DecimalBase);
            BlockCompute = BlockCompute.multiply(power);

            // Add Block Decimal To List
            HexBlockDecimals.add(BlockCompute);

            // Reduce Power By 1
            Power--;
        }

        // Compute Decimal Base Of All Blocks
        BigInteger ComputeDecimal = new BigInteger("0");
        for (BigInteger BlockInteger : HexBlockDecimals) {
            ComputeDecimal = ComputeDecimal.add(BlockInteger);
        }

        return ComputeDecimal;
    }

    private String DecimalBase(String Hex) {
        Hex = Hex.toUpperCase();

        switch (Hex) {
            case "0":
                return "0";
            case "1":
                return "1";
            case "2":
                return "2";
            case "3":
                return "3";
            case "4":
                return "4";
            case "5":
                return "5";
            case "6":
                return "6";
            case "7":
                return "7";
            case "8":
                return "8";
            case "9":
                return "9";
            case "A":
                return "10";
            case "B":
                return "11";
            case "C":
                return "12";
            case "D":
                return "13";
            case "E":
                return "14";
            case "F":
                return "15";
            default:
                break;
        }

        return null;
    }
}
